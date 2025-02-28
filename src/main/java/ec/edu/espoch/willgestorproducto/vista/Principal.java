package ec.edu.espoch.willgestorproducto.vista;

import ec.edu.espoch.willgestorproducto.controlador.Controlador;




public class Principal extends javax.swing.JFrame {
    private Controlador controlador;
    private Listar listar;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.listar = new Listar();
        this.controlador = new Controlador(this, listar);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Groupo1 = new javax.swing.ButtonGroup();
        textTituloTarea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbdEstadoTarea = new javax.swing.JLabel();
        rbtPendiente = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        rbtCompleta1 = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbdTitulo = new javax.swing.JLabel();
        lbdError = new javax.swing.JLabel();
        lbdTituloTarea = new javax.swing.JLabel();
        jmenuSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuTarea = new javax.swing.JMenu();
        menuItemListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        textTituloTarea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textTituloTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTituloTareaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setText("PRECIO");

        lbdEstadoTarea.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbdEstadoTarea.setText("PERECEDERO");

        Groupo1.add(rbtPendiente);
        rbtPendiente.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        rbtPendiente.setText("No hay");
        rbtPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPendienteActionPerformed(evt);
            }
        });

        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        textAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(textAreaDescripcion);

        Groupo1.add(rbtCompleta1);
        rbtCompleta1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        rbtCompleta1.setText("Si hay");

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbdTitulo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbdTitulo.setText("GESTOR PRODUCTOS");

        lbdError.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbdError.setText("=>");

        lbdTituloTarea.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbdTituloTarea.setText("NOMBRE DEL PRODUCTO");

        jmenuSalir.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jmenuSalir.setText("Salir");
        jmenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuSalirActionPerformed(evt);
            }
        });

        jmenuTarea.setText("PRODUCTOS");
        jmenuTarea.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        menuItemListar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        menuItemListar.setText("LISTA DE LOS PRODUCTOS");
        menuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarActionPerformed(evt);
            }
        });
        jmenuTarea.add(menuItemListar);

        jMenuBar1.add(jmenuTarea);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnGuardar)
                        .addGap(34, 34, 34)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbdTituloTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTituloTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lbdError, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lbdTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbdEstadoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtCompleta1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmenuSalir)
                            .addComponent(rbtPendiente))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbdTituloTarea)
                    .addComponent(textTituloTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbdEstadoTarea)
                    .addComponent(rbtCompleta1)
                    .addComponent(rbtPendiente))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(lbdError)
                .addGap(18, 18, 18)
                .addComponent(jmenuSalir)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textTituloTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTituloTareaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textTituloTareaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.controlador.agregarTarea();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void menuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarActionPerformed
        // TODO add your handling code here:
        listar.setVisible(true);
        controlador.listarTarea();    
    }//GEN-LAST:event_menuItemListarActionPerformed

    private void jmenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jmenuSalirActionPerformed

    private void rbtPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPendienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbtPendienteActionPerformed
    public String getTitulo(){
        return textTituloTarea.getText();
    }
    
    public String getDescripcion(){
        return textAreaDescripcion.getText();
    }
    
    public boolean getEstado(){
        return rbtCompleta1.isSelected();        
    }
    
    public void error(String text){
        lbdError.setText(text);
    }
    
    public void limpiar(){
    
    textTituloTarea.setText("");
    textAreaDescripcion.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Groupo1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jmenuSalir;
    private javax.swing.JMenu jmenuTarea;
    private javax.swing.JLabel lbdError;
    private javax.swing.JLabel lbdEstadoTarea;
    private javax.swing.JLabel lbdTitulo;
    private javax.swing.JLabel lbdTituloTarea;
    private javax.swing.JMenuItem menuItemListar;
    private javax.swing.JRadioButton rbtCompleta1;
    private javax.swing.JRadioButton rbtPendiente;
    private javax.swing.JTextArea textAreaDescripcion;
    private javax.swing.JTextField textTituloTarea;
    // End of variables declaration//GEN-END:variables

}
