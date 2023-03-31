import java.util.Scanner;

public class RETO_4 {
    
    /* Haciendo uso de matrices desarrolle un programa que permita simular las siguientes acciones de una maquina expendedora de dulces con capacidad para 16 productos:
❑ Permita llenar la máquina con 16 nombres de productos y su respectivo precio.
❑ Muestre el catálogo de productos con el código del producto (posición), nombre y precio de cada producto ingresado. */
 

public static void main(String []args) {

    String [][] productos = new String [4][4];
    Scanner lectura = new Scanner (System.in);

    for (int i=0;i<4;i++) {
        for (int j=0;j<4;j++) {
         System.out.println("INGRESE EL PRODUCTO CON SU PRECIO EN LA POSICION: ["+ i+"]["+j+"]");
         productos[i][j]= lectura.nextLine(); 
                    
         }
     }

     for (int i=0;i<4;i++) {
         for (int j=0;j<4;j++) {
             System.out.print("[" + productos [i][j] + "]"); 
             
          }
          System.out.println();
          lectura.close();
}
}

}



