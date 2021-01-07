/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import poker.JugadorRegistrado;
import poker.Premio;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
    
/**
 *Ventana para ver las estadisticas personales de cada jugador
 * @author Alvaro de las Heras
 */
public class EstadisticasPersonales extends javax.swing.JFrame {
    //Se crean todas las variables necesarias para guardar los distintos tipos de datos
    private JugadorRegistrado jug;
    private ArrayList<Premio> premios;
    private ArrayList<Premio> pMesa=new ArrayList<Premio>();
    private ArrayList<Premio> pIndividual=new ArrayList<Premio>();
    private int[] vecesMesa;
    private int[]vecesIndividual;
    private int[] vecesTotales;
    
    public EstadisticasPersonales(JugadorRegistrado jug) {
        initComponents();
        this.jug=jug;
        premios= jug.getPremios();
        //Muestra los datos iniciales que despues se cambiaran
        obtenerDatos();
        mostrarGrafico(vecesTotales);
        mostrarPremios(premios);
        //Anagrama
        lblAnagrama.setSize(60,60);
        ImageIcon imagen2 = new ImageIcon("Anagrama.png");
        ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAnagrama.getWidth(), lblAnagrama.getHeight(), 1));
        lblAnagrama.setIcon(imgRedimensionada2);
        
    }
    /**Metodo que obtiene el numero de veces de cada premio
    */
    public void obtenerDatos(){
        //Inicializacion de todos los contadores
        int contMNada=0,contMPareja=0,contMDPareja=0,contMTrio=0,contMFull=0,contMColor =0,contMPoker=0;
        int contNada=0,contPareja=0,contDPareja=0,contTrio=0,contFull=0,contColor =0,contPoker=0;
        for (int i=0;i<premios.size();i++){
            if (premios.get(i).getTipo().equals("Mesa")){
                //Añade los premios de tipo mesa a la lista de premios de mesa
                pMesa.add(premios.get(i));
                if (premios.get(i).getPremio().equals("Nada")){
                    contMNada+=1;
                }
                else if (premios.get(i).getPremio().equals("Pareja")){
                    contMPareja+=1;
                }
                else if (premios.get(i).getPremio().equals("Doble pareja")){
                    contMDPareja+=1;
                }
                else if (premios.get(i).getPremio().equals("Trio")){
                    contMTrio+=1;
                }
                else if (premios.get(i).getPremio().equals("Full")){
                    contMFull+=1;
                }
                else if (premios.get(i).getPremio().equals("Color")){
                    contMColor+=1;
                }
                else {
                    contMPoker+=1;
                }
            }      
            else{
                //Añade los premios de tipo individual a la lista de premios individuales
                pIndividual.add(premios.get(i));
                 if (premios.get(i).getPremio().equals("Nada")){
                    contNada+=1;
                }
                else if (premios.get(i).getPremio().equals("Pareja")){
                    contPareja+=1;
                }
                else if (premios.get(i).getPremio().equals("Doble pareja")){
                    contDPareja+=1;
                }
                else if (premios.get(i).getPremio().equals("Trio")){
                    contTrio+=1;
                }
                else if (premios.get(i).getPremio().equals("Full")){
                    contFull+=1;
                }
                else if (premios.get(i).getPremio().equals("Color")){
                    contColor+=1;
                }
                else {
                    contPoker+=1;
                }
            }
        }
        //Almacenamiento de todos los datos
        int [] contadores = {contNada,contPareja,contDPareja,contTrio,contColor,contFull,contPoker};
        int [] contadoresM = {contMNada,contMPareja,contMDPareja,contMTrio,contMColor,contMFull,contMPoker};
        int [] contadoresT ={contNada+contMNada,contPareja+contMPareja,contDPareja+contMDPareja,contTrio+contMTrio,contColor+contMColor,contFull+contMFull,contPoker+contMPoker};
        //Se les asigna a las variables globales
        vecesMesa=contadoresM;
        vecesIndividual=contadores;
        vecesTotales=contadoresT;
    }
    /**
     * Muestra los premios en la tabla
     * @param premiosTabla sera la lista que mostrara y puede ser de varios tipos de premios
     */
    public void mostrarPremios(ArrayList<Premio>premiosTabla){
        //Se crea una matriz que rellenara el JTable
        String matriz[][]= new String[premiosTabla.size()][4];
        for (int i=0;i<premiosTabla.size();i++){
            matriz[i][0]= premiosTabla.get(i).getCantidad()+"";
            matriz[i][1]= premiosTabla.get(i).getPremio();
            matriz[i][2]= premiosTabla.get(i).getTipo();
           
        }
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Cantidad", "Premio", "Tipo"
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
     * 
     * @param array muestra los porcentajes en el grafico de los distintos tipos
     */
    public void mostrarGrafico(int[]array){
        //Calcula el total
        double total=(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]);
        //Almacenamos en arrays los componentes para facilitar su manejo
        JPanel[] barras={jPanel4,jPanel5,jPanel6,jPanel7,jPanel8,jPanel9,jPanel11} ;
        JTextField[] textos={txtNada,txtPareja,txtDPareja,txtTrio,txtColor,txtFull,txtPoker};
        //Se va iterando cada dato con cada componente ajustandolos segun sus valores
        for (int i =0;i<7;i++){
            //Situa el rectangulo en funcion de la posicion x e y, y su altura y anchura
            barras[i].setBounds(100+48*i,117+(145-(int) Math.round((array[i]/total)*145)),15,(int) Math.round((array[i]/total)*145));
            textos[i].setText(array[i]+"");
        }
        txtTotal.setText(total+"");
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNada = new javax.swing.JTextField();
        txtPareja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDPareja = new javax.swing.JTextField();
        txtTrio = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPoker = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnMesa = new javax.swing.JButton();
        btnIndividual = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFull = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estadisticas personales");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Elegantlight", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estadisticas personales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(lblAnagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(lblAnagrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(353, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtNada.setEditable(false);
        txtNada.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        txtPareja.setEditable(false);
        txtPareja.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel2.setText("Nada");

        jLabel3.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel3.setText("Pareja");

        jLabel4.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel4.setText("Doble pareja");

        jLabel5.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel5.setText("Trio");

        jLabel6.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel6.setText("Poker");

        jLabel7.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel7.setText("Color");

        txtDPareja.setEditable(false);
        txtDPareja.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        txtTrio.setEditable(false);
        txtTrio.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        txtTrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrioActionPerformed(evt);
            }
        });

        txtColor.setEditable(false);
        txtColor.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        txtPoker.setEditable(false);
        txtPoker.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel8.setText("Veces");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel9.setText("Total");

        btnMesa.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnMesa.setText("Mesa");
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });

        btnIndividual.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnIndividual.setText("Individual");
        btnIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndividualActionPerformed(evt);
            }
        });

        btnTodos.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTable1.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cantidad", "Premio", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);

        btnVolver.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N
        jLabel10.setText("Full");

        txtFull.setEditable(false);
        txtFull.setFont(new java.awt.Font("Open Sans Light", 0, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel11.setText("100");

        jLabel12.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel12.setText("50");

        jLabel13.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel13.setText("0");

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Open Sans Light", 0, 14)); // NOI18N
        jLabel14.setText("Porcentajes de obtencion de premios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtNada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txtPareja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDPareja, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTrio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFull, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIndividual)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnMesa)
                                        .addGap(11, 11, 11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnVolver)
                                            .addComponent(btnTodos))))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIndividual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver)
                                .addGap(11, 11, 11)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPareja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDPareja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        setSize(new java.awt.Dimension(546, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrioActionPerformed

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
        //Muestra el grafico de mesa y premios
        mostrarGrafico(vecesMesa);
        mostrarPremios(pMesa);
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Boton para volver a la ventana anterior
        Apuestas jFrame= new Apuestas(jug);
        this.setVisible(false);
        jFrame.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndividualActionPerformed
        //Muestra el grafico de mesa y premios
        mostrarGrafico(vecesIndividual);
        mostrarPremios(pIndividual);
    }//GEN-LAST:event_btnIndividualActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        //Muestra el grafico de mesa y premios
        mostrarGrafico(vecesTotales);
        mostrarPremios(premios);
    }//GEN-LAST:event_btnTodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIndividual;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnagrama;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDPareja;
    private javax.swing.JTextField txtFull;
    private javax.swing.JTextField txtNada;
    private javax.swing.JTextField txtPareja;
    private javax.swing.JTextField txtPoker;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTrio;
    // End of variables declaration//GEN-END:variables
}
