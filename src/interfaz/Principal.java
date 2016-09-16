/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Cuenta;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Principal extends javax.swing.JFrame {

     Cuenta c;
    public Principal() {
        initComponents();
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
        cmdCrear = new javax.swing.JButton();
        cmdIngresar = new javax.swing.JButton();
        cmdRetirar = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextArea();
        txtSaldo = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear cuenta");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, -1));

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 110, -1));

        cmdRetirar.setText("Retirar");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 110, -1));

        cmdActualizar.setText("Actualizar Saldo");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de cuenta"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInformacion.setColumns(20);
        txtInformacion.setRows(5);
        jScrollPane2.setViewportView(txtInformacion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 160));

        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, -1));

        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, -1));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CUENTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setText("Identificacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 20));

        jLabel3.setText("Saldo De Cuenta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setText("No. de Cuenta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 44, 90, 20));

        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });
        jPanel1.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 100, -1));

        jLabel6.setText("Interes Anual:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 20));

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        long Inde , Cuen,Saldo ;
      
        if(txtIdentificacion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero de identificacion del cliente");
            txtIdentificacion.requestFocusInWindow();
        }else if(txtCuenta.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero de cuenta del cliente");
            txtCuenta.requestFocusInWindow();
        }else if(txtSaldo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite Saldo del cliente");
            txtSaldo.requestFocusInWindow();
        }else if(txtInteres.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el interes de la cuenta del cliente");
            txtInteres.requestFocusInWindow();
        }else{
        Inde = Long.parseLong(txtIdentificacion.getText());
        Cuen = Long.parseLong(txtCuenta.getText());
        Saldo = Long.parseLong(txtSaldo.getText());
        c = new Cuenta (Inde , Cuen, Saldo);
        JOptionPane.showMessageDialog(this, "Cuenta Creada");
      }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
      String aux;
      
      
      aux = c.mostrar();
        
      txtInformacion.append(aux);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
     double retirar;
        
        retirar = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite la cantidad que desea retirar"));
        
        c.retirar(retirar);
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
       double saldo;
       
       saldo = Double.parseDouble (JOptionPane.showInputDialog(this, "Digite la cantidad que desea agregar"));
       
       c.ingresar(saldo);
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
     double inte;
       
       inte = Double.parseDouble (txtInteres.getText());
       
       c.actulizarSaldo(inte);
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      txtCuenta.setText("");
      txtIdentificacion.setText("");
      txtInformacion.setText("");
      txtInteres.setText("");
      txtSaldo.setText("");
      
      
      txtCuenta.requestFocusInWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtSaldoKeyTyped

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteresKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextArea txtInformacion;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
