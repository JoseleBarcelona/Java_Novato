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
/*Output
Introduce el número que quieres que muestre la tabla de multiplicar:
8
TABLA DE MULTIPLICAR DEL 8
1 x 8 = 8
2 x 8 = 16
3 x 8 = 24
4 x 8 = 32
5 x 8 = 40
6 x 8 = 48
7 x 8 = 56
8 x 8 = 64
9 x 8 = 72
10 x 8 = 80
 */