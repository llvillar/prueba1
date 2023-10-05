import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce número a: ");
        double a= entrada.nextDouble();

        System.out.println("Introduce número b: ");
        double b= entrada.nextDouble();

        System.out.println("Introduce número c: ");
        double c= entrada.nextDouble();

        entrada.close();

        double solucion_a = a*b + c*(3-a)/(2*b);
        double solucion_b = Math.pow((2 + a*b)/4,c+2);
        double solucion_c = -b+ (Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println("Solución a: " + solucion_a);
        System.out.println("Solución b: " + solucion_b);
        System.out.println("Solución c: " + solucion_c);

    }
}