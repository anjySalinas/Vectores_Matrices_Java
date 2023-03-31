import java.util.Scanner;

public class RETO_1 {

    /* Construya un programa que solicite la cantidad de notas a evaluar en una materia y el valor de cada una de dichas  notas. Calcule el promedio de dichas de notas para obtener la nota final y agregue las siguientes anotaciones según corresponda:
✓ Si la nota es menor que 3 Reprobaste
✓ Si la nota está entre 3 y 4.0 Pasaste Raspando
✓ Si la nota es mayor que 4.0 Aprobaste con buenos resultados */

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = lectura.nextInt();
        
        
        double[] notas = new double[cantidadNotas];
        
        
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = lectura.nextDouble();
        }
        
       
        double promedio = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            promedio += notas[i];
        }
        promedio /= cantidadNotas;
        
       
        if (promedio < 30) {
            System.out.println("Tu nota final es " + promedio + ". Reprobaste.");
        } else if (promedio >= 30 && promedio < 40) {
            System.out.println("Tu nota final es " + promedio + ". Pasaste Raspando.");
        } else {
            System.out.println("Tu nota final es " + promedio + ". Aprobaste con buenos resultados.");
        }
        
       
        lectura.close();
    }
}


