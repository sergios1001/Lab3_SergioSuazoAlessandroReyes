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
public class Asistente extends Entrenador{

    public Asistente() {
    }

    public Asistente(boolean jugador, Jugadas favorita, String nombre, String apellido, int años) {
        super(jugador, favorita, nombre, apellido, años, 1000000);
    }
    
}
