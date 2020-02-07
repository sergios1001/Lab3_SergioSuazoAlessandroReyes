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
public class Medico extends Persona{
    private String colegio;

    public Medico() {
    }

    public Medico(String colegio, String nombre, String apellido, int años, int salario) {
        super(nombre, apellido, años, salario);
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Medico{" + "colegio=" + colegio + '}';
    }
    
}
