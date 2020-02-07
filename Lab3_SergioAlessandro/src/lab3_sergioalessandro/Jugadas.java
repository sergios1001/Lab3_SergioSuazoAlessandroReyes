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
public class Jugadas {
    private String nombre, descripcion;
    private int efectividad;

    public Jugadas() {
    }

    public Jugadas(String nombre, String descripcion, int efectividad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.efectividad = efectividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEfectividad() {
        return efectividad;
    }

    public void setEfectividad(int efectividad) {
        this.efectividad = efectividad;
    }

    @Override
    public String toString() {
        return "Jugadas{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", efectividad=" + efectividad + '}';
    }
    
}
