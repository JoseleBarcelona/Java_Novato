package calculos;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAleatorio, numIntroducido, intentos;
        intentos = 0;

        numAleatorio = (int) Math.round((Math.random() * 100) + 1);
        System.out.println("Adivina un número del 1 al 100, en solo 5 intentos:");

        do {
            System.out.println("Introduce un número:");
            numIntroducido = sc.nextInt();
            if (numIntroducido > numAleatorio){
                System.out.println("El número " + numIntroducido + " es mayor que el número que debes adivinar, inténtalo de nuevo:");
            }
            if (numIntroducido < numAleatorio){
                System.out.println("El número " + numIntroducido + " es menor que el número que debes adivinar, inténtalo de nuevo:");
            }
            intentos ++;

        }while (numIntroducido != numAleatorio && intentos<10);

        if (numIntroducido == numAleatorio){
            System.out.println("Has adivinado el número, era el " + numAleatorio);
        }
        else {
            System.out.println("Has superado el número de intentos");
        }

    }
}
