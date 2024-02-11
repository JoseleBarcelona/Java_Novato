package calculos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número que quieres que muestre la tabla de multiplicar: ");
            int numero = sc.nextInt();

        System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + numero + " = " + i * numero);
            }

    }
}
