#include <ctime>
#include <iostream>
#include <iomanip>
#include "windows.h"
#include "Cliente.hpp"
#include <string>
#include <gestor.hpp>
#include <Cola.hpp>
using namespace std;

int main(int argc, char **argv)
{   //Inicializamos objetos y variables
	Gestor gestor;
	char opcion;
	int vip =0;
	int noreg =0;
	ShowWindow(GetConsoleWindow(),SW_MAXIMIZE);
	srand(time(NULL));
	
	do{
		HANDLE hConsole= GetStdHandle(STD_OUTPUT_HANDLE);
		SetConsoleTextAttribute(hConsole, 74);
		cout<<"\n\t-----------------------------------------------------\n";
		cout<<"\t                      MENU                           \n";
		cout<<"\t-----------------------------------------------------\n";
		SetConsoleTextAttribute(hConsole, 47);
		cout<<"\tNumero de clientes VIP: "<< setw(2)<<vip
			<<"\tNumero de clientes no registrados: "<<setw(2)<<noreg<<endl
			<<endl;
		SetConsoleTextAttribute(hConsole, 7);
		
		cout<<"\tA. Generar solicitudes de entradas de los clientes VIP. \n";
		cout<<"\tB. Mostrar la cola de solicitudes en espera de clientes VIP. \n";
		cout<<"\tC. Borrar la cola de solicitudes en espera de clientes VIP. \n";
		cout<<"\tD. Generar solicitudes de entradas de los clientes no registrados. \n";
		cout<<"\tE. Mostrar la cola de solicitudes en espera de clientes no registrados. \n";
		cout<<"\tF. Borrar la cola de solicitudes en espera de clientes no registrados. \n";
		cout<<"\tG. Simular el proceso de compra de entradas de los clientes VIP. \n";
		cout<<"\tH. Simular el proceso de compra de entradas de los clientes no registrados. \n";
		cout<<"\tI. Mostrar la lista de entradas vendidas. \n";
		cout<<"\tJ. Reiniciar el programa. \n";
		
		cout<<"\tS. Salir del programa. \n\n";
		cout<<"\tIndique la opcion deseada: ";
		cin>>opcion;
		opcion=toupper(opcion);
		system("cls");
		
		
		switch(opcion){
		case 'A':
			vip =vip + gestor.GenerarSolicitudesVIP();
			break;
		case 'B':
			gestor.MostrarColaVIP(vip);
			break;
		case 'C':
			gestor.BorrarSolicitudesVIP();
			vip=0;
			cout << "\n\tClientes VIP eliminados correctamente.\n";
			break;
		case 'D':
			noreg = noreg +gestor.GenerarSolicitudesNoReg();
			break;
		case 'E':
			gestor.MostrarColaNoReg(noreg);
			break;
		case 'F':
			gestor.BorrarSolicitudesNoReg();
			noreg=0;
			cout << "\n\tClientes no registrados eliminados correctamente.\n";
			break;
		case 'G':
			if (vip!=0)
			{
				gestor.SimularCompraVIP(vip);
				vip=0;
			}
			else 
				cout <<"\n No hay clientes VIP para simular la compra\n";
			break;
		case 'H':
			if (noreg!=0)
				{
				gestor.SimularCompraNoReg(noreg);
				noreg=0;
				}
			else 
				cout <<"\n No hay clientes no registrados para simular la compra\n";
			break;
		case 'I':
			gestor.MostrarEntradasVendidas();
			break;
		case 'J':
			gestor= Gestor();
			vip=0;
			noreg=0;
			break;
		case 'S':
			cout<<"Saliendo del programa...\n";
			break;
		default:
			cout<<"Opcion incorrecta!\n\n";
			break;
		}
	}	while(opcion !='S');
	
	return 0;
}
