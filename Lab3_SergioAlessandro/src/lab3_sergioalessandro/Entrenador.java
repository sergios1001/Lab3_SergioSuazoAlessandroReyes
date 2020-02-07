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
public class Entrenador extends Persona{
    private boolean jugador;
    private Jugadas favorita;

    public Entrenador() {
    }

    public Entrenador(boolean jugador, Jugadas favorita, String nombre, String apellido, int años, int salario) {
        super(nombre, apellido, años, salario);
        this.jugador = jugador;
        this.favorita = favorita;
    }

    public boolean isJugador() {
        return jugador;
    }

    public void setJugador(boolean jugador) {
        this.jugador = jugador;
    }

    public Jugadas getFavorita() {
        return favorita;
    }

    public void setFavorita(Jugadas favorita) {
        this.favorita = favorita;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "jugador=" + jugador + ", favorita=" + favorita + '}';
    }
    
}
