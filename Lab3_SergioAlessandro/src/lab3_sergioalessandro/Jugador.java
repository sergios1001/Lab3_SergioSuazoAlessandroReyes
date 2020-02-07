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
public class Jugador extends Persona{
    private int numero,triple,defensa,medio,rebote,bandeja,pases,posteo,altura;

    public Jugador() {
    }
    
    public Jugador(int numero, int triple, int defensa, int medio, int rebote, int bandeja, int pases, int posteo, int altura, String nombre, String apellido, int años, int salario) {
        super(nombre, apellido, años, salario);
        this.numero = numero;
        this.triple = triple;
        this.defensa = defensa;
        this.medio = medio;
        this.rebote = rebote;
        this.bandeja = bandeja;
        this.pases = pases;
        this.posteo = posteo;
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTriple() {
        return triple;
    }

    public void setTriple(int triple) {
        this.triple = triple;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getMedio() {
        return medio;
    }

    public void setMedio(int medio) {
        this.medio = medio;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBandeja() {
        return bandeja;
    }

    public void setBandeja(int bandeja) {
        this.bandeja = bandeja;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getPosteo() {
        return posteo;
    }

    public void setPosteo(int posteo) {
        this.posteo = posteo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numero=" + numero + ", triple=" + triple + ", defensa=" + defensa + ", medio=" + medio + ", rebote=" + rebote + ", bandeja=" + bandeja + ", pases=" + pases + ", posteo=" + posteo + ", altura=" + altura + '}';
    }
    
}
