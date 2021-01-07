filas <- 6000
# Lectura del CSV
columnas<-c("NULL","NULL","character","numeric","NULL","character","NULL","numeric","numeric","character","NULL","character","character",rep("NULL",76))
csv <- read.csv("Fifa\\fifa19.csv",head=T,sep=",",encoding = "UTF-8",colClasses=columnas,nrows=filas)
csv
# Lectura del JSON
install.packages("jsonlite")
library("jsonlite")
json<-read_json("Fifa\\fifa19.json", simplifyVector=TRUE)
json<- json[-((filas+1):19000), -c(1,2,5,7,11,14:89)]
json
# Lectura del Excel
install.packages("readxl")
library("readxl")
excel <- read_excel("Fifa\\fifa19.xlsx", n_max=filas)
excel<- excel[, -c(1,2,5,7,11,14:89)]
excel
# Obtencion de las variables
edades <- excel$Age
equipos <- json$Club
nacionalidades <-csv$Nationality
puntuaciones <- csv$Overall
# Frecuencias
frecAbsEdad<-table(edades )
frecAbsEdad
fAbsAcumEdad<-cumsum(frecAbsEdad)
fAbsAcumEdad
frecRelEdad<-table(edades )/length(edades )
frecRelEdad
fRelAcumEdad<-cumsum(frecRelEdad)
fRelAcumEdad

frecAbsEquipos<-table(equipos)
frecAbsEquipos
fAbsAcumEquipos<-cumsum(frecAbsEquipos)
frecRelEquipos<-table(equipos )/length(equipos )
frecRelEquipos
# Graficos
hist(edades, col = "orange", main = "Histograma de edades",
     xlab = "Edades", ylab = "Frecuencia")
barplot(frecAbsEquipos,col = "blue", main = "Frecuencias de equipos",  xlab = "Equipos", ylab = "Jugadores")


# Medidas de centralizacion
# Medias aritmeticas
mediaEdad <- mean(edades )
mediaPuntos <- mean(puntuaciones )
# Agrupadas
aggregate(csv[, c(2,4,5)], list(equipos), mean)
aggregate(csv[, c(2,4,5)], list(nacionalidades), mean)
# Con clases
clases <- cut(edades, breaks = c(10,20,30,40,50))
mediaClases <- tapply(puntuaciones, list(clases ), mean)
mediaClases 
mediaEquipos <- tapply(puntuaciones, list(equipos,clases ), mean)
mediaEquipos 
# Graficos
plot(
        seq(15, 45, by= 10),
        mediaClases,
        type="b",
        col="red",
        main="Medias",
        xlab="Clases",
        ylab="Puntuaciones")
points(mediaEdad,mediaPuntos,pch=24,col="blue",bg="blue")
text(mediaEdad,mediaPuntos, labels="Media de edad y puntuaci�n", cex= 0.7, pos=4)

# Moda
moda <- function(v) {
   uniqv <- unique(v)
   uniqv[which.max(tabulate(match(v, uniqv)))]
}
moda(puntuaciones)
moda(nacionalidades )
moda(equipos)
equipos<-equipos[equipos != ""]
moda(equipos)
# Cuantiles
mediana <- median(puntuaciones)
mediana 
cuartiles <- quantile(puntuaciones,seq(0,1, by=0.25))
cuartiles 
deciles<-quantile(puntuaciones, probs = seq(0, 1, by= 0.1))
deciles
# Graficos
boxplot(puntuaciones, col="orange", 
        main = "Cuantiles de puntuaciones",
        ylab = "Puntuaciones")

# Medidas de dispersion
# Rango
rangoEdades<-(max(edades )-min(edades ))
rangoEdades
rangoPuntuaciones<-(max(puntuaciones )-min(puntuaciones ))
rangoPuntuaciones
# Rango intercuartilico
rangoInterC <- IQR(edades)
rangoInterC
# Desviacion estandar
desviacionEdades <- sd(edades)
desviacionEdades 
desviacionPuntos <- sd(puntuaciones)
desviacionPuntos 
# Desviaciones agrupadas
aggregate(csv[, c(2,4,5)], list(nacionalidades), sd)
# Varianza
varianzaEdades <- var(edades)
varianzaEdades 
var(puntuaciones)
# Coeficiente de variacion
coefVariacion <- desviacionEdades/mediaEdad
coefVariacion
# Covarianza
covarianza<-cov(edades, puntuaciones)  
covarianza
# Coeficiente de correlacion
cor(edades, puntuaciones)
