package Vistas;

import Controlador.ComboboxSucursal;
import Modelo.Conexion;
import Controlador.EnumTipoDocumento;
import Modelo.Sucursal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AddUserForm extends javax.swing.JDialog {
    ComboBoxModel modeloEnumTipoDocumento;
    Conexion con = new Conexion();
    Connection cn;
    //Esta libreria Statement nos permite ejecutar codigo Query SQL
    Statement st;
    ResultSet rs;
    ArrayList mListaSucursales;
    ComboboxSucursal instanciaClaseComboboxSucursal;
    
    public AddUserForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        modeloEnumTipoDocumento = new DefaultComboBoxModel(EnumTipoDocumento.values());
        initComponents();
        instanciaClaseComboboxSucursal = new ComboboxSucursal();
        mListaSucursales = new ArrayList();
        llenarComboboxSucursales();
        this.setLocationRelativeTo(parent);
    }

    public String llenarComboboxSucursales () {
        
        
        mListaSucursales = instanciaClaseComboboxSucursal.getListaSucursales();
        Iterator iterator = mListaSucursales.iterator();
        
        while (iterator.hasNext()) {
            
            Sucursal sucursal = (Sucursal) iterator.next();
            cbSucursal.addItem(sucursal);
            System.out.println(sucursal );
            
        }
        
        String nombreSucursal = cbSucursal.getSelectedItem().toString();
        String query = "SELECT idSucursal FROM `sucursal` WHERE nombreSucursal = '" + nombreSucursal + "';";
        return query;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoNueUsu = new javax.swing.JTextField();
        txtNombreNueUsu = new javax.swing.JTextField();
        cbTipDocuNueUsu = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDocumentoNueUsu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoNueUsu = new javax.swing.JTextField();
        btnGurdar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        btnSubirFoto = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setText("FORMULARIO REGISTRO");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Tipo de documento:");

        txtApellidoNueUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoNueUsuActionPerformed(evt);
            }
        });

        txtNombreNueUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreNueUsuActionPerformed(evt);
            }
        });

        cbTipDocuNueUsu.setModel(modeloEnumTipoDocumento);
        cbTipDocuNueUsu.setToolTipText("");
        cbTipDocuNueUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipDocuNueUsuActionPerformed(evt);
            }
        });

        jLabel6.setText("Documento:");

        txtDocumentoNueUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoNueUsuActionPerformed(evt);
            }
        });

        jLabel7.setText("Correo:");

        txtCorreoNueUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoNueUsuActionPerformed(evt);
            }
        });

        btnGurdar.setText("Guardar");
        btnGurdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGurdarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Sucursal:");

        btnSubirFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/avatarUserMini.png"))); // NOI18N
        btnSubirFoto.setText("Subir Foto");
        btnSubirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGurdar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(txtDocumentoNueUsu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreNueUsu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoNueUsu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoNueUsu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipDocuNueUsu, 0, 165, Short.MAX_VALUE)
                    .addComponent(cbSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnSubirFoto)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreNueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoNueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbTipDocuNueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocumentoNueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubirFoto)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreoNueUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGurdar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoNueUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoNueUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoNueUsuActionPerformed

    private void txtNombreNueUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreNueUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreNueUsuActionPerformed

    private void txtDocumentoNueUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoNueUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoNueUsuActionPerformed

    private void cbTipDocuNueUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipDocuNueUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipDocuNueUsuActionPerformed

    private void txtCorreoNueUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoNueUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoNueUsuActionPerformed

    private void btnGurdarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGurdarActionPerformed
        
        String name = txtNombreNueUsu.getText();
        String lastName = txtApellidoNueUsu.getText();
        String docuementType = cbTipDocuNueUsu.getSelectedItem().toString();
        String document = txtDocumentoNueUsu.getText();
        String email = txtCorreoNueUsu.getText();
        String queryNombreSucursal = llenarComboboxSucursales();
        System.out.println(queryNombreSucursal);
      
        if (name.isEmpty() || lastName.isEmpty() || document.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan campos por diligenciar", "Nuevo empleado", JOptionPane.WARNING_MESSAGE);
        } else {
            
            try {
                
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(queryNombreSucursal);
                
                while (rs.next()) {
                    
                    int idSucursal = rs.getInt("idSucursal");
                    String queryCrearEmpleado = "INSERT INTO empleado(`nombreEmp`, `apellidos`,`tipoDocumento`,`documento`, `correo`, `FK_idSucursal`) VALUES ('" + name + "','" + lastName + "','" + docuementType + "','" + document + "','" + email + "'," + idSucursal + ")";
                    System.out.println(queryCrearEmpleado);
                    
                    try {
                        
                        cn = con.getConnection();
                        st = cn.createStatement();
                        st.executeUpdate(queryCrearEmpleado);
                        JOptionPane.showMessageDialog(this, "Registro exitoso", "Nuevo empleado", JOptionPane.INFORMATION_MESSAGE);
                    
                    } catch (SQLException e) {
                        
                    JOptionPane.showMessageDialog(this, "No se pudo crear el empleado", "Nuevo empleado", JOptionPane.ERROR_MESSAGE);
                    
                    }
                    
                }
                
            } catch (SQLException e) {
                
                System.out.println(e);
                
            }
            
        }
        
        this.dispose();
        
    }//GEN-LAST:event_btnGurdarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSubirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirFotoActionPerformed
        //CargueArchivos cargueFoto = new CargueArchivos(parent, true);
        //cargueFoto.setVisible(true);
    }//GEN-LAST:event_btnSubirFotoActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddUserForm dialog = new AddUserForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGurdar;
    private javax.swing.JButton btnSubirFoto;
    private javax.swing.JComboBox<Sucursal> cbSucursal;
    private javax.swing.JComboBox<String> cbTipDocuNueUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoNueUsu;
    private javax.swing.JTextField txtCorreoNueUsu;
    private javax.swing.JTextField txtDocumentoNueUsu;
    private javax.swing.JTextField txtNombreNueUsu;
    // End of variables declaration//GEN-END:variables
}
