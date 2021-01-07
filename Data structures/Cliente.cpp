#include "Cliente.hpp"
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <string>
#include <math.h>

using namespace std;

Cliente::Cliente()
{
}

Cliente::~Cliente()
{
}
//Genera un tiempo aleatorio entre 1 y 5 minutos
void Cliente::GenerarTiempoCompra()
{
	tiempoCompra=1+rand()%10;
}
//Genera un DNI y una letra en función del número
void Cliente::CalcularDNI()
{
	char dni[10]={};
	int suma,num;
	string str;
	char letras[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	for(int i=0;i<8;i++){
		num=rand()%10;
		suma=suma+(num*pow(10,7-i));
		dni[i]=num+48;
	}
	dni[8]=letras[suma%23];
	str=dni;
	DNI=str;
}
//Muestra los datos del cliente en el servidor
void Cliente::mostrarDatos()
{
	std::cout<<"DNI: "<<DNI<<"\t";
	std::cout<<"Hora de inicio de compra: "<<horaCompra<<"\t";
	std::cout<<"Tiempo de compra: "<<tiempoCompra<<"\t\n";
}
//Muestra los datos del cliente y su identificador
void Cliente::mostrarEntradas()
	{
	std::cout <<"\nID entrada: " << IdEntrada << "\t" ;
	std::cout<<"DNI: "<<DNI<<"\t";
	std::cout<<"Hora de inicio de compra: "<<horaCompra<<"\t";
	std::cout<<"Tiempo de compra: "<<tiempoCompra;
    //Muestra si es VIP o no registrado segun el booleano
	if (registrado)
		std::cout << "\tCliente VIP\n";
	else
		std::cout << "\tCliente no registrado\n";
	}
//Genera un identificador de 4 letras aleatorio
void Cliente::GenerarIdentificador()
{
	char letras[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Y','Z'};
	char ident[5];
	for(int i=0;i<4;i++){
		ident[i]=letras[rand()%25];
	}
    //Para pasarlo a string
	ident[4]='\0';
	IdEntrada=ident;
}
//Genera una hora de llegada al servidor entre 0 y 10
void Cliente::GenerarHoraLlegada(int horaAnterior)
{
	horaCompra=horaAnterior+ rand()%5;
}
//Asigna un valor a bool si esta registrado o no
void Cliente::registro(bool reg){
	registrado= reg;
	}
