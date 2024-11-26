
import java.util.Scanner;

public class Problema04_DatosJugadores {

    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, posicion;
        int cont= 0, edad;
        double  limite, estatura, promedioEdad = 0, promedioEstatura = 0, sumaEd = 0, sumaEs = 0;
        System.out.print("Defina el limite de jugadores a ingresar: ");
        limite = teclado.nextDouble();
        while (cont < limite) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = teclado.next();
            System.out.println("Ingrese la posicion del jugador:");
            posicion = teclado.next();
            System.out.println("Dame la edad del jugador:");
            edad = teclado.nextInt();
            System.out.println("Dame la estatura del jugador en cm: ");
            estatura = teclado.nextDouble();

            sumaEd += edad;
            sumaEs += estatura;
            promedioEdad = sumaEd / limite;
            promedioEstatura = sumaEs / limite;

            cont++;
            System.out.println("Listado de Jugadores");
            System.out.println(cont + "." + nombre + "-" + posicion + "- , edad " + edad + " estatura " + estatura + "\n");
        }

        System.out.println("Promedio Edades: " + promedioEdad);
        System.out.println("Promedio Estatura: " + promedioEstatura);

    }
}
