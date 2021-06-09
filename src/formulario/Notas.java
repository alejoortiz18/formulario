/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;


public class Notas{
        
    public double ganoPreguntaUno;
    
    public boolean ifGano(boolean p1){
        boolean ganoPregunta = false;
        if(p1){
           ganoPregunta =true;
       }
        return ganoPregunta;
    }
    
    public boolean ifGano(boolean p1,boolean p2)
    {
       boolean ganoPregunta = false;
        if(p1 && p2){
           ganoPregunta =true;
       }
        return ganoPregunta;
    }
    
    public boolean ifGano(boolean p1,boolean p2, boolean p3, boolean p4)
    {
       boolean ganoPregunta = false;
        if(p1 && p2 && p3 && p4){
           ganoPregunta =true;
       }
        return ganoPregunta;
    }
   
    
}
