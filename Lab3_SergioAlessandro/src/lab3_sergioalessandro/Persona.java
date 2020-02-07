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
public class Persona {
    private String nombre, apellido;
    private int años,salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int años, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.años = años;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1os=" + años + ", salario=" + salario + '}';
    }
    
}
