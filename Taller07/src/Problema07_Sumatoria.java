
public class Problema07_Sumatoria {
    public static void main(String[] args) {

        int cont = 1; 
        double sumatoria = 0; 

        
        while (cont <= 10) {  
            if (cont % 2 == 0) { 
                sumatoria += 1.0 / cont; 
                System.out.print("+(1/" + cont + ") "); 
            } else { 
                sumatoria -= 1.0 / cont; 
                 System.out.print("-(1/" + cont + ") ");
            }
            cont++; 
        }

       
        System.out.printf("La sumatoria es de: " + sumatoria);
    }
}



