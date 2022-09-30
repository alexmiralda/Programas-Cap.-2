//Ejercicio 2.32
//Porgrama que determina la cantidad de números positivos, negativos y ceros, de cinco números ingresados.

import java.util.Scanner;

public class NegativosPositivosCero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int p = 0, n = 0, c = 0, n1, n2, n3, n4, n5;

        // Título del programa
        System.out.println("\n\t\t\tPrograma que determina números positivos, negativos y ceros");

        // Lectura de datos
        System.out.print("\n\t\tIngrese el primer número: ");
        n1 = entrada.nextInt();
        System.out.print("\n\t\tIngrese el segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("\n\t\tIngrese el tercer número: ");
        n3 = entrada.nextInt();
        System.out.print("\n\t\tIngrese el cuarto número: ");
        n4 = entrada.nextInt();
        System.out.print("\n\t\tIngrese el quinto número: ");
        n5 = entrada.nextInt();

        // Cálculo para determinar la cantidad de números postivos
        if (n1 > 0)
            p = p + 1;
        if (n2 > 0)
            p = p + 1;
        if (n3 > 0)
            p = p + 1;
        if (n4 > 0)
            p = p + 1;
        if (n5 > 0)
            p = p + 1;

        System.out.printf("\n\n\t\tLa cantidad de números positivos es de: %d%n%n ", p);

        // Cálculo para determinar la cantidad de números negativos
        if (n1 < 0)
            n = n + 1;
        if (n2 < 0)
            n = n + 1;
        if (n3 < 0)
            n = n + 1;
        if (n4 < 0)
            n = n + 1;
        if (n5 < 0)
            n = n + 1;

        System.out.printf("\t\tLa cantidad de números negativos es de: %d%n%n ", n);

        // Cálculo para determinar la cantidad de números igual a cero
        if (n1 == 0)
            c = c + 1;
        if (n2 == 0)
            c = c + 1;
        if (n3 == 0)
            c = c + 1;
        if (n4 == 0)
            c = c + 1;
        if (n5 == 0)
            c = c + 1;

        System.out.printf("\t\tLa cantidad de números igual a cero es de: %d%n%n ", c);

        System.out.print("\t\t\tFin del proceso...\n\n");

        entrada.close();

    }

}
