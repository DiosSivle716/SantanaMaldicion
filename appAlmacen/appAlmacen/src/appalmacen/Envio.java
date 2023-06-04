/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Envio {
    
    private double Monto;
    private Articulo Art;
    private Chofer Chof;
    private Direccion Dir;
    private int noEnvio;
    private static int totEnvios = 0;
    
    Envio(){
        this.Monto = 0;
        Art = null;
        Chof = new Chofer();
        Dir = new Direccion();
        this.noEnvio = 0;
        totEnvios++;
    }
    
    Envio(double monto, Articulo art, Chofer chof, Direccion dir){
        setMonto(monto);
        setArt(art);
        setChof(chof);
        setDir(dir);
        setNoEnvio();
        totEnvios++;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto>0?Monto:0;
    }

    public Articulo getArt() {
        return Art;
    }

    public void setArt(Articulo Art) {
        this.Art = Art;
    }

    public Chofer getChof() {
        return Chof;
    }

    public void setChof(Chofer Chof) {
        this.Chof = Chof;
    }

    public Direccion getDir() {
        return Dir;
    }

    public void setDir(Direccion Dir) {
        this.Dir = Dir;
    }

    public int getNoEnvio() {
        return noEnvio;
    }

    public void setNoEnvio() {
        this.noEnvio = totEnvios+1;
    }

    public static int getTotEnvios() {
        return totEnvios;
    }
    
    @Override
    public String toString(){
        return "Articulo: "+Art+"\tMonto: "+Monto+"\tChofer: "+Chof+"\t Direccion: "+Dir;
    }
    
}
