/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sergioalessandro;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Equipo {
    private String nombre;
    private Dueño dueño;
    private ArrayList<Jugador> jugadores =new ArrayList<>();
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Entrenador> entrenadores = new ArrayList<>();
    private ArrayList<Jugadas> jugadas=new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre, Dueño dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public ArrayList<Jugadas> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Jugadas> jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", due\u00f1o=" + dueño + ", jugadores=" + jugadores + ", medicos=" + medicos + ", entrenadores=" + entrenadores + ", jugadas=" + jugadas + '}';
    }
    
}
