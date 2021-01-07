%Tiempo de muestreo
Ts=100e-3
% Referencia x-y de posicion
refx=-5;
refy=5;
% Ejecutar Simulacion
sim('FuzzyRobot.slx')
% Mostrar
x=ans.salida_x.signals.values;
y=ans.salida_y.signals.values;
figure;
plot(x,y);
grid on;
hold on; 
plot(refx,refy,'*r');
grid on;
hold on; 