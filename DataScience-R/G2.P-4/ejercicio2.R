# Carga de paquetes
install.packages("factoextra")
install.packages("Gmedian")
install.packages("dbscan")

library("factoextra")
library("cluster")
library("Gmedian")
library("dbscan")

set.seed(123)

#======================
# Preparacion de datos
#======================

# Lectura del CSV
columnas<-c("NULL","character","NULL","numeric","numeric","character","character","character","character","character","numeric","character","character","NULL","character","character","character","character",rep("NULL",4))
coches <- read.csv("cochesReducidoMediano.csv",head=T,sep=",",encoding = "UTF-8",colClasses=columnas,na.strings=c("","NA"))
cochesCompletos <-coches[complete.cases(coches), ]

# Establecimiento de limites para datos
precioMinimo <- 299
precioMaximo <- 200000
kilometrajeMinimo <- 10
kilometrajeMaximo <- 100000
cochesAjustados <- subset(cochesCompletos, cochesCompletos[ , 2] > precioMinimo & cochesCompletos[ , 2] < precioMaximo & cochesCompletos[ , 9] > kilometrajeMinimo)
nClusters <- 5
cochesAjustados <- cochesAjustados[,c(2,9)]

#===============
#    K-Means
#===============

# Calculo de centroides (Con y sin normalizar)
centroidesPrecios <- sample(precioMinimo:precioMaximo, nClusters, replace=FALSE)
centroidesKilometrajes <- sample(kilometrajeMinimo:kilometrajeMaximo, nClusters, replace=FALSE)
centroides <- matrix(c(centroidesPrecios,centroidesKilometrajes),nClusters,2)
centroides.normalizados <-matrix(c( rnorm(nClusters), rnorm(nClusters)),nClusters,2)
coches.normalizados <- scale(cochesAjustados)

# Calculo de K-means
clusters <- kmeans(cochesAjustados, centroides, 9)
clusters.normalizados <- kmeans(coches.normalizados, centroides.normalizados, 9)

# Representacion de los clusteres de kmeans
fviz_cluster(clusters.normalizados, coches.normalizados ,repel = TRUE, ellipse.type = "convex",geom = "point")
fviz_cluster(clusters, cochesAjustados ,repel = TRUE, ellipse.type = "convex",geom = "point")

#=================
# K-Medoids O PAM
#=================
pam.res <- pam(coches.normalizados, nClusters)
# Visualizacion
fviz_cluster(pam.res, geom = "point", ellipse.type = "convex")

#===============
#   K-Medians
#===============

# Calculo de K-Median
cl.kmedian <- kGmedian(head(coches.normalizados,100), ncenters=5)
# Calculo de K-Mean para comparar resultados
clusters.normalizados <- kmeans(head(coches.normalizados,100), centroides.normalizados, 10)

# Visualizacion y comparativa
par(mfrow=c(2,1))
plot(head(coches.normalizados,100), col = cl.kmedian$cluster, main="kmedian")
points(cl.kmedian$centers, col = 1:2, pch = 8, cex = 2)
plot(head(coches.normalizados,100), col = clusters.normalizados$cluster, main="kmedian")
points(clusters.normalizados$centers, col = 1:2, pch = 8, cex = 2)

#===============
#   DBSCAN
#===============

par(mfrow=c(1,1))
# Se obtiene epsilon para el DBSCAN y k = dim + 1
dbscan::kNNdistplot(coches.normalizados, k =  3)
# Epsilon coincide con la altura de la flexion de la linea
abline(h = 0.2, lty = 2)
# Se realiza el clustering con DBSCAN
res.db <- dbscan::dbscan(coches.normalizados, 0.2, 3)
# Visualizacion de los clusters
fviz_cluster(res.db, coches.normalizados, geom = "point")

