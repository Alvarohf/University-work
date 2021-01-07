%Tiempo de muestreo
Ts=100e-3
x_0 = 0.05;
y_0=0;
obsx=2.05;
obsy=1;
th_0=0;
% Referencia x-y de posicion
refx=10*rand-5;
refy=10*rand-5;
% Ejecutar Simulacion
sim('TrajectoryFuzzy.slx')
% Mostrar
x=ans.salida_x.signals.values;
y=ans.salida_y.signals.values;
t_x=ans.t_x.signals.values;
t_y=ans.t_y.signals.values;
figure;
plot(t_x,t_y);
hold on; 
plot(x,y ,'--');
grid on;
hold on; 
plot(obsx,obsy,'r*');
title("Comparación de trayectorias")
xlabel("Eje x")
ylabel("Eje y")
legend("Control clasico","Control borroso")
hold off;
grid on;