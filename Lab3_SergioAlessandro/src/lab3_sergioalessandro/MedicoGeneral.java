/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sergioalessandro;

/**
 *
 * @author Sergio
 */
public class MedicoGeneral extends Medico{
    private int enfermedades;

    public MedicoGeneral() {

    }

    public MedicoGeneral(int enfermedades, String colegio, String nombre, String apellido, int años, int salario) {
        super(colegio, nombre, apellido, años, salario);
        this.enfermedades = enfermedades;
    }

    public int getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(int enfermedades) {
        this.enfermedades = enfermedades;
    }

    @Override
    public String toString() {
        return "MedicoGeneral{" + "enfermedades=" + enfermedades + '}';
    }
    
}
