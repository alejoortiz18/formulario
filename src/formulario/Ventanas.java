/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author reisa
 */
public class Ventanas {
   // private JFInicio _inicio;
   // private JFPag1 _page1;
    private javax.swing.JFrame _this; 

   
    public Ventanas(javax.swing.JFrame jfm){
        _this =jfm;
    }
    
    public void ocutarVentana(){
        _this.setVisible(false);
    }
    public void ocutarVentana(javax.swing.JFrame ventana){
        ventana.setVisible(false);
    }
    public void abrirVentana(javax.swing.JFrame ventana){
        ventana.setVisible(true);
    }
}
