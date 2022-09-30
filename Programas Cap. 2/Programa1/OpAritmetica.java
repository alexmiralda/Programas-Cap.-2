//Ejercicio 2.15 
//Programa de operaciones aritméticas:suma, resta, mutiplicación y división.

import java.util.Scanner;

public class OpAritmetica {
    public static void main(String[] args) {

        //Título de programa
        System.out.print("\n\t\t\t Programa de operaciones aritméticas\n");
        System.out.print("\n\t\t\t[ Suma-Resta-Multiplicación-División ]\n\n");

        Scanner ingreso = new Scanner(System.in);
        int numero1, numero2, suma, resta, multi, division;
        
        //Lectura de datos
        System.out.print("\t Ingrese el primer número: \n");
        numero1 = ingreso.nextInt();
        System.out.print("\t Ingrese el segundo número: \n\n");
        numero2 = ingreso.nextInt();
        
        //Cálculos
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        division = numero1 / numero2;

        //Impresión de resultados
        System.out.printf("\tEl resultado de la suma de los números es de: %d%n", suma);
        System.out.printf("\tEl resultado de la resta de los números es de: %d%n", resta);
        System.out.printf("\tEl resultado de la multiplicacion de los números es de: %d%n", multi);
        System.out.printf("\tEl resultado de la division de los números es de: %d%n", division);

        System.out.print("\n\t\t\t Proceso terminado...\n");

        ingreso.close();

    } 

}

