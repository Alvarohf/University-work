/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import poker.JugadorException;
import poker.JugadorOcasional;
import poker.JugadorRegistrado;

/**
 *Ventana con las opciones para el jugador
 * @author Alvaro de las Heras
 */
public class Apuestas extends javax.swing.JFrame {
    //Declaración de tipos
    private JugadorOcasional jugOca;
    private JugadorRegistrado jugReg;
    private boolean registro;
    
    //Se aprovecha la sobrecarga de metodos para el tipo de jugador
    public Apuestas(JugadorOcasional jugador) {
        initComponents();
        this.registro=false;
        this.jugOca=jugador;
        txtSaldoTotal.setText(jugador.getSaldo()+"€");
        //Desactiva el boton de estadisticas
        btnEstadisticas.setVisible(registro);
        //Anagrama
        lblAnagrama.setSize(60,60);
        ImageIcon imagen2 = new ImageIcon("Anagrama.png");
        ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAnagrama.getWidth(), lblAnagrama.getHeight(), 1));
        lblAnagrama.setIcon(imgRedimensionada2);
    }
    public Apuestas(JugadorRegistrado jugador) {
        initComponents();
        this.registro=true;
        this.jugReg=jugador;
        txtSaldoTotal.setText(jugador.getSaldo()+"€");
        //Anagrama
        lblAnagrama.setSize(60,60);
        ImageIcon imagen2 = new ImageIcon("Anagrama.png");
        ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAnagrama.getWidth(), lblAnagrama.getHeight(), 1));
        lblAnagrama.setIcon(imgRedimensionada2);
        
    }
    /**
    * Método que verifica si se escriben numeros enteros
    * @param mensaje saldo del jugador (String)
    * @return Devuelve un booleano que verifica que sea correcta
    */
    public boolean es_entero(String mensaje){
        //Verifica que sea un numero entero el que se introduce
        boolean parsable = true;
        try{
            Integer.parseInt(mensaje);
        }
        catch (NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAnagrama = new javax.swing.JLabel();
        btnJuego = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSaldoTotal = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        txtSaldo = new javax.swing.JTextField();
        btnEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu juego");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Elegantlight", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu juego");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(lblAnagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
            .addComponent(lblAnagrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnJuego.setBackground(new java.awt.Color(0, 102, 0));
        btnJuego.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnJuego.setForeground(new java.awt.Color(255, 255, 255));
        btnJuego.setText("Jugar");
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel2.setText("Saldo:");

        txtSaldoTotal.setEditable(false);
        txtSaldoTotal.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        txtSaldoTotal.setText("0€");
        txtSaldoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoTotalActionPerformed(evt);
            }
        });

        btnRetirar.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnRetirar.setText("Retirar saldo");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnSaldo.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnSaldo.setText("Añadir saldo");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        txtSaldo.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N

        btnEstadisticas.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnEstadisticas.setText("Estadísticas ");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRetirar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEstadisticas)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(461, 284));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoTotalActionPerformed
       
    }//GEN-LAST:event_txtSaldoTotalActionPerformed

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        //Abre la nueva ventana para las cartas y apuestas
        if (registro) {
            Modo jFrame= new Modo(jugReg);
            this.setVisible(false);
            jFrame.setVisible(true);
        }
        else {
            Individual jFrame= new Individual(jugOca);
            this.setVisible(false);
            jFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnJuegoActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        //Texto de información en el saldo
        txtSaldo.setToolTipText("Introduzca una cantidad sin decimales.");
        try {
            //Comprueba que no haya huecos en blanco
            if (txtSaldo.getText().equals("")){
                throw new JugadorException(JugadorException.RELLENE_DATOS);
            }
            //Comprueba que se introduzcan numeros en el saldo
            if (es_entero(txtSaldo.getText())){
                int saldo = Integer.parseInt(txtSaldo.getText());
                //Aumenta el saldo en caso de que no haya excepciones
                if (registro) {
                    jugReg.aumentarSaldo(saldo);
                    txtSaldoTotal.setText(jugReg.getSaldo()+"€");
                }
                else {jugOca.aumentarSaldo(saldo);
                    txtSaldoTotal.setText(jugOca.getSaldo()+"€");
                }
            }  
        }
        catch(JugadorException excep){
            JOptionPane.showMessageDialog(this,excep.getMessage());
        }
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        //Imprime en un archivo de texto los datos y saldo correspondientes
        if (registro) {
            try {
                PrintWriter salida= new PrintWriter(new BufferedWriter(new FileWriter(jugReg.getNif()+".txt")));
                salida.println("Nombre: "+jugReg.getNombre()+" Apellidos: "+jugReg.getApellidos());
                salida.println("Nacimiento: "+jugReg.getNacimiento()+" Registro:"+jugReg.getRegistro());
                salida.println("Cuenta: "+jugReg.getCuenta()+" NIF:"+jugReg.getNif());
                salida.println("Saldo: "+jugReg.getSaldo()+" €");
                salida.println("Bonus registro: "+(jugReg.retirarBeneficios()-jugReg.getSaldo())+" €");
                salida.println("Total: "+jugReg.retirarBeneficios()+" €");
                salida.close();
                System.exit(0);
            }
            catch (IOException ioe) {
                System.out.println("Error IO: "+ioe.toString());
            }
        }
        else {
            try {
                PrintWriter salida= new PrintWriter(new BufferedWriter(new FileWriter(jugOca.getNif()+".txt")));
                salida.println("Nombre: "+jugOca.getNombre()+" Apellidos: "+jugOca.getApellidos());
                salida.println("Nacimiento: "+jugOca.getNacimiento());
                salida.println("Cuenta: "+jugOca.getTarjeta()+" NIF:"+jugOca.getNif());
                salida.println("Saldo: "+jugOca.retirarBeneficios()+" €");
                salida.close();
                System.exit(0);
                
            } 
            catch (IOException ioe) {
                System.out.println("Error IO: "+ioe.toString());
            }
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        //Boton para ir a la ventana de estadisticas del jugador
        EstadisticasPersonales jFrame= new EstadisticasPersonales(jugReg);
        this.setVisible(false);
        jFrame.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnJuego;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnagrama;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtSaldoTotal;
    // End of variables declaration//GEN-END:variables

}
