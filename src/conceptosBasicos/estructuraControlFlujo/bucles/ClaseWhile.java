package conceptosBasicos.estructuraControlFlujo.bucles;

import java.util.Scanner;

public class ClaseWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu contraseña de cuatro dígitos: ");
        String password = sc.nextLine();

        while (!password.equals("1234")) {
            System.out.println("Contraseña incorrecta, ingresa tu contraseña de nuevo: ");
            password = sc.nextLine();

        }
        System.out.println("Contraseña correcta, bienvenido de nuevo.");
    }
}
