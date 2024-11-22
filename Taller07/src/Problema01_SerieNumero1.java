
import java.util.Scanner;

/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10
 * 2/11
 * 3/12
 * 4/13
 * 5/14
 * 6/15
 */
public class Problema01_SerieNumero1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int limite, cont =1;
        System.out.print("Dame el Limite: ");
        limite= teclado.nextInt();
        while (cont<= limite){
            System.out.print(cont + "/" +(cont+9) + ", ");
            cont++;
        }
            
    }
    
}
