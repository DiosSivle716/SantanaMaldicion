/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appalmacen;

import java.util.Scanner;

/**
 *
 * @author ElWeroCastigador
 */
public class AppAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstanciaNoEncontrada {
        Main main = new Main();
        Scanner leer = new Scanner(System.in);
        int asd = 1;
        do{
            menu();
            int menu = leer.nextInt();
            switch (menu) {
                case 1: {
                    main.AgregarNuevoCliente();
                    break;
                }
                case 2: {
                    main.AgregarNuevoChofer();;
                    break;
                }
                case 3: {
                    main.AgregarNuevoArticulo();
                    break;
                }
                case 4: {
                    main.EliminarArticulo();
                    break;
                }
                case 5: {
                    main.EnviarArticuloAUnUsuario();
                    break;
                }
                case 6: {
                    main.Ver();
                    break;
                }
            }
        }while(asd==1);
        
        
    }
    
    public static void menu(){
        System.out.println("1.- Agregar nuevo cliente");
        System.out.println("2.- Agregar nuevo chofer");
        System.out.println("3.- Agregar nuevo articulo");
        System.out.println("4.- Eliminar articulo");
        System.out.println("5.- Enviar articulo a un usuario");
        System.out.println("6.- Ver");
        System.out.println("7.- Devoluciones");
    }
    
}
