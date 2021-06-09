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
public class JFPag1 extends javax.swing.JFrame {

    Datos dataPag1 = new Datos();
    Ventanas ventana = new Ventanas(this);
    static String nombreUsuario;  
    public JFPag1(String usuario) {
        initComponents();
        nombreUsuario = usuario;
        LblNombre.setText("Hola "+usuario);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup RGroupPag1 = new javax.swing.ButtonGroup();
        LblPag1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ChkPreg1 = new javax.swing.JCheckBox();
        ChkPreg2 = new javax.swing.JCheckBox();
        ChkPreg3 = new javax.swing.JCheckBox();
        ChkPreg4 = new javax.swing.JCheckBox();
        BtnSiguientePag1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Rbt1 = new javax.swing.JRadioButton();
        Rbt2 = new javax.swing.JRadioButton();
        Rbt3 = new javax.swing.JRadioButton();
        Rbt4 = new javax.swing.JRadioButton();
        LblMensaje = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 600));
        setSize(new java.awt.Dimension(650, 600));

        LblPag1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblPag1.setText("Página 1");

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("CADA PREGUNTA TIENE UN VALOR DEL 20%");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pregunta 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("¿Cuáles de las siguientes instrucciones permiten imprimir los números desde 5 hasta 1 en java?");

        ChkPreg1.setText("for(int i=5;i>=1;i--){ System.out.println(i); } ");
        ChkPreg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkPreg1ActionPerformed(evt);
            }
        });

        ChkPreg2.setText("for(int i=5;i>0;i--){ System.out.println(i); } ");

        ChkPreg3.setText("for(int i=1;i>=5;i++){ System.out.println(i); } ");
        ChkPreg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkPreg3ActionPerformed(evt);
            }
        });

        ChkPreg4.setText("for(int i=5;i>=5;i--){System.out.println(i); } ");

        BtnSiguientePag1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnSiguientePag1.setForeground(new java.awt.Color(0, 153, 153));
        BtnSiguientePag1.setText("-->");
        BtnSiguientePag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguientePag1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Pregunta 2");

        jLabel5.setText("Dado el arreglo A [1, 2, 3, 4, 5] y el arreglo B [6, 7, 8, 9, 0]. Ambos tipo entero y de 5 posiciones.");

        jLabel6.setText("La instrucción “int suma = A[3] + B[7];”, dará como resultado que variable suma tendrá el valor:");

        RGroupPag1.add(Rbt1);
        Rbt1.setText("12");

        RGroupPag1.add(Rbt2);
        Rbt2.setText("10");

        RGroupPag1.add(Rbt3);
        Rbt3.setText("Un error en tiempo de ejecución");

        RGroupPag1.add(Rbt4);
        Rbt4.setText("Ninguna de las anteriores.");

        LblMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMensaje.setForeground(new java.awt.Color(255, 51, 51));

        LblNombre.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChkPreg2)
                                .addGap(65, 65, 65)
                                .addComponent(ChkPreg4))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChkPreg1)
                                .addGap(57, 57, 57)
                                .addComponent(ChkPreg3))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rbt1)
                                .addGap(42, 42, 42)
                                .addComponent(Rbt2)
                                .addGap(48, 48, 48)
                                .addComponent(Rbt3)
                                .addGap(28, 28, 28)
                                .addComponent(Rbt4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(LblPag1)
                        .addGap(127, 127, 127)
                        .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(LblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnSiguientePag1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblPag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkPreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChkPreg3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkPreg2)
                    .addComponent(ChkPreg4))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rbt1)
                    .addComponent(Rbt2)
                    .addComponent(Rbt3)
                    .addComponent(Rbt4))
                .addGap(25, 25, 25)
                .addComponent(LblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnSiguientePag1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChkPreg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkPreg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkPreg1ActionPerformed

    private void BtnSiguientePag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguientePag1ActionPerformed
    boolean selecPreg2 =false;
    
     
        if(ChkPreg1.isSelected()||ChkPreg2.isSelected()||ChkPreg3.isSelected()||ChkPreg4.isSelected())
        {
            if(Rbt1.isSelected()||Rbt2.isSelected()||Rbt3.isSelected()||Rbt4.isSelected())
            {
                
                this.dataPag1.Pregunta1_1 = ChkPreg1.isSelected();
                this.dataPag1.Pregunta1_2 = ChkPreg2.isSelected();
                this.dataPag1.Pregunta1_3 = ChkPreg3.isSelected();
                this.dataPag1.Pregunta1_4 = ChkPreg4.isSelected();
                this.dataPag1.Pregunta2_1 = Rbt1.isSelected();                
                this.dataPag1.Pregunta2_2 = Rbt2.isSelected();
                this.dataPag1.Pregunta2_3 = Rbt3.isSelected();
                this.dataPag1.Pregunta2_4 = Rbt4.isSelected();

                JFpag2 pag2 = new JFpag2(nombreUsuario,dataPag1);

                ventana.ocutarVentana();
                ventana.abrirVentana(pag2);
            }
            else
            { 
                LblMensaje.setText("Debes elegir una respuesta de la pregunta 2");
            }
        }
        else
        {   
            LblMensaje.setText( "Debes elegir una o mas respuesta de la pregunta 1");
        }
       
    }//GEN-LAST:event_BtnSiguientePag1ActionPerformed

    private void ChkPreg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkPreg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkPreg3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFPag1(nombreUsuario).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSiguientePag1;
    private javax.swing.JCheckBox ChkPreg1;
    private javax.swing.JCheckBox ChkPreg2;
    private javax.swing.JCheckBox ChkPreg3;
    private javax.swing.JCheckBox ChkPreg4;
    private javax.swing.JLabel LblMensaje;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblPag1;
    private javax.swing.JRadioButton Rbt1;
    private javax.swing.JRadioButton Rbt2;
    private javax.swing.JRadioButton Rbt3;
    private javax.swing.JRadioButton Rbt4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
