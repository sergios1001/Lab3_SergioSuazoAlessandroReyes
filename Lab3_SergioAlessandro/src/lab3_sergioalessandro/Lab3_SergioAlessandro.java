package lab3_sergioalessandro;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;























public class Lab3_SergioAlessandro {
    
    public static Scanner leer = new Scanner(System.in);
    public static Random random = new Random();
    
    ArrayList<Jugador> jugadores = new ArrayList();
    ArrayList<Jugador> libresj = new ArrayList();
    ArrayList<Entrenador> entrenadores = new ArrayList();
    ArrayList<Entrenador> librese = new ArrayList();
    ArrayList<Medico> medicos = new ArrayList();
    ArrayList<Equipo> equipos = new ArrayList();
    ArrayList<Jugada> jugada = new ArrayList();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's') {
            System.out.println("Que opcion quiere utilizar:"
                    + "\n1) Agregar"
                    + "\n2) Despedir"
                    + "\n3) Modificar"
                    + "\n4) Simular entreno"
                    + "\n5) Simular jugar"
                    + "\n6) Salir"
                    + "\nSeleccione una opción(si pone una opcion no indicada, el programa termina): ");
            int op = leer.nextInt();
            switch (op) {
                case 1://Agrear
                    System.out.println("Que desea crear: "
                            + "\na) Jugador"
                            + "\nb) Medico"
                            + "\nc) Dueño"
                            + "\nd) Entrenador"
                            + "\ne) Equipo"
                            + "\nf) jugada"
                            + "\nSeleccione una opcion: ");
                    char opm1 = leer.next().charAt(0);
                    switch(opm1){
                        case 'a':
                            
                            break;
                        case 'b':
                            
                            break;
                        case 'c':
                            
                            break;
                        case 'd':
                            
                            break;
                        case 'e':
                            
                            break;
                        case 'f':
                            
                            break;
                    }
                    break;
                case 2://despedir

                    break;
                case 3://modificar

                    break;
                case 4://simular entreno

                    break;
                case 5://simular jugar

                    break;
                case 6://salir
                    resp = 'n';
                    break;
                default:
                    resp = 'n';
            }
        }

        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
