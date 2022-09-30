//Ejercicio 2.35
//Programa que muestra el ahorro entre usar viajes compartidos en coches y usar el propio al día.

import java.util.Scanner;

public class AhorroAuto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables para la entrada de datos
        int kms, litro, promg, estac, peaje;

        // Variables para los cálculos
        int lit_gastados, costo_gasolina, gasto_coche, cuota_estac, gasto_viajes, ahorro;

        // Título del programa
        System.out.print("\n\t\t/////////////////////////////////////////////////////////////////////");
        System.out.println("\n\t\t\tPrograma de ahorro al usar viajes compartidos en coche");
        System.out.print("\t\t////////////////////////////////////////////////////////////////////\n\n");

        System.out.println("\t\tIngrese los siguientes datos para realizar el cálculo de su ahorro.\n");

        // Entrada de datos del usuario.
        System.out.print("\t\tTotal de kilómetros conducidos al día: \n");
        kms = entrada.nextInt();

        System.out.print("\t\tCosto por litro de gasolina: \n");
        litro = entrada.nextInt();

        System.out.print("\t\tPromedio de Kilometros por litro: \n");
        promg = entrada.nextInt();

        System.out.print("\t\tCuotas de estacionamiento por día: \n");
        estac = entrada.nextInt();

        System.out.print("\t\tPeaje por día: \n");
        peaje = entrada.nextInt();

        // Cálculos
        lit_gastados = kms / promg;
        costo_gasolina = lit_gastados * litro;
        cuota_estac = estac * 35;
        gasto_coche = costo_gasolina + cuota_estac + peaje;
        gasto_viajes = kms * 2;
        ahorro = gasto_coche - gasto_viajes;

        // Resumen de los gastos
        System.out.print("\t\tAl usar el coche propio se obtienen los siguientes gastos:\n\n");
        System.out.printf("\t\tLos litros de gasolina gastados al dia son %d.%n ", lit_gastados);
        System.out.printf("\t\tLo que produce un gasto solo en gasolina de %d lempiras. %n ", costo_gasolina);
        System.out.printf(
                "\t\tLa cuota de estacionamiento tiene un valor de 35 lempiras lo que deja un gasto de %d.%n ",
                cuota_estac);
        System.out.printf("\t\tEl peaje es un gasto de %d lempiras. %n", peaje);
        System.out.printf("\t\tLo que al sumar todo los gastos nos deja un saldo de %d lempiras al día.%n%n ",
                gasto_coche);

        System.out.print("\t\tTeniendo en cuenta que el viaje compartido tiene un precio de 2 lempiras por km.\n");
        System.out.printf("\t\tEl gasto al usar este servicio al día es de %d lempiras.%n%n", gasto_viajes);
        System.out.printf("\t\tSi lo comparamos con el gasto al usar coche propio%n");
        System.out.printf("\t\tal usar el servicio de viaje compartido se ahorra %d lempiras al día.%n%n", ahorro);

        System.out.print("\t\t\tFin del proceso\n\n");
        entrada.close();

    }
}