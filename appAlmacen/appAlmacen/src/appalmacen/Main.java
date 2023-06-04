/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ElWeroCastigador
 */
public class Main {
    
    Scanner leer = new Scanner(System.in);
    Cliente cli[]=new Cliente[99];
    Chofer[] chofis = new Chofer[99];
    Articulo mu[] = new Mueble[99];
    Articulo com[] = new Computadora[99];
    Articulo elec[] = new Electrodomestico[99];
    Envio env[] = new Envio[99];
    /*---------------------------------------------------------------------------------------------*/
    Articulo art;
    Direccion direccion;
    Chofer chofer;
    
    public void AgregarNuevoCliente(){
        int i = Cliente.getID();
        System.out.println("DATOS PERSONALES");
        System.out.println("Ingrese el nombre de la cuenta");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el correo que quiere asociar a la cuenta");
        String correo = leer.nextLine();
        System.out.println("DATOS DE LA DIRECCION");
        System.out.println("Ingrese la calle en la que se ubica");
        String calle = leer.nextLine();
        System.out.println("Ingrese la colonia donde se ubica");
        String col = leer.nextLine();
        Direccion dire = new Direccion(calle, col);
        try{
            cli[i] = new Cliente(nombre, correo, dire);
            System.out.println("NUEVO USUARIO GENERADO CORRECTAMENTE");
            System.out.println(cli[i]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("**ERROR** Parece que algo ha ocurrido mal, intentelo de nuevo");
        }
    }
    
    public void Ver(){
        for(int i=0;i<Articulo.getTotArticulos();i++){
                System.out.println(mu[i]);
        }
    }
    
    public void AgregarNuevoChofer(){
        int i = Chofer.getMatrGen();
        System.out.println("DATOS PERSONALES");
        System.out.println("Ingrese el nombre de la cuenta");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el correo que quiere asociar a la cuenta");
        String correo = leer.nextLine();
        try{
            chofis[i] = new Chofer(nombre, correo);
            System.out.println("NUEVO CHOFER GENERADO CORRECTAMENTE");
            System.out.println(chofis[i]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("**ERROR** Parece que algo ha ocurrido mal, intentelo de nuevo");
        }
    }
    
    public void AgregarNuevoArticulo(){
        System.out.println("LISTA DE TIPOS DE ARTICULOS");
        System.out.println("De que tipo sera el nuevo articulo? (por favor ingrese el numero que corresponda)");
        System.out.println("1.- Mueble");
        System.out.println("2.- Computadora");
        System.out.println("3.- Electrodomestico");
        int tipo = leer.nextInt();
        switch(tipo){
            case 1: {
                System.out.println("DATOS GENERALES");
                System.out.println("Ingrese el nombre del remitente");
                String rem = leer.nextLine();
                rem = leer.nextLine();
                System.out.println("Ingrese el nombre del destinatario");
                String dest = leer.nextLine();
                System.out.println("Ingrese el precio del articulo");
                double pre = leer.nextDouble();
                System.out.println("DATOS EXCLUSIVOS MUEBLE");
                System.out.println("Ingrese el tipo de madera del articulo");
                System.out.println("1.- Pino \n 2.- Abeto \n 3.- Arce \n 4.- Roble \n 5.- Marfil \n 6.- Palisandro \n 7.- Caoba");
                String tipomadera = leer.nextLine();
                tipomadera = leer.nextLine();
                System.out.println("Ingrese el tipo de mueble");
                String tipomueble = leer.nextLine();
                int i = Mueble.getTotArticulos();
                try{
                    mu[i] = new Mueble("Mueble", rem, dest, pre, tipomadera, tipomueble);
                    System.out.println("MUEBLE GENERADO CON EXITO");
                    System.out.println(mu[i]);
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("**ERROR** Parece que algo ha ocurrido mal, intentelo de nuevo");
                }
                break;
            }
            case 2: {
                System.out.println("DATOS GENERALES");
                System.out.println("Ingrese el nombre del remitente");
                String rem = leer.nextLine();
                System.out.println("Ingrese el nombre del destinatario");
                String dest = leer.nextLine();
                System.out.println("Ingrese el precio del articulo");
                double pre = leer.nextDouble();
                System.out.println("DATOS EXCLUSIVOS COMPUTADORAS");
                System.out.println("Ingrese el procesador del equipo");
                System.out.println("1.- intel core i3 \n 2.- intel core i5 \n 3.- intel core i7 \n 4.- intel core i9");
                String procesador = leer.nextLine();
                System.out.println("Ingrese la cantidad de almacenamiento del equipo");
                int almacenamiento = leer.nextInt();
                int i = Computadora.getTotComp();
                try{
                    com[i] = new Computadora("Computadora", rem, dest, pre, procesador, almacenamiento);
                    System.out.println("COMPUTADORA GUARDADA CON EXITO");
                    System.out.println(com[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("**ERROR** Parece que algo ha ocurrido mal, intentelo de nuevo");
                }
                break;
            }
            case 3:{
                System.out.println("DATOS GENERALES");
                System.out.println("Ingrese el nombre del remitente");
                String rem = leer.nextLine();
                System.out.println("Ingrese el nombre del destinatario");
                String dest = leer.nextLine();
                System.out.println("Ingrese el precio del articulo");
                double pre = leer.nextDouble();
                System.out.println("DATOS EXCLUSIVOS ELECTRODOMESTICO");
                System.out.println("Ingrese el tipo de electrodomestico");
                System.out.println("1.- Microondas \n 2.- Batidora \n 3.- Mini horno \n 4.- Lavadora \n 5.- Refrigerador");
                String tipoe = leer.nextLine();
                int i = Electrodomestico.getTotElec();
                try{
                    elec[i] = new Electrodomestico("Electrodomestico", rem, dest, pre, tipoe);
                    System.out.println("ELECTRODOMESTICO GUARDADO CON EXITO");
                    System.out.println(elec[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("**ERROR** Parece que algo ha ocurrido mal, intentelo de nuevo");
                }
                break;
            }
        }
    }
    
    public void EliminarArticulo(){
        System.out.println("Que tipo de articulo se va a eliminar? (ingrese el numero correspondiente)");
        System.out.println("1.- Mueble");
        System.out.println("2.- Computadora");
        System.out.println("3.- Electrodomestico");
        int tipo = leer.nextInt();
        switch(tipo){
            case 1: {
                System.out.println("Ingrese el numero de articulo del mueble");
                int numArt = leer.nextInt();
                boolean confirmacion = false;
                for(int i = 0; i<=mu.length;i++){
                    if(numArt==mu[i].getNoArticulo()){
                        mu[i] = null;
                        confirmacion = true;
                    }
                }
                if(confirmacion)
                    System.out.println("OPERACION REALIZADA CON EXITO");
                else
                    System.out.println("ALGO HA FALLADO");
                break;
            }
            case 2: {
                System.out.println("Ingrese el numero de articulo de la computadora");
                int numArt = leer.nextInt();
                boolean confirmacion = false;
                for (int i = 0; i <= com.length; i++) {
                    if (numArt == com[i].getNoArticulo()) {
                        com[i] = null;
                        confirmacion = true;
                    }
                }
                if (confirmacion) {
                    System.out.println("OPERACION REALIZADA CON EXITO");
                } else {
                    System.out.println("ALGO HA FALLADO");
                }
                break;
            }
            case 3: {
                System.out.println("Ingrese el numero de articulo del electrodomestico");
                int numArt = leer.nextInt();
                boolean confirmacion = false;
                for (int i = 0; i <= elec.length; i++) {
                    if (numArt == elec[i].getNoArticulo()) {
                        elec[i] = null;
                        confirmacion = true;
                    }
                }
                if (confirmacion) {
                    System.out.println("OPERACION REALIZADA CON EXITO");
                } else {
                    System.out.println("ALGO HA FALLADO");
                }
                break;
            }
        }
    }
    
    public void EnviarArticuloAUnUsuario() throws InstanciaNoEncontrada{
        System.out.println("RELLENO DE REQUISITOS DEL ENVIO");
        System.out.println("ingrese el numero de articulo del articulo que sera transportado");
        int numEnvio = leer.nextInt();
        int i = 0;
        //try{
            for(i=0;i<Articulo.getTotArticulos();i++){
                //System.out.println(mu[i].getNoArticulo());
                if (mu[i].getNoArticulo()==numEnvio) {
                    String remitente = mu[i].getRemitente();
                    String destinatario = mu[i].getDestinatario();
                    double costo = mu[i].getPrecioArticulo();
                    String tipomadera = ((Mueble)mu[i]).getTipoMadera();
                    String tipomueble = ((Mueble)mu[i]).getTipoMueble();
                    art = new Mueble("Mueble", remitente, destinatario, costo, tipomadera, tipomueble);
                } /*else if (numEnvio == com[i].getNoArticulo()) {
                    art = com[i];
                } else if (numEnvio == elec[i].getNoArticulo()) {
                    art = elec[i];
                } else {
                    art = null;
                }*/
            }
       /* }catch(Exception e){
            throw new InstanciaNoEncontrada();
        }*/
        System.out.println("El envio tiene alguna peticion de las siguientes? si es asi indique el numero de la que corresponda");
        System.out.println("1.- Envio cuidadoso\n2.- Envio rapido\n3.- Envio internacional\n4.- ninguno");
        int peticion = leer.nextInt();
        double monto = art.CostoNetoTransporte(peticion);
        System.out.println("Ingrese el id de la cuenta a la que se realizara el envio");
        int idcuenta = leer.nextInt();
        for(i=0;i<=Cliente.getID();i++){
            if(idcuenta==cli[i].getIDCuenta())
                direccion = cli[i].getDireccion();
        }
        System.out.println("ingrese el numero de la matricula de la unidad que desea asignar al envio");
        int numMatr = leer.nextInt();
        for(i=0; i<=Chofer.getMatrGen();i++){
            if(numMatr==chofis[i].getMatrUnidad())
                chofer = chofis[i];
        }
        int j = Envio.getTotEnvios();
        try{
            env[j] = new Envio(monto, art, chofer, direccion);
            System.out.println("ENVIO GENERADO CON EXITO");
            System.out.println(env[j]);
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("**ERROR** parece que algo salio mal");
        }
        String Registros = env[j].toString();
        File directorio = new File("appAlmacen\\Registro Envios.txt");
        try{
            PrintWriter pluma = new PrintWriter(new FileWriter(directorio));
            pluma.println(Registros);
            pluma.close();
        }catch(IOException e){
            System.out.println("parece que algo ha ocurrido mal");
        }
    }
    
    public void VerEnvio(){
        System.out.println("SOLICITUD DE ENVIO");
        System.out.println("Ingrese el numero de su envio");
        int numeroenvio = leer.nextInt();
        for(int i=0;i<=Envio.getTotEnvios();i++){
            if(numeroenvio==env[i].getNoEnvio())
                System.out.println(env[i]);
        }
        System.out.println("OPERACION FINALIZDA");
    }
}
