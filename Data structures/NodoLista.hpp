#ifndef NODOLISTA_HPP
#define NODOLISTA_HPP
#include <Cliente.hpp>
#include <iostream>
class NodoLista
{
public:
    NodoLista(Cliente c, NodoLista *sig = NULL);
	~NodoLista();
    
private:
    Cliente cliente;
	NodoLista *siguiente;
    friend class Cliente;
    friend class Gestor;
    friend class Lista;
};
typedef NodoLista *lnodo;
#endif // NODOLISTA_HPP