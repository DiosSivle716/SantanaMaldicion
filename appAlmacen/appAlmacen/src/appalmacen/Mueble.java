/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Mueble extends Articulo{
    
    private String TipoMadera, TipoMueble;
    private int noMueble=1000;
    private static int totmueble = 0;
    
    Mueble(){
        super();
        this.TipoMadera = "N/A";
        this.TipoMueble = "N/A";
        this.noMueble = 0;
        totmueble++;
    }
    
    Mueble(String tipo, String remitente, String destinatario, double precioArticulo, String tipoMadera, String tipoMueble){
        super("Mueble", remitente, destinatario, precioArticulo);
        setTipoMadera(tipoMadera);
        setTipoMueble(tipoMueble);
        setNoMueble();
        totmueble++;
    }

    public String getTipoMadera() {
        return TipoMadera;
    }

    public void setTipoMadera(String TipoMadera) {
        this.TipoMadera = TipoMadera;
    }

    public String getTipoMueble() {
        return TipoMueble;
    }

    public void setTipoMueble(String TipoMueble) {
        this.TipoMueble = TipoMueble;
    }

    public int getNoMueble() {
        return noMueble;
    }

    public void setNoMueble() {
        this.noMueble = totmueble+1;
    }

    public static int getTotmueble() {
        return totmueble;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t Tipo madera: "+TipoMadera+"\tTipo mueble: "+TipoMueble+"\tNumero de mueble registrado: "+noMueble;
    }
    
    @Override
    public double ImpuestoEnvio(){
        if(TipoMadera.equalsIgnoreCase("PINO"))
            return PrecioArticulo*0.10;
        else
            if (TipoMadera.equalsIgnoreCase("ABETO"))
                return PrecioArticulo*0.12;
        else
                if(TipoMadera.equalsIgnoreCase("ARCE"))
                    return PrecioArticulo*0.14;
        else
                    if(TipoMadera.equalsIgnoreCase("ROBLE"))
                        return PrecioArticulo*15;
        else
                        if(TipoMadera.equalsIgnoreCase("MARFIL"))
                            return PrecioArticulo*0.30;
        else
                            if(TipoMadera.equalsIgnoreCase("PALISANDRO"))
                                return PrecioArticulo*0.35;
        else
                                if(TipoMadera.equalsIgnoreCase("CAOBA"))
                                    return PrecioArticulo*0.40;
        else
                                    return PrecioArticulo*0;
    }
    
    /*
    1.- Pino
    2.- Abeto
    3.- Arce
    4.- Roble
    5.- Marfil
    6.- Palisandro
    7.- Caoba
    */
    
    @Override
    public double ImportAdiEnvio(int peticion){
        double ImporteFinal;
        switch(peticion){
            case 1: {
                ImporteFinal = PrecioArticulo*0.10;
                break;
            }
            case 2: {
                ImporteFinal = PrecioArticulo*0.20;
                break;
            }
            case 3: {
                ImporteFinal = PrecioArticulo*0.30;
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
        return PrecioArticulo + ImpuestoEnvio() + ImportAdiEnvio(peticion);
    }
    
}
