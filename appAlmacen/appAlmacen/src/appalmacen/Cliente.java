/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Cliente extends Persona{
    
    private int IDCuenta;
    private static int ID = 0;
    private static final int IDBase = 10000;
    private Direccion Direccion;
    
    Cliente(){
        super();
        this.IDCuenta = 0;
        Direccion = new Direccion();
        ID++;
    }
    
    Cliente(String nombre, String correo, Direccion direccion){
        super(nombre, correo);
        setIDCuenta();
        setDireccion(direccion);
    }

    public int getIDCuenta() {
        return IDCuenta;
    }

    public void setIDCuenta() {
        this.IDCuenta = IDBase + ID;
    }

    public static int getID() {
        return ID;
    }

    public Direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(Direccion Direccion) {
        this.Direccion = Direccion;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\tID Cuenta: "+IDCuenta+"\tDireccion: "+Direccion;
    }
    
}
