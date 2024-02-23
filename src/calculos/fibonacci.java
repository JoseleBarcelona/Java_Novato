package calculos;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int num1 =0;
        int num2 =1;
        int aux;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números de la serie de Fibonacci que quieres que se muestre en pantalla: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            if (i == 0) System.out.print("0");
            else if (i == 1) System.out.print("1");
            else {
                System.out.print(num1 + num2);
                aux = num1 + num2;
                num1 = num2;
                num2 = aux;
            }
            System.out.print(", ");
        }

    }
}
