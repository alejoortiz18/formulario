
package formulario;

import java.util.ArrayList;

/**
 *
 * @author reisa
 */
public class Datos {
    //=====PREGUNTA UNO======
    //for(int i=5;i>=1;i--){ System.out.println(i);} (ChkPreg1)
    public boolean Pregunta1_1;
    //for(int i=5;i>0;i--){ System.out.println(i);}  (ChkPreg2)  
    public boolean Pregunta1_2;
    //======PREGUNTA 2 =========
    //Ninguna de las anteriores (Rbt4)
    public boolean Pregunta2;
    //======PREGUNTA 3==========
    //Error al dividir por cero (ChkOpt3)
    public boolean Pregunta3;
    //======PREGUNTA 4===========
    //int,float,double,String
    public boolean p4SelectInt=false;
    public boolean p4SelectFloat=false;
    public boolean p4SelectDouble=false;
    public boolean p4SelectString=false;
    ArrayList<String> arraysP4;

    //======PREGUNTA 5==============
    //LblOption1 = Cbox1-LblRespuesta1
    //LblOption2 = Cbox2-LblRespuesta2
    //LblOption3 = Cbox3-LblRespuesta3
    //LblOption4 = Cbox4-LblRespuesta4
    //LblOption5 = Cbox5-LblRespuesta5

    public boolean javais;
    public boolean polimorfismoHerencia;
    public boolean objeto;
    public boolean pausaEjecucion;
    public boolean rvoid;
    ArrayList<String> arraysP5;

    
    public ArrayList<String> getArraysP5() {
        return arraysP5;
    }

    public void setArraysP5(ArrayList<String> arraysP5) {
        this.arraysP5 = arraysP5;
    }
    
    
    public boolean isJavais() {
        return javais;
    }

    public void setJavais(boolean javais) {
        this.javais = javais;
    }

    public boolean isPolimorfismoHerencia() {
        return polimorfismoHerencia;
    }

    public void setPolimorfismoHerencia(boolean polimorfismoHerencia) {
        this.polimorfismoHerencia = polimorfismoHerencia;
    }

    public boolean isObjeto() {
        return objeto;
    }

    public void setObjeto(boolean objeto) {
        this.objeto = objeto;
    }

    public boolean isPausaEjecucion() {
        return pausaEjecucion;
    }

    public void setPausaEjecucion(boolean pausaEjecucion) {
        this.pausaEjecucion = pausaEjecucion;
    }

    public boolean isRvoid() {
        return rvoid;
    }

    public void setRvoid(boolean rvoid) {
        this.rvoid = rvoid;
    }
    
    
    public ArrayList<String> getArrays() {
        return arraysP4;
    }

    public void setArraysP4(ArrayList<String> arrays) {
        this.arraysP4 = arrays;
    }
    
    
    
    public boolean isP4SelectInt() {
        return p4SelectInt;
    }

    public void setP4SelectInt(boolean p4SelectInt) {
        this.p4SelectInt = p4SelectInt;
    }

    public boolean isP4SelectFloat() {
        return p4SelectFloat;
    }

    public void setP4SelectFloat(boolean p4SelectFloat) {
        this.p4SelectFloat = p4SelectFloat;
    }

    public boolean isP4SelectDouble() {
        return p4SelectDouble;
    }

    public void setP4SelectDouble(boolean p4SelectDouble) {
        this.p4SelectDouble = p4SelectDouble;
    }

    public boolean isP4SelectString() {
        return p4SelectString;
    }

    public void setP4SelectString(boolean p4SelectString) {
        this.p4SelectString = p4SelectString;
    }

    
    
    public boolean isPregunta3() {
        return Pregunta3;
    }

    public void setPregunta3(boolean Pregunta3) {
        this.Pregunta3 = Pregunta3;
    }


    public boolean getPregunta1_1() {
        return Pregunta1_1;
    }

    public void setPregunta1_1(boolean Pregunta1_1) {
        this.Pregunta1_1 = Pregunta1_1;
    }

    public boolean getPregunta1_2() {
        return Pregunta1_2;
    }

    public void setPregunta1_2(boolean Pregunta1_2) {
        this.Pregunta1_2 = Pregunta1_2;
    }

    public boolean getPregunta2() {
        return Pregunta2;
    }

    public void setPregunta2(boolean Pregunta2) {
        this.Pregunta2 = Pregunta2;
    }
    
    

    
}
