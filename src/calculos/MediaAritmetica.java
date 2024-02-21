package calculos;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double contador = 0;
        double sumaTotal = 0;
        double numero;

        do {
            System.out.println("Introduce un número positivo, si quieres salir introduce un número negativo:");
            numero = sc.nextDouble();
            
            if (numero>0){
                contador++;
                sumaTotal += numero;
            }

        }while (numero>0);

        sc.close();

        System.out.println("Has introducido " + contador + " números, la media aritmética de ellos es de " + (sumaTotal/contador));

    }
}
/*
Introduce un número positivo, si quieres salir introduce un número negativo:
9
Introduce un número positivo, si quieres salir introduce un número negativo:
7
Introduce un número positivo, si quieres salir introduce un número negativo:
3
Introduce un número positivo, si quieres salir introduce un número negativo:
-4
Has introducido 3.0 números, la media aritmética de ellos es de 6.333333333333333
 */