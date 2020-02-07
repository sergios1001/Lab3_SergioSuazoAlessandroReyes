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
public class Dueño extends Persona{
    private int worth;
    private String ciudad;

    public Dueño() {
    }
    
    public Dueño(int worth, String ciudad, String nombre, String apellido, int años, int salario) {
        super(nombre, apellido, años, salario);
        this.worth = worth;
        this.ciudad = ciudad;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "worth=" + worth + ", ciudad=" + ciudad + '}';
    }
    
}
