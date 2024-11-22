
import java.util.Scanner;

/***
 * 
 * @author UTPL
 */
public class Problema02_SerieNumero2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int cont1=0, cont2=8, limite;
        System.out.print("Dame el Limite: ");
        limite = teclado.nextInt();
        while (cont1<=limite){
            cont1= cont1 + 5;
            cont2= cont2 +2;
            System.out.println( + cont1 + "/" + cont2);
           
            
        }
            
                
    }
}
