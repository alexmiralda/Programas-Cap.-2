//Ejercicio 2.28
//Programa que cálcula el diámetro, área y circunferencia, a partir del numero ingresado.

import java.util.Scanner;

public class Radio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int rad;

        // Título del programa
        System.out.print("\n\t\t\t Cálculando el diámetro, área y circunferencia.\n");

        // Lectura de datos
        System.out.print("\nIngrese el radio para empezar los cálculos: ");
        rad = entrada.nextInt();

        // Cálculo dentro de los printf
        System.out.printf("\n\t\tEl diámetro es de: %d%n%n ", (rad * 2));
        System.out.printf("\t\tLa circunferencia es de: %f%n%n ", (2 * Math.PI * rad));
        System.out.printf("\t\tEl área es de: %f%n%n ", (rad * rad * Math.PI));

        entrada.close();
    }

}