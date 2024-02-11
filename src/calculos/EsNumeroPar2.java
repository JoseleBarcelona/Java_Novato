package calculos;

import java.util.Scanner;

public class EsNumeroPar2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Tecla un número entero");
        num1 = sc.nextInt();

        System.out.println("Teclea un segundo número entero que sea diferente al primero");
        num2 = sc.nextInt();

        while (num1 == num2) {
            System.out.println("El número introducido es igual, introduce uno diferente");
            num2 = sc.nextInt();
        }
        sc.close();

        if (num2>num1) num1 = num2;

        if (num1%2 == 0) System.out.println("El número mayor elegido es " + num1 + "  y es par");
        else System.out.println("El número mayor elegido es " + num1 + "  y es impar");

        if (num1%5 == 0) System.out.println("El número mayor elegido es "+ num1 + " y es divisible entre 5");
        else System.out.println("El número mayor elegido es "+ num1 + " y no es divisible entre 5");

    }
}
/*Output
Tecla un número entero
5
Teclea un segundo número entero que sea diferente al primero
5
El número introducido es igual, introduce uno diferente
5
El número introducido es igual, introduce uno diferente
160
El número mayor elegido es 160  y es par
El número mayor elegido es 160 y es divisible entre 5
 */