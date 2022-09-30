//Ejercicio 2.24
//Programa que cálcula el número mayor y menor de cinco núneros ingresados.
//Usando solo las técnicas vistas.

import java.util.Scanner;

public class CalculoMayorMenor {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5;

        // Título del programa
        System.out.print("\n\t\t\tPrograma que identifica el número mayor y menor. \n");

        // Lectura de datos
        System.out.println("\n\tIngrese el primer número:");
        numero1 = entrada.nextInt();

        System.out.println("\n\tIngrese el segundo número:");
        numero2 = entrada.nextInt();

        System.out.println("\n\tIngrese el tercer número:");
        numero3 = entrada.nextInt();

        System.out.println("\n\tIngrese el cuarto número:");
        numero4 = entrada.nextInt();

        System.out.println("\n\tIngrese el quinto número:");
        numero5 = entrada.nextInt();

        // Cálculo de el número mayor
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5)
            System.out.printf("\t\t\tEl número mayor es: %d%n%n ", numero1);

        if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5)
            System.out.printf("\t\t\tEl número mayor es: %d%n%n ", numero2);

        if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5)
            System.out.printf("\t\t\tEl número mayor es: %d%n%n ", numero3);

        if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5)
            System.out.printf("\t\t\tEl número mayor es: %d%n%n ", numero4);

        if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4)
            System.out.printf("\t\t\tEl número mayor es: %d%n%n ", numero5);

        // Cálculo de el número menor.
        if (numero1 < numero2 && numero1 < numero3 && numero1 < numero4 && numero1 < numero5)
            System.out.printf("\t\t\tEl número menor es: %d%n%n ", numero1);

        if (numero2 < numero1 && numero2 < numero3 && numero2 < numero4 && numero2 < numero5)
            System.out.printf("\t\t\tEl número menor es: %d%n%n ", numero2);

        if (numero3 < numero1 && numero3 < numero2 && numero3 < numero4 && numero3 < numero5)
            System.out.printf("\t\t\tEl número menor es: %d%n%n ", numero3);

        if (numero4 < numero1 && numero4 < numero2 && numero4 < numero3 && numero4 < numero5)
            System.out.printf("\t\t\tEl número menor es: %d%n%n ", numero4);

        if (numero5 < numero1 && numero5 < numero2 && numero5 < numero3 && numero5 < numero4)
            System.out.printf("\t\t\tEl número menor es: %d%n%n ", numero5);

        entrada.close();

    }
}