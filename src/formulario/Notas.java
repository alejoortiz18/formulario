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
   
    public boolean ifGano(String p1,String p2,String p3,String p4,String p5)
    {
        boolean ganoPregunta = false;
        if("1".equals(p1) && "2".equals(p2) && "3".equals(p3) && "4".equals(p4) && "5".equals(p5)){
           ganoPregunta =true;
       }
        return ganoPregunta;
    }
}
