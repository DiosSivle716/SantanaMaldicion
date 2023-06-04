/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public abstract class Articulo implements MovimientoArticulo{
    
    protected String Tipo, Remitente, Destinatario;
    protected double PrecioArticulo;
    protected int noArticulo;
    protected static int totArticulos = 0;
    
    Articulo(){
        this.Tipo = "Tipo articulo";
        this.Remitente = "Remitente";
        this.Destinatario = "Destinatario";
        this.PrecioArticulo = 0;
        this.noArticulo = 0;
        totArticulos++;
    }
    
    Articulo(String tipo, String remitente, String destinatario, double precioArticulo){
        setTipo(tipo);
        setRemitente(remitente);
        setDestinatario(destinatario);
        setPrecioArticulo(precioArticulo);
        setNoArticulo();
        totArticulos++;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public double getPrecioArticulo() {
        return PrecioArticulo;
    }

    public void setPrecioArticulo(double PrecioArticulo) {
        this.PrecioArticulo = PrecioArticulo;
    }

    public int getNoArticulo() {
        return noArticulo;
    }

    public void setNoArticulo() {
        this.noArticulo = totArticulos+1;
    }

    public static int getTotArticulos() {
        return totArticulos;
    }
    
    @Override
    public String toString(){
        return "Tipo de articulo: "+Tipo+"\tRemitente: "+Remitente+"\tDestinatario: "+Destinatario+"\tPrecio articulo: "+PrecioArticulo+"\tArticulo no: "+noArticulo+"\t en total hay: "+totArticulos+" articulos";
    }
    
    public abstract double ImpuestoEnvio();
    
}
