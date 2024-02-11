package calculos;

import java.util.Scanner;

public class NotaMediaAlumno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        double nota1 = sc.nextDouble();

        System.out.println("Introduce la segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("Introduce la tercera nota");
        double nota3 = sc.nextDouble();

        sc.close();

        double notaMedia = (nota1 + nota2 + nota3)/3;

        if (notaMedia<5){
            System.out.printf("Has suspendido, tu nota media ha sido: %.2f",notaMedia); //Formato printf();
        } else if (notaMedia<6) {
            System.out.printf("Has aprobado, tu nota media ha sido: %.3f",notaMedia); //%.3f da una salida con 3 decimales
        } else if (notaMedia<7) {
            System.out.printf("Tienes un bien, tu nota media ha sido: %.2f\n",notaMedia); //%.2f\n salida 2 decimales con salto de línea
        } else if (notaMedia<9) {
            System.out.println("Tienes un notable, tu nota media ha sido: " + notaMedia); //Formato println(); salida con todos los decimales
        } else if (notaMedia<=10) {
            System.out.println("Tienes un sobresaliente, tu nota media ha sido: " + notaMedia);
        }else {
            System.out.println("Las notas introducidas están fuera del rango establecido, es imposible una nota media de: " + notaMedia);
        }
    }
}
/*Output
Introduce la primera nota
6,77
Introduce la segunda nota
6,56
Introduce la tercera nota
6,86
Tienes un bien, tu nota media ha sido: 6,73
 */