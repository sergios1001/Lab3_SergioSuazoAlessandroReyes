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
    public static ArrayList<Dueño> dueños = new ArrayList();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        jugadas.add(new Jugadas("La mejor", "cuatro pases en el area propia y darle el pase a Kobe y que haga todo", 100));
        jugadas.add(new Jugadas("La estupida", "cuatro pases en el area propia, amagar pase a la derecha, despues "
                + "a la izquierda, mientras se descuelga un jugador por el centro, darle el pase a el", 60));
        jugadas.add(new Jugadas("la escopeta", "se desplegan los 5 jugadores en la cancha, el del centro mas adelantado"
                + " darle el pase al jugador del centro, y atacar todos juntos, dando el pase como deseen, "
                + "permaneciendo la misma formacion, hasta poder tirar", 40));
        libresj.add(new Escolta(13, 99, 99, 99, 99, 99, 99, 99, "K0be", "Bryant", 30, 30000000));
        libresj.add(new Base(22, 99, 40, 99, 70, 40, 80, 90, "Stephen", "Curry", 22, 10000000));
        libresj.add(new Alero(23, 80, 99, 99, 99, 60, 80, 90, "Lebron", "James", 24, 15000000));
        libresj.add(new Pivot(24, 99, 99, 99, 99, 99, 99, 99, "Michael", "Jordan", 29, 30000000));
        libresj.add(new Centro(10, 70, 70, 70, 70, 70, 70, 70,"Kevin", "Durant", 33, 15000000));
        libresj.add(new Escolta(33, 99, 99, 99, 99, 99, 99, 99, "Kemba", "Walker", 33, 20000000));
        dueños.add(new Dueño(1000000000, "Madrid", "Fiorentino", "Perez", 65, 23000000));
        medicos.add(new Cirujano(100, "Unah", "Ian", "Barrientos", 23, 100000));
        medicos.add(new MedicoGeneral(100, "Unah", "Ian", "Barrientos", 23, 100000));
        medicos.add(new Terapeuta(100, "Unah", "Ian", "Barrientos", 23, 100000));
        equipos.add(new Equipo("Linces","2000", dueños.get(0), 200));
        equipos.get(0).getMedicos().add(medicos.get(1));
        equipos.get(0).getMedicos().add(medicos.get(0));
        equipos.get(0).getMedicos().add(medicos.get(2));
        equipos.get(0).getJugadores().add(libresj.get(0));
        equipos.get(0).getJugadores().add(libresj.get(1));
        equipos.get(0).getJugadores().add(libresj.get(2));
        equipos.get(0).getJugadores().add(libresj.get(3));
        equipos.get(0).getJugadores().add(libresj.get(4));
        equipos.get(0).getJugadas().add(jugadas.get(0));
        equipos.get(0).getJugadas().add(jugadas.get(1));
        equipos.get(0).getJugadas().add(jugadas.get(2));
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
                    String nombre = leer.next();
                    String apellido = leer.next();
                    int edad = leer.nextInt();
                    int sal = leer.nextInt();
                    
                    switch(opm1){
                        case 'a'://jugador
                            System.out.println("De que posicion juega su jugador:"
                                    + "\n1) Base"
                                    + "\n2) Escolta"
                                    + "\n3) Alero"
                                    + "\n4) Pivot"
                                    + "\n5) Centro"
                                    + "Elija una opcion: ");
                            int o = leer.nextInt();
                            switch(o){
                                case 1://base
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.next();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.next();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    int numc = leer.nextInt();
                                    System.out.println("Cuantos años tiene el jugador: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del jugador");
                                    sal = leer.nextInt();
                                    System.out.println("Cuanto de tiro de 3 tiene: ");
                                    int tir3 = leer.nextInt();
                                    System.out.println("Cuanto de defensa tiene: ");
                                    int def = leer.nextInt();
                                    System.out.println("Cuanto de media tiene: ");
                                    int media = leer.nextInt();
                                    System.out.println("Cuanto de rebote tiene: ");
                                    int rebote = leer.nextInt();
                                    System.out.println("Cuanto de bandeja tiene: ");
                                    int bandeja = leer.nextInt();
                                    System.out.println("Cuanto de pases tiene: ");
                                    int pases = leer.nextInt();
                                    System.out.println("Cuanto de posteo tiene: ");
                                    int posteo = leer.nextInt();
                                    libresj.add(new Base(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, pases, sal));
                                    break;
                                case 2://escolta
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.next();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.next();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años tiene el jugador: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del jugador");
                                    sal = leer.nextInt();
                                    System.out.println("Cuanto de tiro de 3 tiene: ");
                                    tir3 = leer.nextInt();
                                    System.out.println("Cuanto de defensa tiene: ");
                                    def = leer.nextInt();
                                    System.out.println("Cuanto de media tiene: ");
                                    media = leer.nextInt();
                                    System.out.println("Cuanto de rebote tiene: ");
                                    rebote = leer.nextInt();
                                    System.out.println("Cuanto de bandeja tiene: ");
                                    bandeja = leer.nextInt();
                                    System.out.println("Cuanto de pases tiene: ");
                                    pases = leer.nextInt();
                                    System.out.println("Cuanto de posteo tiene: ");
                                    posteo = leer.nextInt();
                                    libresj.add(new Escolta(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, pases, sal));
                                    break;
                                case 3://alero
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.next();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.next();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años tiene el jugador: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del jugador");
                                    sal = leer.nextInt();
                                    System.out.println("Cuanto de tiro de 3 tiene: ");
                                    tir3 = leer.nextInt();
                                    System.out.println("Cuanto de defensa tiene: ");
                                    def = leer.nextInt();
                                    System.out.println("Cuanto de media tiene: ");
                                    media = leer.nextInt();
                                    System.out.println("Cuanto de rebote tiene: ");
                                    rebote = leer.nextInt();
                                    System.out.println("Cuanto de bandeja tiene: ");
                                    bandeja = leer.nextInt();
                                    System.out.println("Cuanto de pases tiene: ");
                                    pases = leer.nextInt();
                                    System.out.println("Cuanto de posteo tiene: ");
                                    posteo = leer.nextInt();
                                    libresj.add(new Alero(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, pases, sal));
                                    break;
                                case 4://pivot
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.next();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.next();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años tiene el jugador: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del jugador");
                                    sal = leer.nextInt();
                                    System.out.println("Cuanto de tiro de 3 tiene: ");
                                    tir3 = leer.nextInt();
                                    System.out.println("Cuanto de defensa tiene: ");
                                    def = leer.nextInt();
                                    System.out.println("Cuanto de media tiene: ");
                                    media = leer.nextInt();
                                    System.out.println("Cuanto de rebote tiene: ");
                                    rebote = leer.nextInt();
                                    System.out.println("Cuanto de bandeja tiene: ");
                                    bandeja = leer.nextInt();
                                    System.out.println("Cuanto de pases tiene: ");
                                    pases = leer.nextInt();
                                    System.out.println("Cuanto de posteo tiene: ");
                                    posteo = leer.nextInt();
                                    libresj.add(new Pivot(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, pases, sal));
                                    break;
                                case 5://centro
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.next();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.next();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años tiene el jugador: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del jugador");
                                    sal = leer.nextInt();
                                    System.out.println("Cuanto de tiro de 3 tiene: ");
                                    tir3 = leer.nextInt();
                                    System.out.println("Cuanto de defensa tiene: ");
                                    def = leer.nextInt();
                                    System.out.println("Cuanto de media tiene: ");
                                    media = leer.nextInt();
                                    System.out.println("Cuanto de rebote tiene: ");
                                    rebote = leer.nextInt();
                                    System.out.println("Cuanto de bandeja tiene: ");
                                    bandeja = leer.nextInt();
                                    System.out.println("Cuanto de pases tiene: ");
                                    pases = leer.nextInt();
                                    System.out.println("Cuanto de posteo tiene: ");
                                    posteo = leer.nextInt();
                                    libresj.add(new Centro(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, pases, sal));
                                    break;
                            }
                            break;
                        case 'b'://Medico
                            System.out.println("De que posicion juega su jugador:"
                                    + "\n1) Base"
                                    + "\n2) Escolta"
                                    + "\n3) Alero"
                                    + "\n4) Pivot"
                                    + "\n5) Centro"
                                    + "Elija una opcion: ");
                            o = leer.nextInt();
                            switch(o){
                                
                            }
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
public static void Jugar(Equipo a)
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
        int pos=0;
        for (Medico m: a.getMedicos()) {
            if(m instanceof Cirujano)
            {
                System.out.println(pos+" "+m.getNombre());
                pos++;
            }
        }
        int n=leer.nextInt();
        pos=0;
        for (Medico m: a.getMedicos()) {
            if(m instanceof Cirujano)
            {
                if(pos==n)
                {
                    ((Cirujano) m).setCirugias(((Cirujano) m).getCirugias()+1);
                }
                pos++;
            }
        }
        pos=0;
        System.out.println("Seleccionde un Terapeuta: ");
        for (Medico m: a.getMedicos()) {
            if(m instanceof Terapeuta)
            {
                System.out.println(pos+" "+m.getNombre());
                pos++;
            }
        }
        int l=leer.nextInt();
        pos=0;
        for (Medico m: a.getMedicos()) {
            if(m instanceof Terapeuta)
            {
                if(pos==l)
                {
                    ((Terapeuta) m).setTerapias(((Terapeuta) m).getTerapias()+1);
                }
                pos++;
            }
        }
    }
    if(j<=30)
    {
        int x=random.nextInt(a.getJugadores().size());
        System.out.println(a.getJugadores().get(x).getNombre()+" Se ha enfermado");
        System.out.println("Seleccionde un Medico General: ");
        int pos=0;
        for (Medico m: a.getMedicos()) {
            if(m instanceof MedicoGeneral)
            {
                System.out.println(pos+" "+m.getNombre());
                pos++;
            }
        }
        int n=leer.nextInt();
        pos=0;
        for (Medico m: a.getMedicos()) {
            if(m instanceof MedicoGeneral)
            {
                if(pos==n)
                {
                    ((MedicoGeneral) m).setEnfermedades(((MedicoGeneral) m).getEnfermedades()+1);
                }
                pos++;
            }
        }
    }
    System.out.println("Termina el Juego");
}
    
public static void Entrenar(Equipo a)
{
    int pos=0;
        for (Entrenador m: a.getEntrenadores()) {
            if(m instanceof PreparadorFisico)
            {
                System.out.println(pos+" "+m.getNombre());
                pos++;
            }
        }
        System.out.println("Seleccione un preparador Fisico: ");
        int n=leer.nextInt();
    Jugadas x,y,z;
    for (int i = 0; i < a.getJugadas().size(); i++) {
        System.out.println(i+" "+a.getJugadas().get(i).getNombre());
    }
    System.out.print("Seleccione la primera jugada: ");
    int cont=leer.nextInt();
    x=a.getJugadas().get(cont);
    for (int i = 0; i < a.getJugadas().size(); i++) {
        System.out.println(i+" "+a.getJugadas().get(i).getNombre());
    }
    System.out.print("Seleccione la segunda jugada: ");
    cont=leer.nextInt();
    y=a.getJugadas().get(cont);
    for (int i = 0; i < a.getJugadas().size(); i++) {
        System.out.println(i+" "+a.getJugadas().get(i).getNombre());
    }
    System.out.print("Seleccione la tercera jugada: ");
    cont=leer.nextInt();
    z=a.getJugadas().get(cont);
    int p1,p2,p3;
    p1=1+random.nextInt(100);
    p2=1+random.nextInt(100);
    p3=1+random.nextInt(100);
    
    if(p1>x.getEfectividad())
    {
        System.out.println("Se completo la primera jugada con exito");
    }
    else
    {
        System.out.println("No se completo la primera jugada");
    }
    if(p2>x.getEfectividad())
    {
        System.out.println("Se completo la segunda jugada con exito");
    }
    else
    {
        System.out.println("No se completo la segunda jugada");
    }
    if(p3>x.getEfectividad())
    {
        System.out.println("Se completo la tercera jugada con exito");
    }
    else
    {
        System.out.println("No se completo la tercera jugada");
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
