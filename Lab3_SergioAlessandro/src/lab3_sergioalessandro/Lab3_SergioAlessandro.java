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
                    + "\n1) Crear"
                    + "\n2) Agregar personal a un equipo"
                    + "\n3) Despedir"
                    + "\n4) Modificar"
                    + "\n5) Simular entreno"
                    + "\n6) Simular jugar"
                    + "\n7) Salir"
                    + "\nSeleccione una opción(si pone una opcion no indicada, el programa termina): ");
            int op = leer.nextInt();
            switch (op) {
                case 1://Crear
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
                        case 'a'://jugador
                            System.out.println("Cual es el nombre del jugador: ");
                            
                            System.out.println("Cual es el apellido del jugador: ");
                            
                            System.out.println("Cuantos años tiene el jugador: ");
                            
                            System.out.println("de cuanto es el salario del jugador");
                            
                            break;
                        case 'b'://Medico
                            System.out.println("Cual es el nombre del Medico: ");
                            
                            System.out.println("Cual es el apellido del Medico: ");
                            
                            System.out.println("Cuantos años tiene el Medico: ");
                            
                            System.out.println("de cuanto es el salario del Medico");
                            
                            break;
                        case 'c'://Dueño
                            System.out.println("Cual es el nombre del Dueño: ");
                            
                            System.out.println("Cual es el apellido del Dueño: ");
                            
                            System.out.println("Cuantos años tiene el Dueño: ");
                            
                            System.out.println("de cuanto es el salario del Dueño");
                            
                            break;
                        case 'd'://Entrenador
                            System.out.println("Cual es el nombre del Entrenador: ");
                            
                            System.out.println("Cual es el apellido del Entrenador: ");
                            
                            System.out.println("Cuantos años tiene el Entrenador: ");
                            
                            System.out.println("de cuanto es el salario del Entrenador");
                            
                            break;
                        case 'e'://Equipo
                            
                            break;
                        case 'f'://Jugada
                            
                            break;
                    }
                    break;
                case 2://Agregar personal a un equipo

                    break;
                case 3://Despedir

                    break;
                case 4://Modificar

                    break;
                case 5://Simular entreno

                    break;
                case 6://Simular jugar
                    
                    break;
                case 7://salir
                    resp = 'n';
                    break;
                default:
                    resp = 'n';
            }
        }

        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
