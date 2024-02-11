package condicionales;

import java.util.Scanner;

public class ClaseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un número entero del 1 al 100:");

        int numero = sc.nextInt();

        if(numero >=50 && numero <=100 || numero == 25) {
            System.out.println("El número elegido es " + numero + " y está dentro del rango");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número está fuera de rango");
        }
        sc.close();
        
        System.out.println("\nEsta instrucción también entra");
    }
}
