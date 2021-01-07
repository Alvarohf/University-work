/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author dcc
 */
public class JugadorException extends Exception {

 public static final String SALDO_INSUFICIENTE = "No se dispone de saldo para realizar la apuesta.";
 public static final String NIF_INCORRECTO = "El NIF proporcionado no corresponde a ningún jugador registrado.";
 public static final String CONTRASENNA_INCORRECTA = "La contraseña no es correcta.";
 public static final String EDAD_INCORRECTA = "El jugador debe ser mayor de edad para poder jugar";
 public static final String CANTIDAD_INCORRECTA = "Ingrese únicamente una cantidad númerica sin decimales";
 public static final String RELLENE_DATOS = "Rellene todos los datos";
 public static final String JUGADOR_NULL="No hay ningún jugador registrado en el sistema";
 public static final String NIF_EXISTENTE="El NIF que ha introducido se corresponde con el de otro jugador";
 public static final String FECHA_ERRONEA="La fecha de nacimiento introducida no existe";
 public static final String CANTIDAD_NEGATIVA="La cantidad que introduzca no puede estar por debajo de 0";
 public static final String FECHA_ANTIGUA="La fecha de nacimiento introducida es demasiado antigua";
 public JugadorException() {
 super("Se ha producido una excepción en la aplicación.");
 }

 public JugadorException (String txt) {
 super(txt);
 }
}
