install.packages("rpart")
install.packages("rpart.plot")
install.packages("tree")
install.packages("ggplot2")
install.packages("randomForest")
install.packages("BayesTree")
library("rpart.plot")
library("rpart")  
library("tree")  
library("ggplot2")
library("randomForest") 
library("BayesTree")  

#Lectura de los datos de interes
columnas<-c("NULL","character","numeric","numeric","NULL","NULL","character","NULL","numeric","character","character","character","numeric",rep("NULL",6),"character","character","NULL","numeric","numeric","NULL","numeric","NULL","NULL")
peliculas <- read.csv("imdb.csv",head=T,sep=",",encoding = "UTF-8",colClasses=columnas)
#Limpiamos valores NA
peliculas<-na.omit(peliculas)
pelis<-head(peliculas,25)
mil_peliculas<-head(peliculas,1000)
head(pelis,10)

# Regresion y correlacion entre dos variables
# Regresion entre votos y puntuacion
comp<-data.frame(mil_peliculas["num_voted_users"],mil_peliculas["imdb_score"])
reg.votos.imdb = lm(imdb_score~num_voted_users,data=mil_peliculas)
plot(comp)
abline(reg.votos.imdb, col="blue")
summary(reg.votos.imdb)
# Regresion entre duracion de una pelicula y puntuacion
comp<-data.frame(mil_peliculas["duration"],mil_peliculas["imdb_score"])
reg.duracion.imdb = lm(imdb_score~duration,data=mil_peliculas)
summary(reg.duracion.imdb)
ggplot(mil_peliculas, aes(x = duration, y = imdb_score)) + 
  geom_point() +
  stat_smooth(method = "lm", col = "red")
# Regresion entre anno de publicacion y votos
comp<-data.frame(mil_peliculas["title_year"],mil_peliculas["num_voted_users"])
reg.annos.votos = lm(num_voted_users~title_year,data=mil_peliculas)
summary(reg.annos.votos)
ggplot(mil_peliculas, aes(x = title_year, y = num_voted_users)) + 
  geom_point() +
  stat_smooth(method = "lm", col = "red")

# Arbol de clasificacion (clases)
clasif.rpart=rpart(country~director_name+imdb_score+title_year,data=pelis, method="class", minsplit=1)
rpart.plot(clasif.rpart, type=4)
clasif.rpart2=rpart(country~imdb_score+title_year,data=pelis, method="class",parms = list(split="information"), minsplit=1)
rpart.plot(clasif.rpart2, type=2)

# Arbol de regresion (numerico)
anova.rpart=rpart(budget~title_year+imdb_score+num_voted_users,data=mil_peliculas, method="anova")
rpart.plot(anova.rpart, type=2)
text(anova.rpart, use.n = TRUE)
# Reglas que definen los arboles
rpart.rules(anova.rpart,style="tallw")
rpart.rules(clasif.rpart,style="tallw")

# Clasificacion con tree
clasificacion.tree = tree(budget~title_year+imdb_score+num_voted_users,data=mil_peliculas,split = "deviance")
plot(clasificacion.tree );  
text(clasificacion.tree , all=TRUE, cex=0.5)

# Clasificacion con random forest
set.seed(101)
# Preparacion datos de entrenamiento
tamano.total <- nrow(peliculas)
tamano.entreno <- round(tamano.total*0.7)
datos.indices <- sample(1:tamano.total , size=tamano.entreno)
peliculas.entreno <- peliculas[datos.indices,]
peliculas.test <- peliculas[-datos.indices,]
# Modelo de random forest
peliculas.rf = randomForest(imdb_score~title_year+budget+num_voted_users, data = peliculas.entreno)
# Muestra del modelo
plot(peliculas.rf)

# Arboles de regresion bayesianos
set.seed(99)
bartFit <- bart(pelis["num_voted_users"],as.double(pelis$imdb_score))
plot(bartFit)

# Predicciones
# Probabilidades y factores predecidos
predict(clasif.rpart, type = "prob")
predict(clasif.rpart, type = "class")
# Respuesta media para regresion
predict(anova.rpart,peliculas[2555,], type = "vector")
predict(anova.rpart,peliculas[1268,], type = "vector")
predict(anova.rpart,peliculas[1150,], type = "vector")
# Prediccion con random forest
peliculas.test[3,]
prediccion.rf <-predict(peliculas.rf, peliculas.test[3,], predict.all=TRUE)
prediccion.rf[[1]]
