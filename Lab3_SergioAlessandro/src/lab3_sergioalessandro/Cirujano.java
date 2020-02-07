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
public class Cirujano extends Medico{
    private int cirugias;

    public Cirujano() {
        
    }

    public Cirujano(int cirugias, String colegio, String nombre, String apellido, int años, int salario) {
        super(colegio, nombre, apellido, años, salario);
        this.cirugias = cirugias;
    }

    public int getCirugias() {
        return cirugias;
    }

    public void setCirugias(int cirugias) {
        this.cirugias = cirugias;
    }

    @Override
    public String toString() {
        return "Cirujano{" + "cirugias=" + cirugias + '}';
    }
    
}
