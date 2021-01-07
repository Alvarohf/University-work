#ifndef COLA_HPP
#define COLA_HPP
#include <NodoCola.hpp>
#include <Cliente.hpp>
class Cola
{
public:
	Cola();
	~Cola();
	bool esVacia();
	void insertar(Cliente c);
	Cliente eliminar();
private:
	cnodo primero, ultimo;
	friend class Gestor;
};

#endif // COLA_HPP
