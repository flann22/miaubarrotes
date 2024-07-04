package Miaubarrotes;


import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public final class Tienda extends javax.swing.JFrame {

    Connection conex;
    Statement st;

    /**
     * Crea una nueva instancia de Tienda y conecta a la base de datos.
     */
    
    //DefaultTableModel model = new DefaultTableModel();
    
    public Tienda() {
        conectar();
        initComponents();
        setLocationRelativeTo(null);
        //llenarCombo();
        
        /*String datos [] = {"Nombre del Producto","Precio","Stock"};
        model.setColumnIdentifiers(datos);
        tblProductos.setModel(model);*/
    }

    /**
     * Método para establecer la conexión con la base de datos.
     */
    public void conectar() {
        String url = "jdbc:mysql://localhost:3306/miaubarrotes";
        String usuario = "root";
        String pass = "";
        try {
            conex = DriverManager.getConnection(url, usuario, pass);
            JOptionPane.showMessageDialog(null, "Conectado", "Conexión", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + ex.getMessage(), "Error", 2);
        }
    }
    
    private void mostrarImagen() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/resources/gato estirao-Photoroom.png")); // Ruta relativa desde el paquete del proyecto
        JLabel imagenLabel = new JLabel(icono);
        jPanel1.add(imagenLabel); // Asumiendo que jPanel1 es el panel donde quieres mostrar la imagen
    }
    
    public void guardar(String rut, String nombre, String fono, String dir){
        String insert="INSERT INTO cliente(rut,nombre,fono,dir) VALUES ('"+rut+"','"+nombre+"','"+fono+"','"+dir+"')";
        try{
            st=conex.createStatement();
            st.executeUpdate(insert);
            JOptionPane.showMessageDialog(null,"Se insertaron los datos","Conexion",1);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"no se insertaron los datos" + ex,"insert",2);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        lblNomC = new javax.swing.JLabel();
        lblFono = new javax.swing.JLabel();
        lblDir = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtFonoC = new javax.swing.JTextField();
        txtDirC = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setText("Miaubarrotes");

        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnPedido.setText("Crear  Pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        lblNomC.setText("Nombre Cliente");

        lblFono.setText("Fono");

        lblDir.setText("Direccion");

        txtNombreC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreCFocusLost(evt);
            }
        });

        txtFonoC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFonoCFocusLost(evt);
            }
        });

        txtDirC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDirCFocusLost(evt);
            }
        });

        btnAgregar.setText("Agregar Cliente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblRut.setText("Rut");

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });

        btnActualizar.setText("Actualizar datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomC, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreC)
                            .addComponent(txtFonoC)
                            .addComponent(txtDirC, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txtRut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomC)
                        .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFono)
                    .addComponent(txtFonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDir)
                    .addComponent(txtDirC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
                                        
        if (conex != null) {
            try {
                conex.close();
                JOptionPane.showMessageDialog(null, "Desconectado", "Conexión", 3);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar: " + ex.getMessage(), "Error", 2);
            }
        }
        System.exit(0);  
    }//GEN-LAST:event_btnSalirActionPerformed

    //mostrara la ventana productos
    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        Productos producto = new Productos();
        producto.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String rut = txtRut.getText();
        String nomCliente = txtNombreC.getText();
        String fono = txtFonoC.getText();
        String dir = txtDirC.getText();
        guardar(rut,nomCliente,fono,dir);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCFocusLost
        // TODO add your handling code here:
        txtNombreC.setBackground(Color.blue);
        lblNomC.setForeground(Color.red);
    }//GEN-LAST:event_txtNombreCFocusLost

    private void txtFonoCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFonoCFocusLost
        // TODO add your handling code here:
        txtFonoC.setBackground(Color.yellow);
        lblFono.setForeground(Color.green);
    }//GEN-LAST:event_txtFonoCFocusLost

    private void txtDirCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirCFocusLost
        // TODO add your handling code here:
        txtDirC.setBackground(Color.orange);
        lblDir.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_txtDirCFocusLost

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String rutA=txtRut.getText().trim();
        String DirA=txtDirC.getText().trim();
        String update="UPDATE cliente set dir='"+DirA+"'where rut='"+rutA+"'";
        try{
            st=conex.createStatement();
            st.executeUpdate(update);
            JOptionPane.showMessageDialog(null,"Datos actualizados","coneccion",3);
        }catch(SQLException ei){
            JOptionPane.showMessageDialog(null,"No funciono"+ei,"insert",3);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtRutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusGained
        // TODO add your handling code here:
        txtRut.setText("");
        txtNombreC.setText("");
        txtDirC.setText("");
        txtFonoC.setText("");
    }//GEN-LAST:event_txtRutFocusGained

    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
        // TODO add your handling code here:
        txtRut.setBackground(Color.cyan);
        lblRut.setForeground(Color.blue);
    }//GEN-LAST:event_txtRutFocusLost

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblFono;
    private javax.swing.JLabel lblNomC;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtDirC;
    private javax.swing.JTextField txtFonoC;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}