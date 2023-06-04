/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Persona {
    
    protected String Nombre, Correo;
    
    Persona(){
        this.Nombre = "N/A";
        this.Correo = "N/A";
    }
    
    Persona(String nombre, String correo){
        setNombre(nombre);
        setCorreo(correo);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+Nombre+"\tCorreo: "+Correo;
    }
    
}
