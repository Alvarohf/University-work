#ifndef NODOCOLA_HPP
#define NODOCOLA_HPP
#include <stdio.h>
#include <stdlib.h>
#include <Cliente.hpp>

class NodoCola
{
public:
	NodoCola(Cliente c, NodoCola *sig=NULL);
	~NodoCola();
	
private:
	Cliente cliente;
	NodoCola *siguiente;
	friend class Cola;
    friend class Gestor;
	friend class Cliente;
};
typedef NodoCola *cnodo;

#endif // NODOCOLA_HPP
