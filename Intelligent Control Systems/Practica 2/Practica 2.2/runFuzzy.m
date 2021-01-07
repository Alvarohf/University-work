%Tiempo de muestreo
Ts=100e-3
% Referencia x-y de posicion
refx=-5;
refy=5;
obsx=-1.65;
obsy=4;
% Ejecutar Simulacion
sim('FuzzyRobot.slx')
% Mostrar
x=ans.salida_x.signals.values;
y=ans.salida_y.signals.values;
figure;
plot(obsx,obsy,'r*');
hold on; 
plot(refx,refy,'go');
hold on; 
plot(x,y);
grid on;
hold on; 