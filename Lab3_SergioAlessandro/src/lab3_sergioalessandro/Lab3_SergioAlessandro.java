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
        medicos.add(new MedicoGeneral(100, "Unah", "Maria", "Aguilar", 23, 100000));
        medicos.add(new Terapeuta(100, "Unah", "Alejandra", "Lopez", 23, 100000));
        librese.add(new EntrenadorPrincipal(true, jugadas.get(0), "Alessandro", "Reyes", 23));
        librese.add(new Asistente(true, jugadas.get(0), "Giovanni", "Reyes", 23));
        librese.add(new PreparadorFisico(true, jugadas.get(0), "Alessandro", "Trimarchi", 23, 2000000));
        equipos.add(new Equipo("Linces","2000", dueños.get(0), 200));
        equipos.get(0).getMedicos().add(medicos.get(1));
        equipos.get(0).getMedicos().add(medicos.get(0));
        equipos.get(0).getMedicos().add(medicos.get(2));
        equipos.get(0).getJugadores().add(libresj.get(0));
        equipos.get(0).getJugadores().add(libresj.get(1));
        equipos.get(0).getJugadores().add(libresj.get(2));
        equipos.get(0).getJugadores().add(libresj.get(3));
        equipos.get(0).getJugadores().add(libresj.get(4));
        equipos.get(0).getEntrenadores().add(librese.get(0));
        equipos.get(0).getEntrenadores().add(librese.get(1));
        equipos.get(0).getEntrenadores().add(librese.get(2));
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
                    String nombre;
                    String apellido;
                    int edad;
                    int sal;
                    
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
                                    nombre = leer.nextLine();
                                    leer.nextLine();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    int numc = leer.nextInt();
                                    System.out.println("Cuantos años de experiencia tiene el jugador: ");
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
                                    libresj.add(new Base(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, edad, sal));
                                    break;
                                case 2://escolta
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.nextLine();
                                    leer.nextLine();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años de experiencia tiene el jugador: ");
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
                                    libresj.add(new Escolta(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, edad, sal));
                                    break;
                                case 3://alero
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.nextLine();
                                    leer.nextLine();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años de experiencia tiene el jugador: ");
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
                                    libresj.add(new Alero(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, edad, sal));
                                    break;
                                case 4://pivot
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.nextLine();
                                    leer.nextLine();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años de experiencia tiene el jugador: ");
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
                                    libresj.add(new Pivot(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, edad, sal));
                                    break;
                                case 5://centro
                                    System.out.println("Cual es el nombre del jugador: ");
                                    nombre = leer.next();
                                    leer.nextLine();
                                    System.out.println("Cual es el apellido del jugador: ");
                                    apellido = leer.next();
                                    System.out.println("Que numero de camisa utilizara: ");
                                    numc = leer.nextInt();
                                    System.out.println("Cuantos años de experiencia tiene el jugador: ");
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
                                    libresj.add(new Centro(numc, tir3, def, media, rebote, bandeja, pases, posteo, nombre, apellido, edad, sal));
                                    break;
                            }
                            break;
                        case 'b'://Medico
                            System.out.println("De que posicion juega su jugador:"
                                    + "\n1) Medico General"
                                    + "\n2) Cirujano"
                                    + "\n3) Terapeuta"
                                    + "Elija una opcion: ");
                            o = leer.nextInt();
                            switch(o){
                                case 1:
                                    System.out.println("Cual es el nombre del Medico: ");
                                    nombre = leer.nextLine();
                                    System.out.println("Cual es el apellido del Medico: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Cuantos años de experiencia tiene el Medico: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del Medico");
                                    sal = leer.nextInt();
                                    System.out.println("Cuantas enfermedades ha curado: ");
                                    int dr = leer.nextInt();
                                    System.out.println("En que colegio se graduo: ");
                                    String col = leer.nextLine();
                                    medicos.add(new MedicoGeneral(dr, col, nombre, apellido, edad, sal));
                                    break;
                                case 2:
                                    System.out.println("Cual es el nombre del Medico: ");
                                    nombre = leer.nextLine();
                                    System.out.println("Cual es el apellido del Medico: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Cuantos años de experiencia tiene el Medico: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del Medico");
                                    sal = leer.nextInt();
                                    System.out.println("Cuantas enfermedades ha curado: ");
                                    dr = leer.nextInt();
                                    System.out.println("En que colegio se graduo: ");
                                    col = leer.nextLine();
                                    medicos.add(new Cirujano(dr, col, nombre, apellido, edad, sal));
                                    break;
                                case 3:
                                    System.out.println("Cual es el nombre del Medico: ");
                                    nombre = leer.nextLine();
                                    System.out.println("Cual es el apellido del Medico: ");
                                    apellido = leer.nextLine();
                                    System.out.println("Cuantos años de experiencia tiene el Medico: ");
                                    edad = leer.nextInt();
                                    System.out.println("de cuanto es el salario del Medico");
                                    sal = leer.nextInt();
                                    System.out.println("Cuantas enfermedades ha curado: ");
                                    dr = leer.nextInt();
                                    System.out.println("En que colegio se graduo: ");
                                    col = leer.nextLine();
                                    medicos.add(new Terapeuta(dr, col, nombre, apellido, edad, sal));
                                    break;
                            }
                            
                            break;
                        case 'c'://Dueño
                            System.out.println("Cual es el nombre del Dueño: ");
                            nombre = leer.nextLine();
                            System.out.println("Cual es el apellido de " +": ");
                            apellido = leer.nextLine();
                            System.out.println("Cuantos años de experiencia tiene  " +": ");
                            edad = leer.nextInt();
                            System.out.println("de cuanto es el salario de " +": ");
                            sal = leer.nextInt();
                            System.out.println("Cual es el net worth de " +": ");
                            int worth = leer.nextInt();
                            System.out.println("De que ciudad es " +": ");
                            dueños.add(new Dueño(worth, nombre, nombre, apellido, edad, sal));
                            break;
                        case 'd'://Entrenador
                            
                            System.out.println("Cual es el nombre del Entrenador: ");
                            nombre = leer.nextLine();
                            System.out.println("Cual es el apellido del Entrenador: ");
                            apellido = leer.nextLine();
                            System.out.println("Cuantos años de experiencia tiene el Entrenador: ");
                            edad = leer.nextInt();
                            System.out.println("El entrenador fue jugador? aprete (1) para si y (2) para no: ");
                            int b = leer.nextInt();
                            boolean jugad;
                            if(b == 1){
                                jugad = true;
                            }else
                                jugad = false;
                            for (int i = 0; i < jugadas.size(); i++) {
                                System.out.println(i+" "+jugadas.get(i).getNombre());
                            }
                            System.out.println("escoja el numero de la jugada favorita de "+nombre+" :");
                            
                            break;
                        case 'e'://Equipo
                            for (int i = 0; i < dueños.size(); i++) {
                                System.out.println(i+ " "+dueños.get(i).getNombre());
                            }
                            System.out.println("Elija el numero del dueño que es el dueño del equipo: ");
                            int elej = leer.nextInt();
                            while(elej < 0 || elej >= dueños.size()){
                                System.out.println("ERROR, Elija el numero del dueño que es el dueño del equipo: ");
                                elej = leer.nextInt();
                            }
                            System.out.println("Nombre del equipo: ");
                            nombre = leer.nextLine();
                            System.out.println("En que año se creo "+nombre+": ");
                            String fund = leer.nextLine();
                            System.out.println("Cuantos campeonatos tiene el equipo: ");
                            int campeonatos = leer.nextInt();
                            equipos.add(new Equipo(nombre, fund, dueños.get(elej), campeonatos));
                            break;
                        case 'f'://Jugada
                            
                            break;
                    }
                    break;
                case 2://Agregar personal a un equipo
                    System.out.println("Que desea agregar"
                            + "\n1) Entrenadores"
                            + "\n2) Jugadores"
                            + "\n3) Medicos"
                            + "\nElija un numero: ");
                    int opcion = leer.nextInt();
                    switch(opcion){
                        case 1://entradores
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+ " "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el numero del equipo que desea agregarle un entrenador: ");
                            int oo = leer.nextInt();
                            while (oo < 0 || oo >= equipos.size()) {
                                System.out.println("Elija el numero del equipo que desea agregarle un entrenador: ");
                                oo = leer.nextInt();
                            }
                            int e;
                            if(equipos.get(oo).getEntrenadores().size() == 3){
                                break;
                            }else{
                                System.out.println("Que tipo de entrenador quiere agregar"
                                        + "\n1) entrenador principal"
                                        + "\n2) asistente"
                                        + "\n3) preparador fisico"
                                        + "\nElija el numero del que quiere agregar: ");
                                e = leer.nextInt();
                                if(e == 1){
                                    for (int i = 0; i < equipos.get(oo).getEntrenadores().size(); i++) {
                                        if(equipos.get(oo).getEntrenadores().get(i) instanceof EntrenadorPrincipal){
                                            System.out.println("El equipo ya tiene un entrenador principal.");
                                            break;
                                        }
                                    }
                                    for (int i = 0; i < librese.size(); i++) {
                                        if(librese.get(i) instanceof EntrenadorPrincipal)
                                            System.out.println(i+" "+librese.get(i).getNombre());
                                    }
                                    System.out.println("Elija el numero del entrenador que quiere agregar: ");
                                    int entre = leer.nextInt();
                                    equipos.get(oo).getEntrenadores().add(librese.get(entre));
                                    librese.remove(entre);
                                    System.out.println("Se ha comprado con exito al entrenador.");
                                }else if( e == 2){
                                    for (int i = 0; i < equipos.get(oo).getEntrenadores().size(); i++) {
                                        if(equipos.get(oo).getEntrenadores().get(i) instanceof Asistente){
                                            System.out.println("El equipo ya tiene un Asistente.");
                                            break;
                                        }
                                    }
                                    for (int i = 0; i < librese.size(); i++) {
                                        if(librese.get(i) instanceof Asistente)
                                            System.out.println(i+" "+librese.get(i).getNombre());
                                    }
                                    System.out.println("Elija el numero del asistente que quiere agregar: ");
                                    int entre = leer.nextInt();
                                    equipos.get(oo).getEntrenadores().add(librese.get(entre));
                                    librese.remove(entre);
                                    System.out.println("Se ha comprado con exito al entrenador.");
                                }else if(e == 3){
                                    for (int i = 0; i < equipos.get(oo).getEntrenadores().size(); i++) {
                                        if(equipos.get(oo).getEntrenadores().get(i) instanceof PreparadorFisico){
                                            System.out.println("El equipo ya tiene un PreparadorFisico.");
                                            break;
                                        }
                                    }
                                    for (int i = 0; i < librese.size(); i++) {
                                        if(librese.get(i) instanceof PreparadorFisico)
                                            System.out.println(i+" "+librese.get(i).getNombre());
                                    }
                                    System.out.println("Elija el numero del preparador fisico que quiere agregar: ");
                                    int entre = leer.nextInt();
                                    equipos.get(oo).getEntrenadores().add(librese.get(entre));
                                    librese.remove(entre);
                                    System.out.println("Se ha comprado con exito al entrenador.");
                                }
                            }
                            break;
                        case 2://jugadores
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+ " "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el numero del equipo que desea agregarle un jugador: ");
                            oo = leer.nextInt();
                            while (oo < 0 || oo >= equipos.size()) {
                                System.out.println("Elija el numero del equipo que desea agregarle un jugador: ");
                                oo = leer.nextInt();
                            }
                            if(equipos.get(oo).getJugadores().size() == 13){
                                break;
                            }else{
                                for (int i = 0; i < libresj.size(); i++) {
                                    System.out.println(i+" "+libresj.get(i).getNombre());
                                }
                                System.out.println("Elija el numero del jugador que quiere elegir");
                                int n = leer.nextInt();
                                equipos.get(oo).getJugadores().add(libresj.get(n));
                                libresj.remove(n);
                                System.out.println("Jugador comprado con exito.");
                            }
                            break;
                        case 3://medicos
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+ " "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el numero del equipo que desea agregarle un medico: ");
                            oo = leer.nextInt();
                            while (oo < 0 || oo >= equipos.size()) {
                                System.out.println("Elija el numero del equipo que desea agregarle un medico: ");
                                oo = leer.nextInt();
                            }

                            System.out.println("Que tipo de medico quiere agregar"
                                    + "\n1) Medico general"
                                    + "\n2) Cirujano"
                                    + "\n3) Terapeuta"
                                    + "\nElija el numero del que quiere agregar: ");
                            e = leer.nextInt();
                            if (e == 1) {
                                for (int i = 0; i < medicos.size(); i++) {
                                    if (medicos.get(i) instanceof MedicoGeneral) {
                                        System.out.println(i + " " + medicos.get(i).getNombre());
                                    }
                                }
                                System.out.println("Elija el numero del medico que quiere agregar: ");
                                int entre = leer.nextInt();
                                equipos.get(oo).getMedicos().add(medicos.get(entre));
                                medicos.remove(entre);
                                System.out.println("Se ha comprado con exito al medico.");
                            } else if (e == 2) {
                                for (int i = 0; i < medicos.size(); i++) {
                                    if (medicos.get(i) instanceof Cirujano) {
                                        System.out.println(i + " " + medicos.get(i).getNombre());
                                    }
                                }
                                System.out.println("Elija el numero del medico que quiere agregar: ");
                                int entre = leer.nextInt();
                                equipos.get(oo).getMedicos().add(medicos.get(entre));
                                medicos.remove(entre);
                                System.out.println("Se ha comprado con exito al medico.");
                            } else if (e == 3) {
                                for (int i = 0; i < medicos.size(); i++) {
                                    if (medicos.get(i) instanceof Terapeuta) {
                                        System.out.println(i + " " + medicos.get(i).getNombre());
                                    }
                                }
                                System.out.println("Elija el numero del medico que quiere agregar: ");
                                int entre = leer.nextInt();
                                equipos.get(oo).getMedicos().add(medicos.get(entre));
                                medicos.remove(entre);
                                System.out.println("Se ha comprado con exito al medico.");
                            }

                            break;
                    }
                    break;
                case 3://Despedir
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i+ " "+equipos.get(i).getNombre());
                    }
                    System.out.println("Escoja el numero del equipo que quiere despedir : ");
                    int eq = leer.nextInt();
                    while (eq < 0 || eq >= equipos.size()) {
                        System.out.println("Error, Escoja el numero del equipo que quiere despedir: ");
                        eq = leer.nextInt();
                    }
                    System.out.println("a quien desea despedir: "
                            + "\n1) Jugador"
                            + "\n2) Entrenador"
                            + "\nELija un numero: ");
                    int sel = leer.nextInt();
                    while (sel != 1 || sel != 2) {
                        System.out.println("ERROR, a quien desea despedir: "
                            + "\n1) Jugador"
                            + "\n2) Entrenador"
                            + "\nELija un numero: ");
                        sel = leer.nextInt();
                    }
                    int desp;
                    if(sel == 1){
                        for (int i = 0; i < equipos.get(eq).getJugadores().size(); i++) {
                            System.out.println(i+ " "+equipos.get(eq).getJugadores().get(i).getNombre());
                        }
                        System.out.println("Elija el numero del jugador que desea despedir: ");
                        desp = leer.nextInt();
                        while (desp < 0 || desp >= equipos.get(eq).getJugadores().size()) {
                            System.out.println("ERROR, Elija el numero del jugador que desea despedir: ");
                            desp = leer.nextInt();
                        }
                        libresj.add(equipos.get(eq).getJugadores().get(desp));
                        equipos.get(eq).getJugadores().remove(desp);
                        System.out.println("Jugador despedido con exito");
                    }else if(sel == 2){
                        desp = 0;
                        int prom =1;
                        for (int i = 0; i < equipos.get(eq).getEntrenadores().size(); i++) {
                            if(equipos.get(eq).getEntrenadores().get(i) instanceof EntrenadorPrincipal)
                                desp = i;
                            if(equipos.get(eq).getEntrenadores().get(i) instanceof Asistente)
                                prom = i;
                        }
                        librese.add(equipos.get(eq).getEntrenadores().get(desp));
                        equipos.get(eq).getEntrenadores().remove(desp);
                        librese.add(new EntrenadorPrincipal(equipos.get(eq).getEntrenadores().get(prom).isJugador(), 
                            equipos.get(eq).getEntrenadores().get(prom).getFavorita(), 
                            equipos.get(eq).getEntrenadores().get(prom).getNombre(), 
                            equipos.get(eq).getEntrenadores().get(prom).getApellido(), 
                            equipos.get(eq).getEntrenadores().get(prom).getAños()));
                        equipos.get(eq).getEntrenadores().remove(prom);
                        equipos.get(eq).getEntrenadores().add(librese.get(librese.size()-1));
                        librese.remove(librese.size()-1);
                        System.out.println("Entrenador despedido con exito. ");
                    }
                    break;
                case 4://Modificar
                    System.out.println("1-Equipo \n"
                            + "2-Jugador \n"
                            + "3-Entrenador \n"
                            + "4-Medico \n"
                            + "5-Dueño \n"
                            + "Seleccione lo que desea modificar: ");
                    int cont=leer.nextInt();
                    switch(cont)
                    {
                        case 1:
                        {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+" "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el equipo que desea modificar: ");
                            int n=leer.nextInt();
                            char select;
                            System.out.print("Desea modificar el nombre? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo nombre: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).setNombre(name);
                            }
                            System.out.print("Desea modificar el año de fundacion? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo año: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).setFundacion(name);
                            }
                            System.out.print("Desea modificar el numero de campeonatos? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo numero: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).setCampeonatos(name);
                            }
                            break;
                        }
                        case 2:
                        {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+" "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el equipo que desea modificar el jugador: ");
                            int n=leer.nextInt();
                            for (int i = 0; i < equipos.get(n).getJugadores().size(); i++) {
                                System.out.println(i+" "+equipos.get(n).getJugadores().get(i).getNombre());
                            }
                            System.out.println("Elija el jugador a modificar: ");
                            int m=leer.nextInt();
                            char select;
                            System.out.print("Desea modificar el nombre? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo nombre: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getJugadores().get(m).setNombre(name);
                            }
                            System.out.print("Desea modificar el numero de camisa? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo numero: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setNumero(name);
                            }
                            
                            System.out.print("Desea modificar el Apellido? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo Apellido: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getJugadores().get(m).setApellido(name);
                            }
                            
                            System.out.print("Desea modificar los años como profesional? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Cantidad de años: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setAños(name);
                            }
                            
                            System.out.print("Desea modificar el salario? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo salario: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setSalario(name);
                            }
                            
                            System.out.print("Desea modificar el Tiro de 3? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo triple: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setTriple(name);
                            }
                            System.out.print("Desea modificar el Tiro medio? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo tiro medio: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setMedio(name);
                            }
                            System.out.print("Desea modificar el Defensa? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo Defensa: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setDefensa(name);
                            }
                            System.out.print("Desea modificar el Rebote? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo Rebote: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setRebote(name);
                            }
                            System.out.print("Desea modificar la Bandeja? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo bandeja: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setBandeja(name);
                            }
                            System.out.print("Desea modificar el Pase? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo pase: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setPases(name);
                            }
                            System.out.print("Desea modificar el Posteo? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo posteo: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getJugadores().get(m).setPosteo(name);
                            }
                            System.out.print("Desea modificar la Bandeja? (s/n): ");
                            select=leer.next().charAt(0);
                          break;
                        }
                        case 3:
                        {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+" "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el equipo que desea modificar el entrenador: ");
                            int n=leer.nextInt();
                            for (int i = 0; i < equipos.get(n).getEntrenadores().size(); i++) {
                                System.out.println(i+" "+equipos.get(n).getEntrenadores().get(i).getNombre());
                            }
                            System.out.println("Elija el entrenador a modificar: ");
                            int m=leer.nextInt();
                            char select;
                            System.out.print("Desea modificar el nombre? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo nombre: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getEntrenadores().get(m).setNombre(name);
                            }
                            System.out.print("Desea modificar el Apellido? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo Apellido: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getEntrenadores().get(m).setApellido(name);
                            }
                            
                            System.out.print("Desea modificar los años como profesional? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Cantidad de años: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getEntrenadores().get(m).setAños(name);
                            }
                            
                           
                            
                            System.out.print("Desea modificar la jugada favorita? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo jugada favorita: ");
                                for (int i = 0; i < jugadas.size(); i++) {
                                    System.out.println(i+" "+jugadas.get(i).getNombre());
                                }
                                int h=leer.nextInt();
                                Jugadas j=jugadas.get(h);
                                
                                equipos.get(n).getEntrenadores().get(m).setFavorita(j);
                            }
       
                            break;
                        }
                        case 4:
                        {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+" "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el equipo que desea modificar el medico: ");
                            int n=leer.nextInt();
                            for (int i = 0; i < equipos.get(n).getMedicos().size(); i++) {
                                System.out.println(i+" "+equipos.get(n).getMedicos().get(i).getNombre());
                            }
                            System.out.println("Elija el medico a modificar: ");
                            int m=leer.nextInt();
                            char select;
                            System.out.print("Desea modificar el nombre? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo nombre: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getMedicos().get(m).setNombre(name);
                            }
                            System.out.print("Desea modificar el Apellido? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo Apellido: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getMedicos().get(m).setApellido(name);
                            }
                            
                            System.out.print("Desea modificar los años como profesional? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Cantidad de años: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getMedicos().get(m).setAños(name);
                            }
                            
                            System.out.print("Desea modificar el salario? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo salario: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getMedicos().get(m).setSalario(name);
                            }
                            System.out.print("Desea modificar el Colegio? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo colegio: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getMedicos().get(m).setColegio(name);
                            }
                            break;
                        }
                        case 5:
                        {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i+" "+equipos.get(i).getNombre());
                            }
                            System.out.println("Elija el equipo que desea modificar el dueño: ");
                            int n=leer.nextInt();
                            char select;
                            System.out.print("Desea modificar el nombre? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo nombre: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getDueño().setNombre(name);
                            }
                            System.out.print("Desea modificar el Apellido? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Nuevo Apellido: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getDueño().setApellido(name);
                            }
                            
                            System.out.print("Desea modificar los años como profesional? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Cantidad de años: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getDueño().setAños(name);
                            }
                            System.out.print("Desea modificar el Net Worth? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Net Worth: ");
                                int name;
                                name=leer.nextInt();
                                equipos.get(n).getDueño().setWorth(name);
                            }
                            System.out.print("Desea modificar ciudad? (s/n): ");
                            select=leer.next().charAt(0);
                            if(select=='s')
                            {
                                System.out.print("Ciudad: ");
                                String name;
                                name=leer.next();
                                equipos.get(n).getDueño().setCiudad(name);
                            }
                            break;
                        }
                    }
                    
                    break;
                case 5://Simular entreno
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i+" "+equipos.get(i).getNombre());
                    }
                    System.out.println("Seleccione el equipo que va a entrenar: ");
                    int pos=leer.nextInt();
                    if(equipos.get(pos).getJugadores().size()<5)
                    {
                        System.out.println("No tiene los jugadores necesarios");
                        break;
                    }
                    else if(equipos.get(pos).getEntrenadores().size()<3)
                    {
                        System.out.println("No tiene los entrenadores necesarios");
                        break;
                    }
                    else if(equipos.get(pos).getMedicos().size()<3)
                    {
                        System.out.println("No tiene los Medicos necesarios");
                        break;
                    }
                    else
                    {
                        Entrenar(equipos.get(pos));
                    }
                    break;
                case 6://Simular jugar
                     for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i+" "+equipos.get(i).getNombre());
                    }
                    System.out.println("Seleccione el equipo que va a entrenar: ");
                    pos=leer.nextInt();
                    if(equipos.get(pos).getJugadores().size()<5)
                    {
                        System.out.println("No tiene los jugadores necesarios");
                        break;
                    }
                    else if(equipos.get(pos).getEntrenadores().size()<3)
                    {
                        System.out.println("No tiene los entrenadores necesarios");
                        break;
                    }
                    else if(equipos.get(pos).getMedicos().size()<3)
                    {
                        System.out.println("No tiene los Medicos necesarios");
                        break;
                    }
                    else
                    {
                        Jugar(equipos.get(pos));
                    }
                    break;
                case 7://salir
                    resp = 'n';
                    break;
                default:
                    resp = 'n';
            }//fin del switch menu
        }//fin del while
    }//fin del main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
