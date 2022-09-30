//Ejercicio 2.26
//Programa que verifica si el primer número ingresado es múltiplo de el segundo.

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, mult;

        // Título del programa
        System.out.print("\n\t\t\tPrograma para verificar múltiplo, entre los números.\n");

        // Lectura de datos
        System.out.print("\nIngrese el primer número: ");
        numero1 = entrada.nextInt();
        System.out.print("\nIngrese el segundo número: ");
        numero2 = entrada.nextInt();

        // Verificación de el múltiplo.
        mult = numero1 % numero2;

        if (mult == 0)
            System.out.printf("\n\t\tEl primer número %d es múltiplo de el segundo %d.%n%n", numero1, numero2);

        if (mult != 0)
            System.out.printf("\n\t\tEl primer número %d no es múltiplo.%n%n", numero1);

        entrada.close();
    }

}