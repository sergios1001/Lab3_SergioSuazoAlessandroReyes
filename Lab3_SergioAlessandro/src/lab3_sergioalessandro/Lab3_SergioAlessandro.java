package lab3_sergioalessandro;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;























public class Lab3_SergioAlessandro {
    
    public static Scanner leer = new Scanner(System.in);
    public static Random random = new Random();
    
    public static ArrayList<Jugador> libresj = new ArrayList();
    public static ArrayList<Entrenador> librese = new ArrayList();
    public static ArrayList<Medico> medicos = new ArrayList();
    public static ArrayList<Equipo> equipos = new ArrayList();
    public static ArrayList<Jugadas> jugadas = new ArrayList();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        jugadas.add(new Jugadas("La mejor", "cuatro pases en el area propia y darle el pase a Kobe y que haga todo", 100));
        jugadas.add(new Jugadas("La estupida", "cuatro pases en el area propia, amagar pase a la derecha, despues "
                + "a la izquierda, mientras se descuelga un jugador por el centro, darle el pase a el", 60));
        jugadas.add(new Jugadas("la escopeta", "se desplegan los 5 jugadores en la cancha, el del centro mas adelantado"
                + " darle el pase al jugador del centro, y atacar todos juntos, dando el pase como deseen, "
                + "permaneciendo la misma formacion, hasta poder tirar", 40));
        libresj.add(new Jugador(13, 10, 10, 10, 10, 10, 10, 10, 200, "KObe", "Bryant", 33, 20000000));
        
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
                            String nombre = leer.next();
                            System.out.println("Cual es el apellido del jugador: ");
                            String apellido = leer.next();
                            System.out.println("Cuantos años tiene el jugador: ");
                            int edad = leer.nextInt();
                            System.out.println("de cuanto es el salario del jugador");
                            int sal = leer.nextInt();
                            break;
                        case 'b'://Medico
                            System.out.println("Cual es el nombre del Medico: ");
                            nombre = leer.next();
                            System.out.println("Cual es el apellido del Medico: ");
                            apellido = leer.next();
                            System.out.println("Cuantos años tiene el Medico: ");
                            edad = leer.nextInt();
                            System.out.println("de cuanto es el salario del Medico");
                            sal = leer.nextInt();
                            break;
                        case 'c'://Dueño
                            System.out.println("Cual es el nombre del Dueño: ");
                            nombre = leer.next();
                            System.out.println("Cual es el apellido del Dueño: ");
                            apellido = leer.next();
                            System.out.println("Cuantos años tiene el Dueño: ");
                            edad = leer.nextInt();
                            System.out.println("de cuanto es el salario del Dueño");
                            sal = leer.nextInt();
                            break;
                        case 'd'://Entrenador
                            System.out.println("Cual es el nombre del Entrenador: ");
                            nombre = leer.next();
                            System.out.println("Cual es el apellido del Entrenador: ");
                            apellido = leer.next();
                            System.out.println("Cuantos años tiene el Entrenador: ");
                            edad = leer.nextInt();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public void Jugar(Equipo a)
{
    System.out.println("Inicia el juego");
    int i,j;
    i=1+random.nextInt(100);
    j=1+random.nextInt(100);
    if(i<=40)
    {
       int x=random.nextInt(a.getJugadores().size());
        System.out.println(a.getJugadores().get(x).getNombre()+" Se ha lesionado");
        System.out.println("Seleccionde un Cirujano: ");
        for (Medico a.get : libresj) {
            
        }
        a.getMedicos().get
    }
    System.out.println("Termina el Juego");
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
