package Miaubarrotes;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.DefaultListModel;


 /*
 * @author tomas
 */
public final class Productos extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
    DefaultListModel<String> listModel = new DefaultListModel<>();
    Statement st;
    private int totalVentas = 0;
    private String clienteSeleccionado;
    
    public Productos(String clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
        initComponents();
        llenarTabla();
        setLocationRelativeTo(null);
        
        lstCarrito.setModel(listModel);
        
        //una forma de llamar a las columnas
        /*String pro [] = {"Nombre del Producto","Precio","Stock"};     
        model.setColumnIdentifiers(pro);
        tblProductos.setModel(model);*/
       
        
        txtProductos.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filtroProductos();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filtroProductos();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filtroProductos();
            }
        });
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipoPago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCarrito = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnAgregarCa = new javax.swing.JButton();
        rbtDebito = new javax.swing.JRadioButton();
        rbtCredito = new javax.swing.JRadioButton();
        rbtEfectivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtProductos = new javax.swing.JTextField();
        btnIrProo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Productos");

        lstCarrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lstCarritoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(lstCarrito);

        jLabel5.setText("Carrito ");

        btnPagar.setText("Pagar");
        btnPagar.setEnabled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnAgregarCa.setText("Agregar a Carrito");
        btnAgregarCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCaActionPerformed(evt);
            }
        });

        btgTipoPago.add(rbtDebito);
        rbtDebito.setText("Debito");
        rbtDebito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtDebitoItemStateChanged(evt);
            }
        });
        rbtDebito.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                rbtDebitoMouseMoved(evt);
            }
        });
        rbtDebito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbtDebitoMouseExited(evt);
            }
        });

        btgTipoPago.add(rbtCredito);
        rbtCredito.setText("Credito");
        rbtCredito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtCreditoItemStateChanged(evt);
            }
        });

        btgTipoPago.add(rbtEfectivo);
        rbtEfectivo.setText("Efectivo");
        rbtEfectivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtEfectivoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Tipo Pago");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblProductosMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductos);

        btnIrProo.setText("Ver Empleados");
        btnIrProo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrProoActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar Producto");

        btnBuscarP.setText("Buscar producto");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIrProo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCa)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnBuscarP))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(218, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtDebito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtCredito)
                        .addGap(12, 12, 12)
                        .addComponent(rbtEfectivo)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarCa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIrProo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        //Tienda tienda = new Tienda();
        //tienda.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void rbtEfectivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtEfectivoItemStateChanged
        // TODO add your handling code here:
        if(rbtEfectivo.isSelected()){
            btnPagar.setEnabled(true);
        }else{
            btnPagar.setEnabled(false);
        }
    }//GEN-LAST:event_rbtEfectivoItemStateChanged

    private void rbtCreditoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtCreditoItemStateChanged
        // TODO add your handling code here:
        if(rbtCredito.isSelected()){
            btnPagar.setEnabled(true);
        }else{
            btnPagar.setEnabled(false);
        }
    }//GEN-LAST:event_rbtCreditoItemStateChanged

    private void rbtDebitoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtDebitoMouseExited
        jPanel1.setBackground(Color.cyan);
    }//GEN-LAST:event_rbtDebitoMouseExited

    private void rbtDebitoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtDebitoMouseMoved
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_rbtDebitoMouseMoved

    private void rbtDebitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtDebitoItemStateChanged

        if(rbtDebito.isSelected()){
            btnPagar.setEnabled(true);
        }else{
            btnPagar.setEnabled(false);
        }
    }//GEN-LAST:event_rbtDebitoItemStateChanged


    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed

        
        String selec;
        if(rbtDebito.isSelected()){
            selec = "Debito";
        }else if(rbtCredito.isSelected()){
            selec = "Credito";
        }else if(rbtEfectivo.isSelected()){
            selec = "Efectivo";
        }else{
            selec = "ninguna forma de pago seleccionada";
        }
        JOptionPane.showMessageDialog(null, "Cliente: "+ clienteSeleccionado + "\nAtendido por:" + "\nTotal a pagar: $" + totalVentas + "\nForma de pago: " + selec, "Boleta", 1);
        listModel.clear();
        totalVentas = 0;
        btnPagar.setText("Pagar"); 
    }//GEN-LAST:event_btnPagarActionPerformed


   
    
    private void btnIrProoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrProoActionPerformed
        Empleados emp = new Empleados();
        emp.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnIrProoActionPerformed

    private void tblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseEntered
        tblProductos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_tblProductosMouseEntered

    private void tblProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseExited
        tblProductos.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }//GEN-LAST:event_tblProductosMouseExited

    private void btnAgregarCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCaActionPerformed
        int item_selec = tblProductos.getSelectedRow();

        if (item_selec != -1) { // Verificar si se ha seleccionado una fila
            String nom_producto = tblProductos.getValueAt(item_selec, 0).toString(); // Nombre del producto
            int precio = Integer.parseInt(tblProductos.getValueAt(item_selec, 1).toString()); // Precio del producto
            int stock = Integer.parseInt(tblProductos.getValueAt(item_selec, 2).toString()); // Stock del producto

            // Verificar si hay suficiente stock
            if (stock > 0) {
                // Crear el String con el nombre y el precio del producto
                String producto_info = nom_producto + " $" + precio;

                // Agregar el producto al JList del carrito
                listModel.addElement(producto_info);

                // Actualizar el total de ventas sumando el precio del producto
                totalVentas += precio;

                // Mostrar el total de ventas actualizado en un JLabel (suponiendo que tienes un JLabel llamado lblTotalVentas)
                btnPagar.setText("Total de ventas: $" + totalVentas);

                // Reducir el stock del producto seleccionado
                stock--;

                // Actualizar el stock en la tabla (JTable) o en la base de datos
                tblProductos.setValueAt(stock, item_selec, 2); // Actualizar en la tabla de productos

                // Aquí deberías llamar a un método o función para actualizar el stock en la base de datos
                // Por ejemplo, podrías tener un método como actualizarStockProducto(nom_producto, stock);

                // Actualizar la tabla de productos (si es necesario)
                llenarTabla(); // Esto debería refrescar la tabla de productos si se modifica el stock en la base de datos
                
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible.", "Productos", JOptionPane.ERROR_MESSAGE);     
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún Producto", "Productos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarCaActionPerformed

    private void lstCarritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstCarritoKeyPressed
        JOptionPane.showMessageDialog(rootPane, "Hola");
    }//GEN-LAST:event_lstCarritoKeyPressed

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        String buscarP = txtProductos.getText();
        BuscarProducto(buscarP);
        
    }//GEN-LAST:event_btnBuscarPActionPerformed

    public void llenarTabla() {
        try (Connection conex = Conexion.getConnection()){       
            // Limpiar todas las filas existentes
            model.setRowCount(0);
        
            // Asegurarse de que las columnas están configuradas
            if (model.getColumnCount() == 0) {
                model.addColumn("Nombre del Producto");
                model.addColumn("Precio");
                model.addColumn("Stock");
            }
        
            // Ejecutar la consulta SQL
            st = conex.createStatement();
            ResultSet lista = st.executeQuery("SELECT nom_producto, precio, stock FROM producto");
        
            // Crear un array para almacenar los datos de cada fila
            Object[] prod = new Object[3];
        
            // Recorrer los resultados de la consulta
            while (lista.next()) {
                prod[0] = lista.getString("nom_producto");
                prod[1] = lista.getInt("precio");
                prod[2] = lista.getInt("stock");
            
                // Agregar una nueva fila al modelo de la tabla
                model.addRow(prod);
            }
            
            // Establecer el modelo actualizado en la tabla
            tblProductos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo anda mal: " + ex.getMessage(), "Conexión", JOptionPane.ERROR_MESSAGE);
        }      
    }
    
    
    private void filtroProductos() {
        
        String buscarP = txtProductos.getText().trim();
        if (buscarP.isEmpty()) {
            llenarTabla(); // Si el campo de búsqueda está vacío, mostrar todos los productos
        } else {
            BuscarProducto(buscarP); // Si hay texto en el campo, realizar la búsqueda
        }
    }
    
    public void BuscarProducto(String buscarP) {       
        if (buscarP == null || buscarP.trim().isEmpty()){       
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de producto para buscar.", "Advertencia", 2);           
            return;         
        }
        try (Connection conex = Conexion.getConnection()) {
            // Preparar la consulta SQL
            String select = "SELECT nom_producto, precio, stock FROM producto WHERE nom_producto = ?";
            try (PreparedStatement ps = conex.prepareStatement(select)) {
                ps.setString(1, buscarP);
                try (ResultSet lista = ps.executeQuery()) {
                    // Comprobar si el ResultSet está vacío
                    if (!lista.isBeforeFirst()) {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado.", "Resultado de la búsqueda", 2);
                    } else {
                        // Limpiar todas las filas existentes
                        model.setRowCount(0);
                        // Asegurarse de que las columnas están configuradas, es para colocarle nombre a las columnas
                        if (model.getColumnCount() == 0) {
                            model.addColumn("Nombre del Producto");
                            model.addColumn("Precio");
                            model.addColumn("Stock");
                        }
                        // Crear un array para almacenar los datos de cada fila
                        Object[] prod = new Object[3];
                    
                        // Recorrer los resultados de la consulta
                        while (lista.next()) {
                            prod[0] = lista.getString("nom_producto");
                            prod[1] = lista.getInt("precio");
                            prod[2] = lista.getInt("stock");
                        
                            // Agregar una nueva fila al modelo de la tabla
                            model.addRow(prod);
                        }
                        // Establecer el modelo actualizado en la tabla
                        tblProductos.setModel(model);
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo anda mal: " + ex.getMessage(), "Conexión", 3);
        }
    }
    

    
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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.ButtonGroup btgTipoPago;
    private javax.swing.JButton btnAgregarCa;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnIrProo;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstCarrito;
    private javax.swing.JRadioButton rbtCredito;
    private javax.swing.JRadioButton rbtDebito;
    private javax.swing.JRadioButton rbtEfectivo;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtProductos;
    // End of variables declaration//GEN-END:variables
}
