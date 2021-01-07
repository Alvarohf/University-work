/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.ImageIcon;
import poker.CasaApuestas;
import poker.JugadorRegistrado;
import poker.Premio;

/**
 *Ventana para ver las estadisticas de jugadores
 * @author Alvaro de las Heras
 */
public class EstadisticasAdmin extends javax.swing.JFrame {
    
    private CasaApuestas reg;
    private Iterator it;
    private HashMap<String,JugadorRegistrado> registros;
    private ArrayList<Premio> premios;
    private ArrayList<JugadorRegistrado> jugadores = new ArrayList<JugadorRegistrado>() ;
  
    public EstadisticasAdmin(CasaApuestas reg) {
        initComponents();
        this.reg=reg;
        this.registros= reg.getJugadores();
        
        //Se obtienen los datos iniciales y se muestran en la tabla
        obtenerDatos("Nada");
        mostrarPremios(jugadores);
        
        //Anagrama de la pagina
        lblAnagrama.setSize(60,60);
        ImageIcon imagen2 = new ImageIcon("Anagrama.png");
        ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAnagrama.getWidth(), lblAnagrama.getHeight(), 1));
        lblAnagrama.setIcon(imgRedimensionada2);
    }
    /**
    * Método que busca jugadores con determinado premio
    * @param premio el premio a buscar (String)
    */
    public void obtenerDatos(String premio){
        //Se crea un iterador con la lista de claves para el mapa
        it = registros.keySet().iterator();
        while(it.hasNext()){
            
            //Recorremos todos los jugadores del mapa al igual que sus premios
            JugadorRegistrado jug = (JugadorRegistrado) registros.get(it.next());
            premios= jug.getPremios();
            
            for (int i =0 ; i<premios.size() ; i++){
                if (premios.get(i).getPremio().equals(premio)){
                    //Una vez se obtiene una coincidencia sale y busca en el siguiente
                    jugadores.add(jug);
                    break;
                }
            } 
        }
    }
    /**
    * Método que muestra los distintos jugadores en el jTable
    * @param jugadores lista que contiene los jugadores a representar(ArrayList)
    */
    public void mostrarPremios(ArrayList<JugadorRegistrado> jugadores){
        //Rellena los huecos de la tabla con los datos obtenidos al recorrer todos
        //los jugadores que habiamos obtenido antes
        String matriz[][]= new String[jugadores.size()][4];
        
        for (int i=0;i<jugadores.size();i++){
            matriz[i][0]= jugadores.get(i).getNif();
            matriz[i][1]= jugadores.get(i).getNombre();
            matriz[i][2]= jugadores.get(i).getApellidos();   
        }
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "DNI", "Nombre", "Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmbxPremios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estadisticas adminstrador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Elegantlight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estadisticas administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblAnagrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(lblAnagrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable1.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        cmbxPremios.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        cmbxPremios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Pareja", "Doble pareja", "Trio", "Color", "Full", "Poker" }));
        cmbxPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxPremiosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel2.setText("Premio a buscar entre jugadores: ");

        btnVolver.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbxPremios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxPremios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(475, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxPremiosActionPerformed
        //Al cambiar la combobox lo rellena con los datos nuevos
        String item =(String) cmbxPremios.getSelectedItem();
        //Resetea los jugadores que se muestran en la tabla
        jugadores=new ArrayList<JugadorRegistrado>();
        obtenerDatos(item);
        mostrarPremios(jugadores);
    }//GEN-LAST:event_cmbxPremiosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Boton para regresar a la ventana anterior
        this.setVisible(false);
        Administrador frame= new Administrador(reg);
        frame.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbxPremios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnagrama;
    // End of variables declaration//GEN-END:variables
}