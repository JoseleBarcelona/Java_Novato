package calculos;

//Muestra la primera y última cifra de un número máximo de 5 cifras

import java.util.Scanner;

public class FirstLastFigure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo máximo de 5 cifras");
        int number = sc.nextInt();
        int aux = number;
        sc.close();

        if (number<0 || number>99999){
            System.out.println("El número introducido está fuera de rango");
            System.exit(0);
        }
        //Regla matemática: Cualquier número dividido entre 10, da de resto la última cifra del número
        System.out.println("La última cifra del número " + number + " es: " + number%10);

        if (number<10){
            System.out.println("La primera cifra es igual a la última");

        } else if (number<100) {
            aux/=10; //aux = aux/10;
            System.out.println("La primera cifra del número " + number + " es: " + aux%10);
            /*Al dividir un número de dos cifras entre 10, nos da como resultado el número con un decimal,
            por ejemplo 98/10 = 9,8 al declarar un int, ignora la parte decimal, por lo que nos queda como
            resultado la primera cifra, por lo que el resto aux%10, sería 9*/

        } else if (number<1000) {
            aux/=100;
            System.out.println("La primera cifra del número " + number + " es: " + aux%10);

        } else if (number<10000) {
            aux/=1000;
            System.out.println("La primera cifra del número " + number + " es: " + aux%10);

        }else {
            aux/=10000;
            System.out.println("La primera cifra del número " + number + " es: " + aux%10);
        }
    }
}
