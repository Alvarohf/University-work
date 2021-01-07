#ifndef LISTA_HPP
#define LISTA_HPP
#include <NodoLista.hpp>
#include <Cliente.hpp>
class Lista
{
public:
	Lista();
	~Lista();
    bool esVacia();
    void mostrarLista();
	void insertarOrden(Cliente c);
	bool comparaEntrada(Cliente c,Cliente d);

private:
    lnodo primero ,ultimo;
	friend class NodoLista;
};

#endif // LISTA_HPP
