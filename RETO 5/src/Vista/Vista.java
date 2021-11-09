package Vista;

/** @author Angela DIaz */

public class Vista extends javax.swing.JFrame {
    
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        BackConsulta = new javax.swing.JPanel();
        jPanelCons = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btonConsultar = new javax.swing.JButton();
        BackNuevoCliente = new javax.swing.JPanel();
        jPanelDatosClien = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldnombre1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldnombre2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldapellido1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldapellido2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldnacionalidad = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextFieldcorreo = new javax.swing.JTextField();
        btonCargarDatos = new javax.swing.JToggleButton();
        btonActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btonEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackConsulta.setBackground(new java.awt.Color(0, 0, 0));
        BackConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 102, 255)));
        BackConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCons.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TABLA DE DATOS DE CLIENTES");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanelConsLayout = new javax.swing.GroupLayout(jPanelCons);
        jPanelCons.setLayout(jPanelConsLayout);
        jPanelConsLayout.setHorizontalGroup(
            jPanelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(181, 181, 181))
        );
        jPanelConsLayout.setVerticalGroup(
            jPanelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackConsulta.add(jPanelCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 20));

        jTableClientes.setBackground(new java.awt.Color(0, 0, 0));
        jTableClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        jTableClientes.setForeground(new java.awt.Color(255, 255, 255));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRIMER NOMBRE", "SEGUNDO NOMBRE", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "NACIONALIDAD", "CORREO ELECTRÓNICO"
            }
        ));
        jTableClientes.setGridColor(new java.awt.Color(51, 153, 255));
        jScrollPane1.setViewportView(jTableClientes);

        BackConsulta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 640, 120));

        btonConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btonConsultar.setText("CONSULTAR TABLA CLIENTES");
        btonConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackConsulta.add(btonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 260, 40));

        Background.add(BackConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 660, 250));

        BackNuevoCliente.setBackground(new java.awt.Color(0, 0, 0));
        BackNuevoCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 102, 255)));
        BackNuevoCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatosClien.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DATOS DEL CLIENTE");

        javax.swing.GroupLayout jPanelDatosClienLayout = new javax.swing.GroupLayout(jPanelDatosClien);
        jPanelDatosClien.setLayout(jPanelDatosClienLayout);
        jPanelDatosClienLayout.setHorizontalGroup(
            jPanelDatosClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel2)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanelDatosClienLayout.setVerticalGroup(
            jPanelDatosClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BackNuevoCliente.add(jPanelDatosClien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 20));

        jTextFieldnombre1.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldnombre1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldnombre1.setBorder(null);
        jTextFieldnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnombre1ActionPerformed(evt);
            }
        });
        BackNuevoCliente.add(jTextFieldnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 20));
        BackNuevoCliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Primer nombre");
        BackNuevoCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Segundo nombre");
        BackNuevoCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jTextFieldnombre2.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldnombre2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldnombre2.setBorder(null);
        BackNuevoCliente.add(jTextFieldnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 20));
        BackNuevoCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 140, -1));

        jTextFieldapellido1.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldapellido1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldapellido1.setBorder(null);
        BackNuevoCliente.add(jTextFieldapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 20));
        BackNuevoCliente.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, -1));
        BackNuevoCliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Segundo apellido");
        BackNuevoCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jTextFieldapellido2.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldapellido2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldapellido2.setBorder(null);
        BackNuevoCliente.add(jTextFieldapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, 20));
        BackNuevoCliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 140, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Primer apellido");
        BackNuevoCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        BackNuevoCliente.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nacionalidad");
        BackNuevoCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jTextFieldnacionalidad.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldnacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldnacionalidad.setBorder(null);
        BackNuevoCliente.add(jTextFieldnacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 310, 20));
        BackNuevoCliente.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 310, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo electrónico");
        BackNuevoCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        BackNuevoCliente.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 310, -1));

        jTextFieldcorreo.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldcorreo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldcorreo.setBorder(null);
        BackNuevoCliente.add(jTextFieldcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 310, 20));

        btonCargarDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btonCargarDatos.setText("Cargar información");
        btonCargarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackNuevoCliente.add(btonCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 170, 30));

        btonActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btonActualizar.setText("ACTUALIZAR DATOS ");
        btonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackNuevoCliente.add(btonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 260, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(Seleccione la fila en la tabla del cliente a modificar) ");
        BackNuevoCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 250, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/001-feedback.png"))); // NOI18N
        BackNuevoCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 130, 140));

        Background.add(BackNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 660, 300));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btonRegistrar.setText("REGISTRAR NUEVO CLIENTE");
        btonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/033-comment.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 300));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btonEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btonEliminar.setText("ELIMINAR CLIENTE");
        btonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 260, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(Seleccione la fila en la tabla del cliente a elimiinar) ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/018-customer satisfaction.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 150));

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 260, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnombre1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackConsulta;
    public javax.swing.JPanel BackNuevoCliente;
    private javax.swing.JPanel Background;
    public javax.swing.JButton btonActualizar;
    public javax.swing.JToggleButton btonCargarDatos;
    public javax.swing.JButton btonConsultar;
    public javax.swing.JButton btonEliminar;
    public javax.swing.JButton btonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCons;
    private javax.swing.JPanel jPanelDatosClien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JTable jTableClientes;
    public javax.swing.JTextField jTextFieldapellido1;
    public javax.swing.JTextField jTextFieldapellido2;
    public javax.swing.JTextField jTextFieldcorreo;
    public javax.swing.JTextField jTextFieldnacionalidad;
    public javax.swing.JTextField jTextFieldnombre1;
    public javax.swing.JTextField jTextFieldnombre2;
    // End of variables declaration//GEN-END:variables
}
