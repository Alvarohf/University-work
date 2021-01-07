#include "NodoLista.hpp"
//Crea un nodo con el objeto cliente y el puntero al siguiente
NodoLista::NodoLista(Cliente c, NodoLista *sig)
{
	cliente=c;
	siguiente=sig;
}

NodoLista::~NodoLista()
{
}

