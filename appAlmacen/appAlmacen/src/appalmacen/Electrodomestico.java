/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Electrodomestico extends Articulo{
    
    private String TipoE;
    private int noElectrodomestico;
    private static int totElec = 0;
    
    Electrodomestico(){
        super();
        this.TipoE = "N/A";
        this.noElectrodomestico = 0;
        totElec++;
    }
    
    Electrodomestico(String tipo, String remitente, String destinatario, double precioArticulo, String tipoe){
        super("Electrodomestico", remitente, destinatario, precioArticulo);
        setTipoE(tipoe);
        setNoElectrodomestico();
        totElec++;
    }

    public String getTipoE() {
        return TipoE;
    }

    public void setTipoE(String TipoE) {
        this.TipoE = TipoE;
    }

    public int getNoElectrodomestico() {
        return noElectrodomestico;
    }

    public void setNoElectrodomestico() {
        this.noElectrodomestico = totElec+1;
    }

    public static int getTotElec() {
        return totElec;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\tTipo de electrodomestico:"+TipoE+"\tNumero de electrodomsetico registrado: "+noElectrodomestico;
    }
    
    @Override
    public double ImpuestoEnvio(){
        if(TipoE.equalsIgnoreCase("Microondas"))
            return PrecioArticulo*0.05;
        else
            if(TipoE.equalsIgnoreCase("Batidora"))
                return PrecioArticulo*0.10;
        else
                if(TipoE.equalsIgnoreCase("Mini horno"))
                    return PrecioArticulo*0.15;
        else
                    if(TipoE.equalsIgnoreCase("Lavadora"))
                        return PrecioArticulo*0.25;
        else
                        if(TipoE.equalsIgnoreCase("Refrigerador"))
                            return PrecioArticulo*0.30;
        else
                            return PrecioArticulo*0;
    }
    
    @Override
    public double ImportAdiEnvio(int peticion){
        double ImporteFinal;
        switch(peticion){
            case 1: {
                ImporteFinal = PrecioArticulo*0.05;
                break;
            }
            case 2: {
                ImporteFinal = PrecioArticulo*0.10;
                break;
            }
            case 3: {
                ImporteFinal = PrecioArticulo*0.20;
                break;
            }
            default:
                ImporteFinal = PrecioArticulo*0;
        }
        return ImporteFinal;
    }
    /*
    1.- Envio Rapido
    2.- Envio cuidadoso
    3.- Envio internacional
    */
    
    @Override
    public double CostoNetoTransporte(int peticion){
        return PrecioArticulo+ImpuestoEnvio()+ImportAdiEnvio(peticion);
    }
    
}
