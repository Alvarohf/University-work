# Lectura del JSON
install.packages("jsonlite")
library("jsonlite")
install.packages("arules")
library("arules")
install.packages("arulesViz")
library("arulesViz")
json<-read_json("Ingredientes.json", simplifyVector=TRUE)
datos <- json$ingredients
# Anadimos los id de las transacciones
names(datos ) <- paste("transaccion-",c(1:length(datos )), sep = "")
tipo <- function(d){
categorias <- c("mala","mediocre","normal","buena","recomendable")
tipos <- c()
for (i in 1:length(d)){
    n_aleatorio <-sample(1:length(categorias), 1)
    v<-categorias [n_aleatorio]
    tipos <- append(tipos,v)
}
tipos 
}
transacciones <- as(datos, "transactions")
transactionInfo(transacciones)[["tipo"]] <- tipo(datos)
transactionInfo(transacciones)
inspect(head(transacciones ,5))
# Asociaciones de apriori.
asociaciones <- apriori(transacciones , parameter= list(support=0.1, confidence=0.3))
inspect(asociaciones)
# Asociaciones a apriori quitando las de conjuntos vacios.
asociaciones <- apriori(transacciones , parameter= list(minlen=2, support=0.1, confidence=0.3))
inspect(asociaciones)
# Asociaciones por Eclat
candidatosECLAT <- eclat(transacciones ,parameter = list(support = 0.1, tidLists = TRUE))
image(tidLists(candidatosECLAT ))
inspect(sort(candidatosECLAT ))
asociacionesECLAT <- ruleInduction(candidatosECLAT , confidence = 0.3)
inspect(asociacionesECLAT )
# Asociaciones por Weclat (Eclat con pesos)
pesos <- runif(length(transacciones), 0.0, 1.0)
transactionInfo(transacciones)[["weight"]] <- pesos
inspect(transacciones )
image(transacciones )
eclatPeso <- weclat(transacciones , parameter = list(support = 0.1),control = list(verbose = TRUE))
inspect(sort(eclatPeso ))
asociacionesECLATPeso <- ruleInduction(eclatPeso , confidence = 0.3)
inspect(asociacionesECLATPeso )
# Reglas aplicadas a ciertos ingredientes
buscamosSal <- apriori(transacciones , parameter= list(support=0.1, confidence=0.3),appearance = list(default="lhs",rhs="salt"))
tenemosSal <- apriori(transacciones , parameter= list(support=0.1, confidence=0.3, minlen=2),appearance = list(default="rhs",lhs="salt"))
inspect(sort(buscamosSal ))
inspect(sort(tenemosSal ))
# Graficos
plot(asociaciones )
plot(asociaciones ,method="two-key plot")
plot(asociaciones , method = "graph",  engine = "htmlwidget")
plot(asociaciones , method="paracoord")
plot(asociaciones , method="paracoord", control=list(reorder=TRUE));
plot(asociaciones , measure=c("support","lift"), shading="confidence", engine='interactive');
plot(asociaciones , method="matrix3D", measure="lift");
plot(asociaciones , method="grouped");
plot(asociaciones , method="grouped", control=list(k=50));
sel = plot(asociaciones , method="grouped", engine='interactive');
