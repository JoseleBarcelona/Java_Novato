package calculos;

import java.util.Scanner;

public class RectanguloHueco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura, base;
        System.out.println("Dibujemos un rectángulo hueco");
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("Introduce la altura");
        altura = sc.nextInt();

        for (int i = 0; i <altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1) System.out.print("*");
                else {
                    if (j==0 || j==base-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }System.out.println();
        }

    }
}
/*
Dibujemos un rectángulo hueco
Introduce la base
10
Introduce la altura
5
**********
*        *
*        *
*        *
**********
 */