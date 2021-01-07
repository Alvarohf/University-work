#ifndef GESTOR_HPP
#define GESTOR_HPP
#include <Cliente.hpp>
#include <Cola.hpp>
#include <Lista.hpp>
class Gestor
{
public:
	Gestor();
	~Gestor();
	void GenerarCliente(bool reg);
	int GenerarSolicitudesVIP();
	int GenerarSolicitudesNoReg();
	void MostrarColaVIP(int vip);
	void MostrarColaNoReg(int noreg);
	void BorrarSolicitudesVIP();
	void BorrarSolicitudesNoReg();
	void SimularCompraVIP(int vip);
	void SimularCompraNoReg(int noreg);
	void MostrarEntradasVendidas();
	void servidores(Cliente c);
	void calcularTiempos();
	
private:
	Lista entradasVendidas;
	Cola colaVIP,colaNoReg, servidorVIP,ServidorNR1,ServidorNR2,ServidorNR3,ServidorNR4;
	int tiempos[4]={0,0,0,0};
	int serv[4]={0,0,0,0};
	
};

#endif // GESTOR_HPP
