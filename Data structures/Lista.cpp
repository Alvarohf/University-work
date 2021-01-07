#include "Lista.hpp"
#include <NodoLista.hpp>
#include <iostream>
#include <Cliente.hpp>
Lista::Lista()
{
	primero=NULL;
	ultimo=NULL;
}
//Inserta en orden el cliente en la lista según su entrada
void Lista :: insertarOrden (Cliente c) {
    lnodo p = new NodoLista(c, NULL);
    lnodo aux = primero;
    //Comprueba si hay primero y lo inserta segun este o no
    if ((primero==NULL)||comparaEntrada(c,aux->cliente)) 
        { 
        p->siguiente = aux;
        primero = p;
        }
    else {
        //Va buscando la posición hasta llegar el orden correcto
        while ((aux->siguiente) && (comparaEntrada(aux->siguiente->cliente,c))) {
            aux = aux->siguiente;                   
        }
        p->siguiente = aux->siguiente;
        aux->siguiente = p; 
    }
}
//Comprueba que la lista no esta vacias
bool Lista::esVacia()
	{
	return primero == NULL;
	} 
//Muestra la lista
void Lista::mostrarLista()
	{
		NodoLista *aux;
		aux=primero;
        //Mientras aux no sea NULL muestra los datos
		while (aux) {
			aux->cliente.mostrarEntradas();
			aux = aux->siguiente;
		}
	}
    //Compara los ID de la entrada y devuelve bool
bool Lista::comparaEntrada(Cliente c,Cliente d)
	{	bool b;
		if (d.IdEntrada > c.IdEntrada)
            b = true;
		else 
            b = false;
		return b;
	}
Lista::~Lista()
{
}

