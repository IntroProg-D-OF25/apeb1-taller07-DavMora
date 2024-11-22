
/***
*Generar un programa Java que permita ingresar 4 estudiantes; 
* por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
* Presentar el siguiente reporte
* Estudiante 1 	10 	Aprobado
Estudiante 2 	6.9 	Reprobado
Estudiante 3 	7 	Aprobado
Estudiante 4 	5 	Reprobado
* Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.

 */
import java.util.Scanner;
public class Problema05_Promedios {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        String nombreEst, estado;
        double promedio, cont= 1;
        while (cont<=4){
            System.out.print("Dame Nombre y Promedio: ");
            nombreEst= teclado.next();
            promedio= teclado.nextDouble();
            if (promedio>= 7)
                estado = "APROBADO";
            else
                estado= "REPROBADO";
            System.out.println("NOMBRE\tPROMEDIO\tESTADO");
            System.out.println(nombreEst+ "\t" + promedio + "\t" + estado);
            cont++;
            
        
        
        }
        
    }
}
