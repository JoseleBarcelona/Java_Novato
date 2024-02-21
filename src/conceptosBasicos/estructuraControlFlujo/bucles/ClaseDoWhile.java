package conceptosBasicos.estructuraControlFlujo.bucles;

import java.util.Scanner;

public class ClaseDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un número del 1 al 10");
        int num;

        do {
            num = sc.nextInt();
            sc.close();
            
            if (num == 1) {

            }else {
                System.out.println("¡Espabila!");
            }

        }while (num != 1);

        System.out.println("Acertaste el número");
    }
}
