
import java.util.Scanner;

public class Problema06_VentaComputadoras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1, tipoCliente;
        double descuento, costoCompu = 0, costoTotal = 0;
        String nombre;

      
        while (cont <= 7) {
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.next();
            System.out.println("Ingrese el costo de la computadora: ");
            costoCompu = teclado.nextDouble();
            System.out.println("Ingrese el tipo de cliente (1) (2) (3): ");
            tipoCliente = teclado.nextInt();
            cont++;

            switch (tipoCliente) {
                case 1:
                    descuento = costoCompu * 0.10;
                    costoTotal = costoCompu - descuento;
                    System.out.println("Cliente tipo " + tipoCliente + "compra computadora con precio: " + costoTotal);
                    break;
                case 2:
                    descuento = costoCompu * 0.20;
                    costoTotal = costoCompu - descuento;
                    System.out.println("Cliente tipo " + tipoCliente + "compra computadora con precio: " + costoTotal);
                    break;
                case 3:
                    costoTotal = costoCompu;
                    System.out.println("Cliente tipo " + tipoCliente + "compra computadora con precio: " + costoTotal);
                    break;
                default:
                    costoTotal = costoCompu;
                    System.out.println("Cliente tipo " + tipoCliente + " compra computadora con precio: " + costoTotal);
            }
        }

    }

}
