/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author reisa
 */
public class JFpag2 extends javax.swing.JFrame {

    Ventanas ventana = new Ventanas(this);
    static Persona usuario;
    JFPag1 pag1;
    static Datos datoPag2;
    
    public JFpag2(Persona user, Datos datoPag1) {
        initComponents();
        usuario = user;
        lblNombre.setText("Hola "+usuario._Nombre);
        this.datoPag2=datoPag1;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblPag1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ChkOpt1 = new javax.swing.JCheckBox();
        ChkOpt2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        BtnPag2Siguiente = new javax.swing.JButton();
        ChkOpt3 = new javax.swing.JCheckBox();
        ChkOpt4 = new javax.swing.JCheckBox();
        LblMensaje = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 700));
        setSize(new java.awt.Dimension(650, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblPag1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblPag1.setText("Página 2");
        getContentPane().add(LblPag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 11, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PREGUNTA 3, VALOR DEL 20%");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 66, 507, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pregunta 3");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 101, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("El resultado del siguiente algoritmo es:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 129, -1, -1));

        jLabel4.setText("try{");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 154, -1, -1));

        jLabel5.setText("int A[]= new int[5];");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 167, 134, -1));

        jLabel6.setText("A[4]=0;");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 187, -1, -1));

        jLabel7.setText("A[3]=1;");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 207, -1, -1));

        jLabel8.setText("A[2]=2;");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 227, -1, -1));

        jLabel9.setText("A[1]=3;");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 247, -1, -1));

        jLabel10.setText("A[0]=4;");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 267, -1, -1));

        jLabel11.setText("int valor = A[0]- ( A[1]+A[3] );");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 287, -1, -1));

        jLabel12.setText("int valorFinal = A[0] / valor;");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 307, -1, -1));

        jLabel13.setText("System.out.println(\"División exitosa, el resultado es:\"+valorFinal);");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 327, -1, -1));

        jLabel14.setText("}");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 347, -1, -1));

        jLabel15.setText("catch(Exception ex){");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 347, -1, -1));

        jLabel16.setText("System.out.println(\"Error al dividir por cero\");");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 367, -1, -1));

        jLabel17.setText("}");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 383, -1, -1));

        ChkOpt1.setText("A) División exitosa, el resultado es 0;");
        ChkOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt1ActionPerformed(evt);
            }
        });
        getContentPane().add(ChkOpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 415, -1, -1));

        ChkOpt2.setText("B) División exitosa, el resultado es 1;");
        ChkOpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt2ActionPerformed(evt);
            }
        });
        getContentPane().add(ChkOpt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 415, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 527, 83, 51));

        BtnPag2Siguiente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnPag2Siguiente.setForeground(new java.awt.Color(0, 102, 102));
        BtnPag2Siguiente.setText("-->");
        BtnPag2Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPag2SiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPag2Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 529, 88, 47));

        ChkOpt3.setText("C) Error al dividir por cero");
        ChkOpt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt3ActionPerformed(evt);
            }
        });
        getContentPane().add(ChkOpt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 456, -1, -1));

        ChkOpt4.setText("D) Ninguno d ellos anteriores");
        ChkOpt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt4ActionPerformed(evt);
            }
        });
        getContentPane().add(ChkOpt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 456, -1, -1));

        LblMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMensaje.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(LblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 481, 329, 35));

        lblNombre.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 11, 189, 22));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pag1= new JFPag1(usuario);
        ventana.ocutarVentana();
        ventana.abrirVentana(pag1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ChkOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt1ActionPerformed
        if(ChkOpt1.isSelected()){
           ChkOpt2.setEnabled(false);
           ChkOpt3.setEnabled(false);
           ChkOpt4.setEnabled(false);
        }else{
            ChkOpt2.setEnabled(true);
            ChkOpt3.setEnabled(true);
            ChkOpt4.setEnabled(true);
        }
       
    }//GEN-LAST:event_ChkOpt1ActionPerformed

    private void ChkOpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt2ActionPerformed
         if(ChkOpt2.isSelected()){
           ChkOpt1.setEnabled(false);
           ChkOpt3.setEnabled(false);
           ChkOpt4.setEnabled(false);
        }else{
            ChkOpt1.setEnabled(true);
            ChkOpt3.setEnabled(true);
            ChkOpt4.setEnabled(true);
        }
       
    }//GEN-LAST:event_ChkOpt2ActionPerformed

    private void ChkOpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt3ActionPerformed
        if(ChkOpt3.isSelected()){
           ChkOpt1.setEnabled(false);
           ChkOpt2.setEnabled(false);
           ChkOpt4.setEnabled(false);
        }else{
            ChkOpt1.setEnabled(true);
            ChkOpt2.setEnabled(true);
            ChkOpt4.setEnabled(true);
        }
    }//GEN-LAST:event_ChkOpt3ActionPerformed

    private void ChkOpt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkOpt4ActionPerformed
       if(ChkOpt4.isSelected()){
           ChkOpt1.setEnabled(false);
           ChkOpt2.setEnabled(false);
           ChkOpt3.setEnabled(false);
        }else{
            ChkOpt1.setEnabled(true);
            ChkOpt2.setEnabled(true);
            ChkOpt3.setEnabled(true);
        }
    }//GEN-LAST:event_ChkOpt4ActionPerformed

    private void BtnPag2SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPag2SiguienteActionPerformed
       
        if(ChkOpt1.isSelected()||ChkOpt2.isSelected()||ChkOpt3.isSelected()||ChkOpt4.isSelected())
        {
            datoPag2.Pregunta3_1 =ChkOpt1.isSelected();            
            datoPag2.Pregunta3_2 =ChkOpt2.isSelected();
            datoPag2.Pregunta3_3 =ChkOpt3.isSelected();
            datoPag2.Pregunta3_4 =ChkOpt4.isSelected();

           JFpag3 pag3 = new JFpag3(usuario,datoPag2);
           ventana.ocutarVentana();
           ventana.abrirVentana(pag3);
        }
        else
        {   
           LblMensaje.setText("Debes seleccionar una respuesta");
        }
    }//GEN-LAST:event_BtnPag2SiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(JFpag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFpag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFpag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFpag2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFpag2(usuario,datoPag2).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPag2Siguiente;
    private javax.swing.JCheckBox ChkOpt1;
    private javax.swing.JCheckBox ChkOpt2;
    private javax.swing.JCheckBox ChkOpt3;
    private javax.swing.JCheckBox ChkOpt4;
    private javax.swing.JLabel LblMensaje;
    private javax.swing.JLabel LblPag1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
