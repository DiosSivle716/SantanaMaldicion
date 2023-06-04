/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appalmacen;

/**
 *
 * @author ElWeroCastigador
 */
public class Chofer extends Persona{
    
    private int MatrUnidad;
    private static final int MatrBase = 101010;
    private static int MatrGen = 0;
    
    Chofer(){
        super();
        this.MatrUnidad = 0;
        MatrGen++;
    }
    
    Chofer(String nombre, String correo){
        super(nombre, correo);
        setMatrUnidad();
        MatrGen++;
    }

    public int getMatrUnidad() {
        return MatrUnidad;
    }

    public void setMatrUnidad() {
        int Matricula = MatrBase+MatrGen;
        this.MatrUnidad = (Matricula>101010 && Matricula<999999)?Matricula:0;
    }

    public static int getMatrGen() {
        return MatrGen;
    }
    
    @Override
    public String toString(){
        return super.toString()+" \t Matricula de la unidad: Mtr-"+MatrUnidad;
    }
    
}
