/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Direccion {
    
    private String Colonia, Calle;
    
    Direccion(){
        this.Calle = "N/A";
        this.Colonia = "N/A";
    }
    
    Direccion(String calle, String colonia){
        setCalle(calle);
        setColonia(colonia);
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
    
    @Override
    public String toString(){
        return "Calle: "+Calle+"\tColonia: "+Colonia;
    }
    
}
