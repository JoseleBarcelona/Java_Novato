package calculos;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double contador = 0;
        double segundoNumero;
        double primerNumero;
        double sumaParcial = 0;
        double sumaTotal;

        System.out.println("Introduce un número positivo:");
        primerNumero = sc.nextDouble();

        while (primerNumero < 0) {
            System.out.println("has introducido un número negativo, introduce por favor un número positivo:");
            primerNumero = sc.nextDouble();
        }

        do {
            System.out.println("Introduce otro número positivo. Si quieres terminar, introduce un número negativo o igual a cero:");
            segundoNumero = sc.nextDouble();

            if (segundoNumero > 0) {
                contador++;
                sumaParcial += segundoNumero;
            }

        } while (segundoNumero > 0);

        sc.close();

        sumaTotal = primerNumero + sumaParcial;

        System.out.println("Has introducido " + (contador + 1) + " números, la media aritmética de ellos es de " + (sumaTotal / (contador + 1)));
    }
}


/*Introduce un número positivo:
-9
has introducido un número negativo, introduce por favor un número positivo:
-8
has introducido un número negativo, introduce por favor un número positivo:
-2
has introducido un número negativo, introduce por favor un número positivo:
7
Introduce otro número positivo. Si quieres terminar, introduce un número negativo o igual a cero:
8
Introduce otro número positivo. Si quieres terminar, introduce un número negativo o igual a cero:
9
Introduce otro número positivo. Si quieres terminar, introduce un número negativo o igual a cero:
-5
Has introducido 3.0 números, la media aritmética de ellos es de 8.0
 */