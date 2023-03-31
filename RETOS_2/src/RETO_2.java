import java.util.Scanner;

public class RETO_2 {
    //En una competencia de natación se desea implementar una aplicación para almacenar el tiempo por cada competidor. El usuario debe especificar cuantos competidores participarán en la competencia y digitar los nombres y tiempos de cada uno. Muestre en pantalla cada nadador con su respectivo tiempo. Plantee de quéforma podría determinar quien es el ganador.

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
    
            System.out.print("INGRESE EL NUMERO DE COMPETIDORES: ");
            int numCompetidores = lectura.nextInt();
    
            String[] nombres = new String[numCompetidores];
            double[] tiempos = new double[numCompetidores];
    
            for (int i = 0; i < numCompetidores; i++) {
                System.out.printf("COMPETIDOR #%d%n", i+1);
                System.out.print("INGRESE EL NOMBRE DEL COMPETIDOR: ");
                nombres[i] = lectura.next();
                System.out.print("INGRESE EL TIEMPO EN SEGUNDOS: ");
                tiempos[i] = lectura.nextDouble();
            }
    
            System.out.println("\nRESULTADOS DE LA COMPETENCIA:");
            for (int i = 0; i < numCompetidores; i++) {
                System.out.printf("%s: %.2f segundos%n", nombres[i], tiempos[i]);
            }
 
            int indiceGanador = 0;
            for (int i = 1; i < numCompetidores; i++) {
                if (tiempos[i] < tiempos[indiceGanador]) {
                    indiceGanador = i;
                }

            }
            System.out.printf("%nEl ganador es: %s, con un tiempo de %.2f segundos.%n", nombres[indiceGanador], tiempos[indiceGanador]);
            lectura.close();
        }
    }


