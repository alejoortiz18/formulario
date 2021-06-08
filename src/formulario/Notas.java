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
    
    
    public boolean notaPregunta1(){
       //  ESTA PREGUNTA VALE UN 20%
        boolean p1,p2,p3,p4, gano =false;
        //  1_1 // 1_2 buenas
        p1 = getPregunta1_1();
        p2 = getPregunta1_2();
        p3 = getPregunta1_3();
        p4 = getPregunta1_4();
        
        if(p1 && p2){
            gano=true;
            JOptionPane.showMessageDialog(null,"gano "+ gano); 
        }else{
            JOptionPane.showMessageDialog(null,"gano "+ gano); 
        }
        return gano;
    }

    
    
}
