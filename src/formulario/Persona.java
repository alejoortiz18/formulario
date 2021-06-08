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
public class Persona {
    public String _Nombre;
    public String _Identificaion;

    public Persona(String _Nombre, String _Identificaion) {
        this._Nombre = _Nombre;
        this._Identificaion = _Identificaion;
    }

    public String getNombre() {
        return _Nombre;
    }

    public void setNombre(String _Nombre) {
        this._Nombre = _Nombre;
    }

    public String getIdentificaion() {
        return _Identificaion;
    }

    public void setIdentificaion(String _Identificaion) {
        this._Identificaion = _Identificaion;
    }
    
}
