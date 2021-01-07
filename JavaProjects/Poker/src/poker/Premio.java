
package poker;

import java.io.Serializable;

/**
 *
 * @author Alvaro de las Heras
 */
public class Premio implements Serializable{
    private int cantidad;
    private String premio;
    private String tipo;
    private int valor;
/**
 * 
 * @param cantidad cantidad del premio (int)
 * @param premio premio obtenido (String)
 * @param tipo tipo de premio obtenido(String)
 * @param valor valor de las cartas del premio(int)
 */
    public Premio(int cantidad, String premio, String tipo, int valor) {
        this.cantidad = cantidad;
        this.premio = premio;
        this.tipo = tipo;
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getPremio() {
        return premio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPremio(String premio) {
        this.premio = premio;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
