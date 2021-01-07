#ifndef CLIENTE_HPP
#define CLIENTE_HPP
#include <string>

using namespace std;

class Cliente
{
public:
	Cliente();
	~Cliente();
	void GenerarTiempoCompra();
	void CalcularDNI();
	void mostrarDatos();
	void mostrarEntradas();
	void GenerarIdentificador();
	void GenerarHoraLlegada(int horaAnterior);
	void registro(bool reg);
private:
	string DNI;
	int horaCompra;
	bool registrado;
	int tiempoCompra;
	string IdEntrada;
	friend class NodoCola;
	friend class Gestor;
	friend class Cola;
	friend class Lista;
};

#endif // CLIENTE_HPP
