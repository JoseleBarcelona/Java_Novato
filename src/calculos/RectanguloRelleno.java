package calculos;

import java.util.Scanner;

public class RectanguloRelleno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura,base;
        System.out.println("Dibujemos un rectángulo relleno");
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        System.out.println("Introduce la base");
        base = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
/*
Dibujemos un rectángulo relleno
Introduce la altura
5
Introduce la base
5
*  *  *  *  *
*  *  *  *  *
*  *  *  *  *
*  *  *  *  *
*  *  *  *  *

 */