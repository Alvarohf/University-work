#include "Cola.hpp"
#include <NodoCola.hpp>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <Cliente.hpp>

Cola::Cola()
{
	primero=NULL;
	ultimo=NULL;
}

Cola::~Cola()
{
	while(primero)
		eliminar();
}
//Comprueba que la cola no es vacía
bool Cola::esVacia()
{
	return primero==NULL;
}
//Inserta un cliente a la cola como un nuevo nodo
void Cola::insertar(Cliente c)
{
	cnodo nuevo;
	nuevo= new NodoCola(c);
    //Se añade un elemento al final de la cola
	if(ultimo)
		ultimo->siguiente=nuevo;
	ultimo=nuevo;
    //Comprobamos si hay primero 
	if(!primero)
		primero=nuevo;
}
//Elimina el nodo y devuelve el contenido
Cliente Cola::eliminar()
{   Cliente c;
	if (!esVacia())
	{ cnodo nodo; //Var aux para manipular nodo
	nodo = primero; //Nodo apunta al primer elemento de la cola
	
	primero = nodo->siguiente;
	//Se asigna a 1º la dirección del segundo nodo
	nodo->siguiente = NULL;
	c= nodo->cliente;
	delete nodo; // Se borra el nodo
	// Si cola vacía, ultimo debe ser NULL también
	if(esVacia()) ultimo = NULL;
	}
	return c;
}

