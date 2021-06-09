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
    static String nombreUsuario;
    JFPag1 pag1;
    static Datos datoPag2;
    
    public JFpag2(String usuario, Datos datoPag1) {
        initComponents();
        nombreUsuario = usuario;
        lblNombre.setText("Hola "+nombreUsuario);
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
        setPreferredSize(new java.awt.Dimension(650, 800));
        setSize(new java.awt.Dimension(650, 800));

        LblPag1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblPag1.setText("Página 2");

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PREGUNTA 3, VALOR DEL 20%");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pregunta 3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("El resultado del siguiente algoritmo es:");

        jLabel4.setText("try{");

        jLabel5.setText("int A[]= new int[5];");

        jLabel6.setText("A[4]=0;");

        jLabel7.setText("A[3]=1;");

        jLabel8.setText("A[2]=2;");

        jLabel9.setText("A[1]=3;");

        jLabel10.setText("A[0]=4;");

        jLabel11.setText("int valor = A[0]- ( A[1]+A[3] );");

        jLabel12.setText("int valorFinal = A[0] / valor;");

        jLabel13.setText("System.out.println(\"División exitosa, el resultado es:\"+valorFinal);");

        jLabel14.setText("}");

        jLabel15.setText("catch(Exception ex){");

        jLabel16.setText("System.out.println(\"Error al dividir por cero\");");

        jLabel17.setText("}");

        ChkOpt1.setText("A) División exitosa, el resultado es 0;");
        ChkOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt1ActionPerformed(evt);
            }
        });

        ChkOpt2.setText("B) División exitosa, el resultado es 1;");
        ChkOpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnPag2Siguiente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnPag2Siguiente.setForeground(new java.awt.Color(0, 102, 102));
        BtnPag2Siguiente.setText("-->");
        BtnPag2Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPag2SiguienteActionPerformed(evt);
            }
        });

        ChkOpt3.setText("C) Error al dividir por cero");
        ChkOpt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt3ActionPerformed(evt);
            }
        });

        ChkOpt4.setText("D) Ninguno d ellos anteriores");
        ChkOpt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkOpt4ActionPerformed(evt);
            }
        });

        LblMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMensaje.setForeground(new java.awt.Color(255, 51, 51));

        lblNombre.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(312, 312, 312)
                                    .addComponent(BtnPag2Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ChkOpt1)
                                        .addComponent(ChkOpt3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ChkOpt4)
                                        .addComponent(ChkOpt2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16))
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(LblPag1)
                        .addGap(121, 121, 121)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblPag1)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(2, 2, 2)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkOpt1)
                    .addComponent(ChkOpt2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkOpt3)
                    .addComponent(ChkOpt4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(LblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPag2Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pag1= new JFPag1(nombreUsuario);
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
           Datos dato = new Datos();
           JFpag3 pag3 = new JFpag3(nombreUsuario,datoPag2);
           dato.setPregunta3(ChkOpt3.isSelected());
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
            new JFpag2(nombreUsuario,datoPag2).setVisible(true);
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
