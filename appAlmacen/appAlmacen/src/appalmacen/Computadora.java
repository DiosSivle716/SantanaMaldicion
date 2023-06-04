/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Computadora extends Articulo{
    
    private String Procesador;
    private int Almacenamiento;
    private int noComp;
    private static int totComp = 0;
    
    Computadora(){
        super();
        this.Procesador = "N/A";
        this.Almacenamiento = 0;
        this.noComp = 0;
        totComp++;
    }
    
    Computadora(String tipo, String remitente, String destinatario, double precioArticulo, String procesador, int almacenamiento){
        super("Computadora", remitente, destinatario, precioArticulo);
        setProcesador(procesador);
        setAlmacenamiento(almacenamiento);
        setNoComp();
        totComp++;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento>0?Almacenamiento:0;
    }

    public int getNoComp() {
        return noComp;
    }

    public void setNoComp() {
        this.noComp = totComp+1;
    }

    public static int getTotComp() {
        return totComp;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\tProcesador: "+Procesador+"\tAlmacenamiento: "+Almacenamiento+"\tNumero de computadora registrado: "+noComp;
    }
    
    @Override
    public double ImpuestoEnvio(){
        if (Procesador.equalsIgnoreCase("INTEL CORE I3"))
            return PrecioArticulo*0.10;
        else
            if (Procesador.equalsIgnoreCase("INTEL CORE I5"))
                return PrecioArticulo*0.15;
        else
                if (Procesador.equalsIgnoreCase("INTEL CORE I7"))
                    return PrecioArticulo*0.20;
        else
                    if (Procesador.equalsIgnoreCase("INTEL CORE I9"))
                        return PrecioArticulo*0.30;
        else
                        return PrecioArticulo*0;
    }
    
    @Override
    public double ImportAdiEnvio(int peticion){
        double ImporteFinal;
        switch(peticion){
            case 1: {
                ImporteFinal = PrecioArticulo*0.15;
                break;
            }
            case 2: {
                ImporteFinal = PrecioArticulo*0.25;
                break;
            }
            case 3: {
                ImporteFinal = PrecioArticulo*0.40;
                break;
            }
            default:
                ImporteFinal = PrecioArticulo*0;
        }
        return ImporteFinal;
    }
    /*
    1.- Envio cuidadoso
    2.- Envio rapido
    3.- Envio internacional
    */
    
    @Override
    public double CostoNetoTransporte(int peticion){
        return PrecioArticulo+ImpuestoEnvio()+ImportAdiEnvio(peticion);
    }
    
}
