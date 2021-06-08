/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author rortiz
 */
public class Notas extends Datos{
    
    
    public boolean notaPregunta1(boolean p1,boolean p2,boolean p3,boolean p4){
       //  ESTA PREGUNTA VALE UN 20%
        boolean _p1,_p2,_p3,_p4, gano =false;
        //  1_1 // 1_2 buenas
        setPregunta1_1(p1);        
        setPregunta1_2(p2);
        setPregunta1_3(p3);
        setPregunta1_4(p4);
             
        
        if(p1 && p2){
            gano=true;
            JOptionPane.showMessageDialog(null,"gano "+ gano); 
        }else{
            JOptionPane.showMessageDialog(null,"gano "+ gano); 
        }
        return gano;
    }

    
    
}
