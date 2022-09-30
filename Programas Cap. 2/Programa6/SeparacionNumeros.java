//Ejericio 2.30
//Programa que separa cada digito, cada tres espacios de un número de cinco cifras.
// Ejemplo: 45678 ====> 4   5   6   7   8

import java.util.Scanner;

public class SeparacionNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1;

        // Título del programa
        System.out.print("\n\t\t\tPrograma que separa los digitos de un número\n");

        // Lectura de datos
        System.out.print("\n\t\tIngrese un número de cinco cifras: ");
        numero1 = entrada.nextInt();

        // Cálculo para separar el número
        System.out.printf("%n\t\t   %d", (numero1 / 10000) % 10);
        System.out.printf("   %d", (numero1 / 1000) % 10);
        System.out.printf("   %d", (numero1 / 100) % 10);
        System.out.printf("   %d", (numero1 / 10) % 10);
        System.out.printf("   %d%n%n", (numero1 % 10));

        System.out.print("\t\t[Fin del programa...]\n\n");
        entrada.close();

    }

}