
/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1 	10 	$2.5 	$25
Nombre 2 	11 	$2 	$22
Nombre 3 	9 	$3 	$27
Nombre 4 	5 	$4 	$20
Nombre 5 	12 	$2 	$24
 */
import java.util.Scanner;

public class Problema03_SalarioEmpleados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int  cont = 1;
        double costoD, total, diasT;

        while (cont <= 5) {
            System.out.print("Ingrese su nombre: ");
            nombre = teclado.next();
            System.out.print("Ingrese los dias trabajados: ");
            diasT= teclado.nextInt();
            System.out.print("Ingrese el valor del dia: ");
            costoD= teclado.nextDouble();
            
            total= costoD * diasT;
            cont++;
         System.out.println("NOMBRE\tDias\tValorDia\t TOTAL");
          System.out.println(nombre+ "\t" + diasT + "\t" + costoD + "\t" + total);

        }

    }
}
