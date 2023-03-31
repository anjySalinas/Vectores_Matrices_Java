import java.util.Scanner;

public class RETO_3 {

    /*Diseñar un programa en el que el usuario digite cuaquier cantidad de numero y el programa determine cuantos 2 hay en los numero digitados */
        
    public static void main(String[] args) {
        int can;
        int [] num;
        int dos=0;
        
    
        Scanner captura=new Scanner(System.in);
        System.out.println("INGRESA LA CANTIDAD DE NUMEROS=");
            can = captura.nextInt(); 
            num = new int [can];
    
       
        for(int n=0;n<num.length;n++) {
            System.out.println("DIGITE LOS NUMEROS ELEGIDOS:");
            num[n]=captura.nextInt();
           
        }
            for(int n=0;n<num.length;n++) {
                System.out.println("LOS NUMERO SON: "+ num[n]);
                if (num[n]== 2) {
                    System.out.println("DIGITO UN 2 ");
                    dos++;
                    } 
     }  
     System.out.println("TOTAL DE 2 INGRESADOS"+dos);
     captura.close();
    }
    }