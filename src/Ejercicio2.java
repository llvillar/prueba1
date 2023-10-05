import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el valor en grados centígrados: ");
        double celsius = entrada.nextDouble();
        System.out.println("Pasar a Fahrenheit pulsa(F) o Kelvin pulsa(K)");
        char transformacion  = entrada.next().charAt(0);
        entrada.close();

        String resultado = (transformacion=='F') ?
                             celsius + " grados celsius son " + (9*celsius/5 + 32) + " grados Fahrenheit" :
                                celsius + " grados celsius son " + (celsius + 273.15) + " grados Kelvin";
        System.out.println(resultado);
    }
}