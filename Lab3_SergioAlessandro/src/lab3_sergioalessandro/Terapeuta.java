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
public class Terapeuta extends Medico{
    private int terapias;

    public Terapeuta() {
    }

    public Terapeuta(int terapias, String colegio, String nombre, String apellido, int años, int salario) {
        super(colegio, nombre, apellido, años, salario);
        this.terapias = terapias;
    }

    public int getTerapias() {
        return terapias;
    }

    public void setTerapias(int terapias) {
        this.terapias = terapias;
    }

    @Override
    public String toString() {
        return "Terapeuta{" + "terapias=" + terapias + '}';
    }
    
}
