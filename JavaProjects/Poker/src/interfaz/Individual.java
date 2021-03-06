/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import poker.Apuesta;
import poker.Baraja;
import poker.CasaApuestas;
import poker.JugadorException;
import poker.JugadorOcasional;
import poker.JugadorRegistrado;
import poker.Premio;
/**
 *Ventana para hacer apuestas de forma individual
 * @author Alvaro de las Heras
 */
public class Individual extends javax.swing.JFrame {
    //Declaracion de tipos
    private JugadorOcasional jugOca;
    private JugadorRegistrado jugReg;
    private int saldo;
    private String tipo;
    private boolean registro;
    
     public Individual(JugadorRegistrado jugador,String tipo) {
        initComponents();
        this.registro=true;
        this.jugReg=jugador;
        //Indica el tipo de modo de juego
        this.tipo=tipo;
        //Obtiene y muestra el saldo del jugador
        saldo=jugador.getSaldo();
        txtSaldo.setText(saldo+"€");    
        //Anagrama
        lblAnagrama.setSize(60,60);
        ImageIcon imagen2 = new ImageIcon("Anagrama.png");
        ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAnagrama.getWidth(), lblAnagrama.getHeight(), 1));
        lblAnagrama.setIcon(imgRedimensionada2);
    }
    public Individual(JugadorOcasional jugador) {
        initComponents();
        this.registro=false;
        this.jugOca=jugador;
        //Obtiene y muestra el saldo del jugador
        saldo=jugador.getSaldo();
        txtSaldo.setText(saldo+"€"); 
        //Anagrama
        lblAnagrama.setSize(60,60);
        ImageIcon imagen2 = new ImageIcon("Anagrama.png");
        ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAnagrama.getWidth(), lblAnagrama.getHeight(), 1));
        lblAnagrama.setIcon(imgRedimensionada2);
    }
    /**
    * Método que verifica cantidades al apostar con el saldo
    * @param saldo saldo del jugador (entero)
    * @param cantidad cantidad apostada (entero)
    * @return Devuelve un booleano que verifica que sea correcta
    */
    public boolean es_correcta(int saldo, int cantidad){
        return (cantidad<=saldo);
    }
    /**
    * Método que verifica si se escriben numeros enteros
    * @param mensaje saldo del jugador (String)
    * @return Devuelve un booleano que verifica que sea correcta
    */
    public boolean es_entero(String mensaje){
        boolean parsable = true;
        try{
            Integer.parseInt(mensaje);
        }
        catch (NumberFormatException e) {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnApostar = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        lblImagen4 = new javax.swing.JLabel();
        lblImagen5 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtPremio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApuesta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAnagrama = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Individual");
        setIconImages(null);
        setResizable(false);

        btnApostar.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnApostar.setText("Apostar");
        btnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApostarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtPremio.setEditable(false);
        txtPremio.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        txtPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPremioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel6.setText("Su premio es:");

        txtApuesta.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        txtApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApuestaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel7.setText("€");

        jLabel8.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel8.setText("Saldo: ");

        txtSaldo.setEditable(false);
        txtSaldo.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Elegantlight", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Individual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAnagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addComponent(lblAnagrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApuesta))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblImagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApostar)
                    .addComponent(btnVolver)
                    .addComponent(txtPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(640, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        //Se instancian los objetos necesarios para la apuesta
        Baraja mano = new Baraja();
        Apuesta apuesta = new Apuesta();
        int premio;
        try{
            //Comprueba que no este vacia la casilla de apuesta
            if (txtApuesta.getText().equals("")){
                throw new JugadorException(JugadorException.RELLENE_DATOS);
            }
            //Comprueba que se introduzcan numeros enteros
            if (es_entero(txtApuesta.getText())){
                int cantidad = Integer.parseInt(txtApuesta.getText());
                //Verifica que la apuesta no supere al saldo
                if (es_correcta(saldo,cantidad)){
                    //Comprueba que la cantidad introducida no sea negativa
                    if (cantidad<0){
                        throw new JugadorException(JugadorException.CANTIDAD_NEGATIVA);
                    }
                    //Se crea la mano
                    int[] cartas = mano.crearMano();
                    //Texto de información en la cantidad apostada
                    txtApuesta.setToolTipText("Introduzca una cantidad sin decimales.");
                    //Carta 1
                    lblImagen1.setSize(70, 96);
                    ImageIcon imagen = new ImageIcon("imagenes/"+cartas[0]+".jpg");
                    ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), 1));
                    lblImagen1.setIcon(imgRedimensionada);
                    //Carta 2
                    lblImagen2.setSize(70, 96);
                    ImageIcon imagen2 = new ImageIcon("imagenes/"+cartas[1]+".jpg");
                    ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), 1));
                    lblImagen2.setIcon(imgRedimensionada2);
                    //Carta 3
                    lblImagen3.setSize(70, 96);
                    ImageIcon imagen3 = new ImageIcon("imagenes/"+cartas[2]+".jpg");
                    ImageIcon imgRedimensionada3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblImagen3.getWidth(), lblImagen3.getHeight(), 1));
                    lblImagen3.setIcon(imgRedimensionada3);
                    //Carta 4
                    lblImagen4.setSize(70, 96);
                    ImageIcon imagen4 = new ImageIcon("imagenes/"+cartas[3]+".jpg");
                    ImageIcon imgRedimensionada4 = new ImageIcon(imagen4.getImage().getScaledInstance(lblImagen4.getWidth(), lblImagen4.getHeight(), 1));
                    lblImagen4.setIcon(imgRedimensionada4);
                    //Carta 5
                    lblImagen5.setSize(70, 96);
                    ImageIcon imagen5 = new ImageIcon("imagenes/"+cartas[4]+".jpg");
                    ImageIcon imgRedimensionada5 = new ImageIcon(imagen5.getImage().getScaledInstance(lblImagen5.getWidth(), lblImagen5.getHeight(), 1));
                    lblImagen5.setIcon(imgRedimensionada5);
                    
                    //Obtencion de premios y actualizacion de saldos
                    if (registro) {
                        Premio premiof =apuesta.verPremio(registro,cantidad,cartas,tipo);
                        //Guarda el premio
                        jugReg.anadirPremio(premiof);
                        premio= premiof.getCantidad();
                        //Modifica el saldo en funcion de si ganas o pierdes
                        jugReg.setSaldo(-cantidad+premio);
                        //Se obtiene el nuevo saldo y se muestra por pantalla
                        txtSaldo.setText(jugReg.getSaldo()+"€");
                        saldo=jugReg.getSaldo();
                        txtPremio.setText(premio+"€");
                        //Guarda los datos
                        CasaApuestas.guardarDatos();
                    } 
                    else {
                        Premio premiof =apuesta.verPremio(registro,cantidad,cartas,tipo);
                        premio= premiof.getCantidad();
                        //Modifica el saldo en funcion de si ganas o pierdes
                        jugOca.setSaldo(-cantidad+premio);
                        //Se obtiene el nuevo saldo y se muestra por pantalla
                        txtSaldo.setText(jugOca.getSaldo()+"€");
                        txtPremio.setText(premio+"€");
                        saldo=jugOca.getSaldo();                      
                    }
                }
                else throw new JugadorException(JugadorException.SALDO_INSUFICIENTE);
            }
            else throw new JugadorException(JugadorException.CANTIDAD_INCORRECTA);
        }
        catch (JugadorException exc){
            JOptionPane.showMessageDialog(this,exc.getMessage());
        }
    }//GEN-LAST:event_btnApostarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Vuelve a la ventana anterior con los nuevos datos
        if (registro){
            Apuestas jFrame= new Apuestas(jugReg);
            this.setVisible(false);
            jFrame.setVisible(true);}
        else{
            Apuestas jFrame= new Apuestas(jugOca);
            this.setVisible(false);
            jFrame.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPremioActionPerformed

    }//GEN-LAST:event_txtPremioActionPerformed

    private void txtApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApuestaActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnagrama;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    private javax.swing.JLabel lblImagen5;
    private javax.swing.JTextField txtApuesta;
    private javax.swing.JTextField txtPremio;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
