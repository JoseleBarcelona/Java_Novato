package condicionales;

import java.util.Scanner;

public class ClaseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la sigla de un punto cardinal (N,S,E,O :");
        String cardinal = sc.nextLine();
        sc.close();

        switch (cardinal.toUpperCase()) {
            case "N":
                System.out.println("Te diriges al Norte");
                break;
            case "S":
                System.out.println("Te diriges al Sur");
                break;
            case "E":
                System.out.println("Te diriges al Este");
                break;
            case "O":
                System.out.println("Te diriges al Oeste");
                break;
            default:
                System.out.println("La sigla escrita no está dentro de los parámetros.");
        }

    }
}
