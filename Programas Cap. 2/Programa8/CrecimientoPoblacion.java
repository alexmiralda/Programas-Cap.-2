//Ejercicio 2.34
//Programa que cálcula la población mundial estimada después de uno, dos, tres, cuatro y cinco años.

import java.util.Scanner;

public class CrecimientoPoblacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double pob, tasa, inc1, año1, año2, inc2, año3, inc3, año4, inc4, año5, inc5;

        //Título de programa
        System.out.println("\n\t\t\tPrograma que estima la población mundial a cinco años");
        System.out.println("\n\t\t\tIngrese los siguientes datos...");
        System.out.println("\n\t\t\tPOBLACION ACTUAL: 7,975,000,000   TASA DE CRECIMIENTO: 0.09");

        // Lectura de los datos de la población y la tasa de crecimiento
        System.out.print("\n\t\tLa población mundial actual es de: ");
        pob = entrada.nextDouble();
        System.out.print("\n\t\tLa tasa de crecimiento es de: ");
        tasa = entrada.nextDouble();

        // Cálculo de primer año
        inc1 = (pob * tasa) / 100;
        año1 = pob + inc1;
        System.out.printf("\n\t\tLa población mundial despues de un año sería de: %f%n", año1);

        // Cálculo de segundo año
        inc2 = (año1 * tasa) / 100;
        año2 = año1 + inc2;
        System.out.printf("\n\t\tLa población mundial despues de dos años sería de: %f%n", año2);

        // Cálculo de tercer año
        inc3 = (año2 * tasa) / 100;
        año3 = año2 + inc3;
        System.out.printf("\n\t\tLa población mundial despues de tres años sería de: %f%n", año3);

        // Cálculo de cuarto año
        inc4 = (año3 * tasa) / 100;
        año4 = año3 + inc4;
        System.out.printf("\n\t\tLa población mundial despues de cuatro años sería de: %f%n", año4);

        // Cálculo de quinto año
        inc5 = (año4 * tasa) / 100;
        año5 = año4 + inc5;
        System.out.printf("\n\t\tLa población mundial despues de cinco años sería de: %f%n%n", año5);

        System.out.print("\n\t\t\tFin del proceso...\n\n");

        entrada.close();
    }
}