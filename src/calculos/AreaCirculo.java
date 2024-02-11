package calculos;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
            Scanner miScanner = new Scanner(System.in);
            System.out.println("Introduzca el radio del círculo:");
            double radio = miScanner.nextDouble();
            double areaCirculo = Math.PI * (Math.pow(radio, 2));
            System.out.println("El área del círculo con radio " + radio + " es de: " + areaCirculo);

    }
}
