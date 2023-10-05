import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce tres números enteros: ");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int z = entrada.nextInt();

        entrada.close();

        int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);

        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
        System.out.println("El valor medio es: " + (x + y + z)/3);
    }
}
