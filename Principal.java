
import java.util.Scanner;

/**
 * 
 */
public class Principal {

    /**
     * Default constructor
     */
    public Principal() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Torneo palatino = new Torneo();
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int goles;
        int lugar;
        int tirosEsquina;
        int ganados;
        int perdidos;
        int tirosAgol;
        int amarillas;
        int rojas;
        int faltas;

        for (int i = 0; i<5; i++){
            System.out.println("+==========================+");
            System.out.println("|Información del Equipo "+(i+1)+": |");
            System.out.println("+==========================+");
            System.out.println("Ingrese el nombre del equipo ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese los goles del equipo ");
            goles = teclado.nextInt();
            System.out.println("Ingrese el lugar que ocupó el equipo ");
            lugar = teclado.nextInt();
            System.out.println("Ingrese los tiros de esquina del equipo ");
            tirosEsquina = teclado.nextInt();
            System.out.println("Ingrese los juegos ganados del equipo ");
            ganados = teclado.nextInt();
            System.out.println("Ingrese los juegos perdidos del equipo ");
            perdidos = teclado.nextInt();
            System.out.println("Ingrese los tiros a gol del equipo ");
            tirosAgol = teclado.nextInt();
            System.out.println("Ingrese las tarjetas amarillas del equipo ");
            amarillas = teclado.nextInt();
            System.out.println("Ingrese las tarjetas rojas del equipo ");
            rojas = teclado.nextInt();
            System.out.println("Ingrese las faltas del equipo ");
            faltas = teclado.nextInt();
            teclado.nextLine();
            palatino.llenarEquipo(i+1, nombre, goles, lugar, tirosEsquina, ganados, perdidos, tirosAgol, amarillas, rojas, faltas);
        }
        System.out.println("Información de equipos: ");
        System.out.println(palatino.getEquipo1());
        System.out.println(palatino.getEquipo2());
        System.out.println(palatino.getEquipo3());
        System.out.println(palatino.getEquipo4());
        System.out.println(palatino.getEquipo5());
        
    }

}