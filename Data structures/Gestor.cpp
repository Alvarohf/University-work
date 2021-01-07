#include "Gestor.hpp"
#include <Cola.hpp>
#include <iostream>
#include <iomanip>
#include "windows.h"
using namespace std;
Gestor::Gestor()
{
}

Gestor::~Gestor()
{
}
//Genera un cliente de forma aleatoria
void Gestor::GenerarCliente(bool reg)
{
	Cliente cliente;
	//Genera un DNI, tiempo e ID
	cliente.CalcularDNI();
	cliente.GenerarTiempoCompra();
	cliente.GenerarIdentificador();
	//Segun el valor de reg esta o no registrado
	cliente.registro(reg);
	if (reg)
	{
		//Inserta al cliente en la cola dependiendo de si esta vacia o no
		if(colaVIP.esVacia())
			{
			cliente.GenerarHoraLlegada(0);
			colaVIP.insertar(cliente);
			}
		else
		{
		cliente.GenerarHoraLlegada(colaVIP.ultimo->cliente.horaCompra);
		colaVIP.insertar(cliente);
		}
	}
	else 
		{
		//Inserta al cliente en la cola dependiendo de si esta vacia o no
		if(colaNoReg.esVacia())
			{
			cliente.GenerarHoraLlegada(120);
			colaNoReg.insertar(cliente);
			}
		else
		{
		cliente.GenerarHoraLlegada(colaNoReg.ultimo->cliente.horaCompra);
		colaNoReg.insertar(cliente);
		}
	}
}
//Genera 15 solicitudes vip y devuelve el valor
int Gestor::GenerarSolicitudesVIP()
{	
	int cont = 0;
	for (int i = 0; i<15;i++){
		GenerarCliente(true);
		cont+=1;
		}
	return cont;
}
//Genera 25 solicitudes de no registrados y devuelve el valor
int Gestor::GenerarSolicitudesNoReg()
{
	int cont = 0;
	for (int i = 0; i<25;i++){
		GenerarCliente(false);
		cont+=1;
	}
	return cont;
}
//Muestra los clientes de la cola vip
void Gestor::MostrarColaVIP(int vip)
{	
	Cliente cliente;
	//Nos aseguramos que no este vacía
	if (colaVIP.esVacia())
		{
		cout<< "No hay ningun cliente generado.";
		}
	else 
		{
		//Al ser una cola hay que ir desencolando y encolando
		for (int i = 0; i<vip;i++)
			{
			cliente =colaVIP.eliminar();
			cliente.mostrarDatos();
			colaVIP.insertar(cliente);
			}
		}
}
//Muestra los clientes de la cola no registrados
void Gestor::MostrarColaNoReg(int noreg)
{	
	Cliente cliente;
	//Nos aseguramos que no este vacía
	if (colaNoReg.esVacia())
		{
		cout<< "No hay ningun cliente generado.";
		}
	else 
		{
		//Al ser una cola hay que ir desencolando y encolando
		for (int i = 0; i<noreg;i++)
			{
			cliente =colaNoReg.eliminar();
			cliente.mostrarDatos();
			colaNoReg.insertar(cliente);
			}
		}
}
//Borra todas las solicitudes VIP
void Gestor::BorrarSolicitudesVIP()
{
	while (!colaVIP.esVacia())
		{
		colaVIP.eliminar();
		}
}
//Borra todas las solicitudes de no registrados
void Gestor::BorrarSolicitudesNoReg()
{
	while (!colaNoReg.esVacia())
		{
		colaNoReg.eliminar();
		}
}
//Simula la compra de entradas VIP
void Gestor::SimularCompraVIP(int vip)
{	HANDLE hConsole= GetStdHandle(STD_OUTPUT_HANDLE);
	Cliente cliente;
	//Declaración de variables locales
	int i =0;
	int nservidor= 0;
	int ncola=0;
	int hora=colaVIP.primero->cliente.horaCompra;
	int tiempo=0;
	//Mostramos la cola VIP antes de entrar al bucle
	MostrarColaVIP(vip);
    while(!colaVIP.esVacia()||!servidorVIP.esVacia()){
		SetConsoleTextAttribute(hConsole, 10);
        system("cls");
        cout << "\n\t--------------\n";
        cout << "\t hora: " << setw(3) << i << "    \n";
        cout << "\t--------------\n";
		SetConsoleTextAttribute(hConsole, 112);
		cout << "\t---- Clientes VIP ----\n";
		SetConsoleTextAttribute(hConsole, 7);
		//Mientras la hora sea la misma siguen entrando al servidor
		while ((i==hora)&&(!colaVIP.esVacia()))
			{
			//Se elimina de la cola y se añade al servidor
			servidorVIP.insertar(colaVIP.eliminar());
			//Incrementa los contadores necesarios para mostrar las colas
			ncola++;
			nservidor++;
			//Si no esta vacia volvemos a comprobar si coincide con la hora
			if (!colaVIP.esVacia())
				hora=colaVIP.primero->cliente.horaCompra;
			}
		//Muestra la cola en cada instante de tiempo
		 MostrarColaVIP(vip-ncola);
		 SetConsoleTextAttribute(hConsole, 112);
		 cout << "\n\t-----Clientes en el servidor-----\n";
		 SetConsoleTextAttribute(hConsole, 7);
		if (!servidorVIP.esVacia())
			{
			//Elimina del servidor a los clientes cuando llega su tiempo
			if (tiempo==servidorVIP.primero->cliente.tiempoCompra)
				{
				entradasVendidas.insertarOrden(servidorVIP.eliminar());
                tiempo=0;
				nservidor--;
				//Si no esta vacio se tiene en cuenta que ha estado 1 seg mas
				if (!servidorVIP.esVacia())
					tiempo=1;
                }
			else
				{
				tiempo++;
				}
			}
			//Mostramos los clientes del servidor
			for (int k = 0; k<nservidor;k++)
				{
				cliente =servidorVIP.eliminar();
				cliente.mostrarDatos();
				servidorVIP.insertar(cliente);
				}
			SetConsoleTextAttribute(hConsole, 112);
			cout << "\n\t -----Entradas vendidas----- \n";
			SetConsoleTextAttribute(hConsole, 7);
			//Muestra la lista de entradas vendidas
			entradasVendidas.mostrarLista();
		i++;
		Sleep(1000);
    }
}
//Elimina de los servidores no registrados los clientes cuando acaban
void Gestor::calcularTiempos()
	{
	//Comprobamos que el primer servidor no este vacio
	if (!ServidorNR1.esVacia())
		{
		if (tiempos[0]==ServidorNR1.primero->cliente.tiempoCompra)
			{
			//Eliminamos el cliente y lo añadimos a la lista
			entradasVendidas.insertarOrden(ServidorNR1.eliminar());
			serv[0]--;
			tiempos[0]=0;
			//Se tiene en cuenta si ya habia algun cliente dentro
			if (!ServidorNR1.esVacia())
				tiempos[0]=1;
			}
		else
			{
			tiempos[0]++;
			}
		}
	//Comprobamos que el segundo servidor no este vacio
	if (!ServidorNR2.esVacia())
		{
		if (tiempos[1]==ServidorNR2.primero->cliente.tiempoCompra)
			{
			//Eliminamos el cliente y lo añadimos a la lista
			entradasVendidas.insertarOrden(ServidorNR2.eliminar());
			serv[1]--;
			tiempos[1]=0;
			//Se tiene en cuenta si ya habia algun cliente dentro
			if (!ServidorNR2.esVacia())
				tiempos[1]=1;
			}
		else
			{
			tiempos[1]++;
			}
		}
	//Comprobamos que el tercer servidor no este vacio
	if (!ServidorNR3.esVacia())
		{
		if (tiempos[2]==ServidorNR3.primero->cliente.tiempoCompra)
			{
			//Eliminamos el cliente y lo añadimos a la lista
			entradasVendidas.insertarOrden(ServidorNR3.eliminar());
			serv[2]--;
			tiempos[2]=0;
			//Se tiene en cuenta si ya habia algun cliente dentro
			if (!ServidorNR3.esVacia())
				tiempos[2]=1;
			}
		else
			{
			tiempos[2]++;
			}
		}
	//Comprobamos que el cuarto servidor no este vacio
	if (!ServidorNR4.esVacia())
		{
		if (tiempos[3]==ServidorNR4.primero->cliente.tiempoCompra)
			{
			//Eliminamos el cliente y lo añadimos a la lista
			entradasVendidas.insertarOrden(ServidorNR4.eliminar());
			serv[3]--;
			tiempos[3]=0;
			//Se tiene en cuenta si ya habia algun cliente dentro
			if (!ServidorNR4.esVacia())
				tiempos[3]=1;
			}
		else
			{
			tiempos[3]++;
			}
		}
	}
//Simula la compra de entradas de no registrados
void Gestor::SimularCompraNoReg(int noreg)
{
	Cliente cliente;
	HANDLE hConsole= GetStdHandle(STD_OUTPUT_HANDLE);
	int i =120;
	int ncola=0;
	int hora=colaNoReg.primero->cliente.horaCompra;
	//Muestra la cola
	MostrarColaNoReg(noreg);
	//Mientras no esten la cola y servidores vacíos no acaba
    while(!ServidorNR1.esVacia()||!ServidorNR2.esVacia()||!ServidorNR3.esVacia()||!ServidorNR4.esVacia()||!colaNoReg.esVacia()){
        system("cls");
		SetConsoleTextAttribute(hConsole, 10);
		cout << "\n\t--------------\n";
        cout << "\t hora: " << setw(3) << i << "    \n";
        cout << "\t--------------\n";
		SetConsoleTextAttribute(hConsole, 112);
		cout << "\t\t---- Clientes No registrados ----\n";
		SetConsoleTextAttribute(hConsole, 7);
		//Mientras la hora sea la misma siguen entrando a los servidores
		while ((i==hora)&&(!colaNoReg.esVacia()))
			{
			//Se llama a la función que elige el servidor
			servidores(colaNoReg.eliminar());
			ncola++;
			//Se vuelve a calcular la hora por si entran varios a la vez
			if (!colaNoReg.esVacia())
				hora=colaNoReg.primero->cliente.horaCompra;
			}
		//Mostramos la cola de no registrados
		MostrarColaNoReg(noreg-ncola);
		//Eliminamos y añadimos clientes a la lista segun el tiempo
		calcularTiempos();
		SetConsoleTextAttribute(hConsole, 112);
		cout <<"\n\t\t|Servidor 1| \n";
		SetConsoleTextAttribute(hConsole, 7);
		//Muestra los clientes  del servidor 1
		for (int k = 0; k<serv[0];k++)
			{
			cliente =ServidorNR1.eliminar();
			cliente.mostrarDatos();
			ServidorNR1.insertar(cliente);
			}
		SetConsoleTextAttribute(hConsole, 112);
		cout <<"\n\t\t|Servidor 2| \n";
		SetConsoleTextAttribute(hConsole, 7);
		//Muestra los clientes  del servidor 2
		for (int k = 0; k<serv[1];k++)
			{
			cliente =ServidorNR2.eliminar();
			cliente.mostrarDatos();
			ServidorNR2.insertar(cliente);
			}
		SetConsoleTextAttribute(hConsole, 112);
		cout <<"\n\t\t|Servidor 3| \n";
		SetConsoleTextAttribute(hConsole, 7);
		//Muestra los clientes  del servidor 3
		for (int k = 0; k<serv[2];k++)
			{
			cliente =ServidorNR3.eliminar();
			cliente.mostrarDatos();
			ServidorNR3.insertar(cliente);
			}
		SetConsoleTextAttribute(hConsole, 112);
		cout <<"\n\t\t|Servidor 4| \n";
		SetConsoleTextAttribute(hConsole, 7);
		//Muestra los clientes  del servidor 4
		for (int k = 0; k<serv[3];k++)
			{
			cliente =ServidorNR4.eliminar();
			cliente.mostrarDatos();
			ServidorNR4.insertar(cliente);
			}
		SetConsoleTextAttribute(hConsole, 112);
		cout << "\n\t\t -----Entradas vendidas----- \n";
		SetConsoleTextAttribute(hConsole, 7);
		//Muestra la lista de entradas vendidas
		entradasVendidas.mostrarLista();
		i++;
		Sleep(1000);
    }
}
//Elige los servidores que esten vacios o de izq a der
void Gestor::servidores(Cliente c)
	{	
		int indice =0;
		//Calcula el indice del servidor con menos clientes
		for (int i=1; i<4;i++)
			{
			if (serv[i]<serv[indice])
				{
				indice=i;
				}
			}
		//Segun el indice lo inserta en el servidor adecuado
		switch(indice){
			case 0:
			serv[0]++;
			ServidorNR1.insertar(c);
			break;
			case 1:
			ServidorNR2.insertar(c);
			serv[1]++;
			break;
			case 2:
			ServidorNR3.insertar(c);
			serv[2]++;
			break;
			default:
			ServidorNR4.insertar(c);
			serv[3]++;
			break;
			}
	}
//Muestra las entradas vendidas
void Gestor::MostrarEntradasVendidas()
{
	entradasVendidas.mostrarLista();
}

