/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Almacen {
    
    private String Direccion, Contacto;
    
    Almacen(){
        this.Direccion = "Boulevard Oscar Flores No.7857";
        this.Contacto = "Contacto@gmail.com";
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getContacto() {
        return Contacto;
    }
    
    @Override
    public String toString(){
        return "\tDireccion: "+Direccion+"\t Contacto: "+Contacto;
    }
}
