clear all;
close all;
load("datos_validacion.mat")
check_angular = training(:,[1,3,12])
indices = round(linspace(1,size(training,1),1500))
check_angular = check_angular(indices,:)
check_angular(isinf(check_angular)) = 5.0
check_angular = double(check_angular)

load("datos_entrenamiento.mat")
train_angular = training(:,[1,3,12])
indices = round(linspace(1,size(training,1),1500))
train_angular = train_angular(indices,:)
train_angular(isinf(train_angular)) = 5.0
train_angular = double(train_angular)