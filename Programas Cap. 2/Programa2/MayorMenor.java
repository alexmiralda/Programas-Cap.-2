//Ejercicio 2.17
//Programa que calcula la suma,el promedio, el producto, mayor y menor de los números ingresados.

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {

        //Título del programa
        System.out.print("\n\t\t\tPrograma de operaciones e identificador de mayor y menor.\n\n");

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3, suma, multi, prom;

        //Lectura de datos
        System.out.println("\tIngrese el primer número: ");
        numero1 = entrada.nextInt();

        System.out.println("\tIngrese el segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("\tIngrese el tercer número: ");
        numero3 = entrada.nextInt();

        //Cálculos
        suma = numero1 + numero2 + numero3;
        prom = suma / 3;
        multi = numero1 * numero2 * numero3;

        System.out.printf("%nLa suma de los números es de: %d%n", suma);
        System.out.printf("La multiplicación de los números es de: %d%n", multi);
        System.out.printf("EL promedio de los números es de: %d%n%n", prom);

        if (numero1 > numero2 && numero1 > numero3)
            System.out.printf("El número %d es el mayor.%n%n", numero1);
        if (numero2 > numero1 && numero2 > numero3)
            System.out.printf("El número %d es el mayor.%n%n", numero2);
        if (numero3 > numero1 && numero3 > numero2)
            System.out.printf("El número %d es el mayor.%n%n", numero3);

        if (numero1 < numero2 && numero1 < numero3)
            System.out.printf("El número %d es el menor.%n%n", numero1);
        if (numero2 < numero1 && numero2 < numero3)
            System.out.printf("El número %d es el menor.%n%n", numero2);
        if (numero3 < numero1 && numero3 < numero2)
            System.out.printf("El número %d es el menor.%n%n", numero3);

        System.out.println("\t\t\tProceso terminado...\n");

        entrada.close();
    }

}
