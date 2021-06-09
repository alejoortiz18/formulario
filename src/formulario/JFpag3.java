/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author reisa
 */
public class JFpag3 extends javax.swing.JFrame {
    Ventanas ventana = new Ventanas(this);
    DefaultListModel list = new DefaultListModel();
    ArrayList<String> arrays;
    static Persona usuario;
    JFpag2 pag2 ;
    static Datos datosPag3 ;
    JFpag4 pag4;
    /**
     * Creates new form JFpag3
     * @param usuario
     * @param data
     */
    public JFpag3(Persona user,Datos data) {
        initComponents();
        list = new DefaultListModel();
        JLDatos.setModel(list);
        arrays = new ArrayList<>();
        usuario = user;
        LblNombre.setText("Hola "+user._Nombre);
        if(data ==null){
            datosPag3 =new Datos();
        }else{
            datosPag3 =data;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblPag1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JCboxPag3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnQuitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLDatos = new javax.swing.JList<>();
        BtnSiguiente = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        LblMesaje = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(630, 600));
        setSize(new java.awt.Dimension(630, 600));

        LblPag1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LblPag1.setText("Página 3");

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PREGUNTA 4, VALOR DEL 25%");

        JCboxPag3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JCboxPag3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Int", "Float", "double", "String", "Numeric", "Money" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Seleccione de la lista de opciones, aquellos que corresponden a tipos de datos en Java ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("y agréguelos mediante el botón agregar, de forma que queden en el área de texto inferior:");

        BtnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnAgregar.setText("-->");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnQuitar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnQuitar.setText("<--");
        BtnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(JLDatos);

        BtnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnSiguiente.setForeground(new java.awt.Color(0, 153, 153));
        BtnSiguiente.setText("-->");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnAtras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnAtras.setForeground(new java.awt.Color(255, 0, 0));
        BtnAtras.setText("<--");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        LblMesaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblMesaje.setForeground(new java.awt.Color(255, 0, 0));
        LblMesaje.setToolTipText("");

        LblNombre.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(LblMesaje, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblPag1)
                                .addGap(119, 119, 119)
                                .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCboxPag3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnQuitar)
                                    .addComponent(BtnAgregar))
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPag1))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCboxPag3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnQuitar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(LblMesaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
       int itemIndex = JCboxPag3.getSelectedIndex();
       String item = JCboxPag3.getSelectedItem().toString();
       int itemCount = JCboxPag3.getItemCount();
       
       if(itemIndex == 0)
       {
           if(itemCount==1){
               JOptionPane.showMessageDialog(null, "No hay mas items para seleccionar ");
           }else{
            JOptionPane.showMessageDialog(null, "Elige un item válido.");   
           }
       }
       else
       {
           JCboxPag3.removeItemAt(itemIndex);
           list.addElement(item);
           //adicionar elementos al arreglo
           addElementList(item);
           //CboxListRespuesta.addItem(item);
       }
       
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitarActionPerformed
       int eli = JLDatos.getSelectedIndex();
        String item =  JLDatos.getSelectedValue();
        
        if(item==null)
        {
             LblMesaje.setText( "Elije un valor de la lista para quitar ") ; 
        }
        else
        {
            JCboxPag3.addItem(item); 
            list.remove(eli);
            LblMesaje.setText("Se removió el elemento " + item);
            //deleteElementoList(item);
        } 
    }//GEN-LAST:event_BtnQuitarActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
       int itemCount = list.getSize();
       if(itemCount==0){
            LblMesaje.setText("Ingresa al menos una respuesta ");
        }else
       {
           LblMesaje.setText("");
           datosPag3.arraysP4 =arrays;
           
           for(int i=0; i <arrays.size();i++)
            {
                if("Int".equals(arrays.get(i))){
                    datosPag3.p4SelectInt =true;
                }
                if("Float".equals(arrays.get(i))){
                    datosPag3.p4SelectFloat=true;
                }
                if("double".equals(arrays.get(i))){
                    datosPag3.p4SelectDouble =true;
                }
                if("String".equals(arrays.get(i))){
                     datosPag3.p4SelectString =true;
                }
                if("Numeric".equals(arrays.get(i))){
                     datosPag3.p4SelectNumeric =true;
                }
                 if("Money".equals(arrays.get(i))){
                     datosPag3.p4SelectMoney =true;
                }
            }
            pag4 = new JFpag4(usuario,datosPag3);
            ventana.ocutarVentana();
            ventana.abrirVentana(pag4);
       }
        
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        pag2= new JFpag2(usuario,datosPag3);
        ventana.ocutarVentana();
        ventana.abrirVentana(pag2);
    }//GEN-LAST:event_BtnAtrasActionPerformed
    
    public void addElementList(String element){
        //JOptionPane.showMessageDialog(null, "Llego el elemento "+element) ;
        arrays.add(element);

    }
    
    public void deleteElementoList(String element){
        int elementId=-1 ;
        for(int i=0; i <arrays.size();i++)
        {
            if(arrays.get(i)==element)
            {
                elementId = i;
            } 
        } 
        if(elementId>-1){
            list.remove(elementId);
            //JOptionPane.showMessageDialog(null, ) ; 
            
        } 
    }
    
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
            java.util.logging.Logger.getLogger(JFpag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFpag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFpag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFpag3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFpag3(usuario,datosPag3).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnQuitar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JComboBox<String> JCboxPag3;
    private javax.swing.JList<String> JLDatos;
    private javax.swing.JLabel LblMesaje;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblPag1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
