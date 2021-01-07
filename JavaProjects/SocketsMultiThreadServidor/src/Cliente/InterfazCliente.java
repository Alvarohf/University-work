/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;



import javax.swing.JTextField;

/**
 *
 * @author Alvaro de las Heras y Alvaro Maestre
 */
public class InterfazCliente extends javax.swing.JFrame {

    /**
     * Creates new form GasolineraInterfaz
     */
    public InterfazCliente() {
        //Carga de elementos graficos
        initComponents();
        //Al cerrar la ventana no se finaliza todo el sistema
        //this.setDefaultCloseOperation(InterfazCliente.DISPOSE_ON_CLOSE);
        //Declaramos e inicializamos variables 
        JTextField[] operariosTxtFld= {surtidor1_operario,surtidor2_operario,surtidor3_operario,surtidor4_operario,surtidor5_operario,surtidor6_operario,surtidor7_operario,surtidor8_operario,};
        JTextField[] vehiculosTxtFld={surtidor1_vehiculo,surtidor2_vehiculo,surtidor3_vehiculo,surtidor4_vehiculo,surtidor5_vehiculo,surtidor6_vehiculo,surtidor7_vehiculo,surtidor8_vehiculo,};
        Cliente c = new Cliente(txt_fld_gasolinera,vehiculosTxtFld,operariosTxtFld);
        c.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_fld_gasolinera = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        surtidor1_vehiculo = new javax.swing.JTextField();
        surtidor2_vehiculo = new javax.swing.JTextField();
        surtidor3_vehiculo = new javax.swing.JTextField();
        surtidor4_vehiculo = new javax.swing.JTextField();
        surtidor5_vehiculo = new javax.swing.JTextField();
        surtidor6_operario = new javax.swing.JTextField();
        surtidor7_vehiculo = new javax.swing.JTextField();
        surtidor8_operario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        surtidor1_operario = new javax.swing.JTextField();
        surtidor2_operario = new javax.swing.JTextField();
        surtidor3_operario = new javax.swing.JTextField();
        surtidor4_operario = new javax.swing.JTextField();
        surtidor5_operario = new javax.swing.JTextField();
        surtidor6_vehiculo = new javax.swing.JTextField();
        surtidor7_operario = new javax.swing.JTextField();
        surtidor8_vehiculo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(940, 298));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cola de espera");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(45, 19, 101, 17);

        txt_fld_gasolinera.setEditable(false);
        txt_fld_gasolinera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fld_gasolineraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_fld_gasolinera);
        txt_fld_gasolinera.setBounds(10, 39, 920, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Surtidor 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 91, 70, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Surtidor 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(198, 91, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Surtidor 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 90, 90, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Surtidor 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 90, 80, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Surtidor 5");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(492, 91, 80, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Surtidor 6");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 91, 70, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Surtidor 7");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(688, 91, 80, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Surtidor 8");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(798, 90, 80, 15);

        surtidor1_vehiculo.setEditable(false);
        getContentPane().add(surtidor1_vehiculo);
        surtidor1_vehiculo.setBounds(100, 123, 80, 30);

        surtidor2_vehiculo.setEditable(false);
        surtidor2_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surtidor2_vehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(surtidor2_vehiculo);
        surtidor2_vehiculo.setBounds(198, 123, 80, 30);

        surtidor3_vehiculo.setEditable(false);
        getContentPane().add(surtidor3_vehiculo);
        surtidor3_vehiculo.setBounds(296, 123, 80, 30);

        surtidor4_vehiculo.setEditable(false);
        getContentPane().add(surtidor4_vehiculo);
        surtidor4_vehiculo.setBounds(394, 123, 80, 30);

        surtidor5_vehiculo.setEditable(false);
        getContentPane().add(surtidor5_vehiculo);
        surtidor5_vehiculo.setBounds(492, 123, 80, 30);

        surtidor6_operario.setEditable(false);
        getContentPane().add(surtidor6_operario);
        surtidor6_operario.setBounds(590, 195, 80, 30);

        surtidor7_vehiculo.setEditable(false);
        getContentPane().add(surtidor7_vehiculo);
        surtidor7_vehiculo.setBounds(688, 123, 80, 30);

        surtidor8_operario.setEditable(false);
        getContentPane().add(surtidor8_operario);
        surtidor8_operario.setBounds(786, 195, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vehículo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 126, 60, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Operario");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 198, 60, 15);

        surtidor1_operario.setEditable(false);
        getContentPane().add(surtidor1_operario);
        surtidor1_operario.setBounds(100, 195, 80, 30);

        surtidor2_operario.setEditable(false);
        surtidor2_operario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surtidor2_operarioActionPerformed(evt);
            }
        });
        getContentPane().add(surtidor2_operario);
        surtidor2_operario.setBounds(198, 195, 80, 30);

        surtidor3_operario.setEditable(false);
        getContentPane().add(surtidor3_operario);
        surtidor3_operario.setBounds(296, 195, 80, 30);

        surtidor4_operario.setEditable(false);
        getContentPane().add(surtidor4_operario);
        surtidor4_operario.setBounds(394, 195, 80, 30);

        surtidor5_operario.setEditable(false);
        getContentPane().add(surtidor5_operario);
        surtidor5_operario.setBounds(492, 195, 80, 30);

        surtidor6_vehiculo.setEditable(false);
        getContentPane().add(surtidor6_vehiculo);
        surtidor6_vehiculo.setBounds(590, 123, 80, 30);

        surtidor7_operario.setEditable(false);
        getContentPane().add(surtidor7_operario);
        surtidor7_operario.setBounds(688, 195, 80, 30);

        surtidor8_vehiculo.setEditable(false);
        getContentPane().add(surtidor8_vehiculo);
        surtidor8_vehiculo.setBounds(786, 123, 80, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cliente/gasolinera.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-30, 0, 990, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fld_gasolineraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fld_gasolineraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fld_gasolineraActionPerformed

    private void surtidor2_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surtidor2_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surtidor2_vehiculoActionPerformed

    private void surtidor2_operarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surtidor2_operarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surtidor2_operarioActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField surtidor1_operario;
    private javax.swing.JTextField surtidor1_vehiculo;
    private javax.swing.JTextField surtidor2_operario;
    private javax.swing.JTextField surtidor2_vehiculo;
    private javax.swing.JTextField surtidor3_operario;
    private javax.swing.JTextField surtidor3_vehiculo;
    private javax.swing.JTextField surtidor4_operario;
    private javax.swing.JTextField surtidor4_vehiculo;
    private javax.swing.JTextField surtidor5_operario;
    private javax.swing.JTextField surtidor5_vehiculo;
    private javax.swing.JTextField surtidor6_operario;
    private javax.swing.JTextField surtidor6_vehiculo;
    private javax.swing.JTextField surtidor7_operario;
    private javax.swing.JTextField surtidor7_vehiculo;
    private javax.swing.JTextField surtidor8_operario;
    private javax.swing.JTextField surtidor8_vehiculo;
    private javax.swing.JTextField txt_fld_gasolinera;
    // End of variables declaration//GEN-END:variables
}
