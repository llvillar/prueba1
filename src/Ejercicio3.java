import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce el número de pizzas: ");
        int pizzas = entrada.nextInt();

        System.out.println("Introduce el número de porciones por pizza: ");
        int porciones = entrada.nextInt();

        System.out.println("Introduce el número de amigos: ");
        int amigos = entrada.nextInt();

        entrada.close();

        int porcionesPorPersona = (pizzas * porciones) / amigos;
        int porcionesSobrantes = (pizzas * porciones) % amigos;

        System.out.printf("Tocan a %d por persona y sobran %d porciones.", porcionesPorPersona, porcionesSobrantes);
    }
}