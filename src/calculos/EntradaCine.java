package calculos;

import java.util.Scanner;

/*Preguntar al usuario.


1. ¿Cuántas entradas quieres?

2. ¿Qué día vas a ir al cine?

3. ¿Tienes tarjeta de miembro?

Precios:

    Entrada normal: 8 euros
    miércoles: 5 euros la entrada
    jueves: parejas 11 euros (grupos impares pagan precio normal, solo la persona "impar")

Descuentos:

    Miembros: 10% de descuento

 */
public class EntradaCine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas entradas quieres?");
        double numEntradas = sc.nextDouble();
        sc.nextLine();

        System.out.println("¿Qué día quieres ir?");
        String dia = sc.nextLine();

        System.out.println("¿Tienes la tarjeta de socio? (S/N)");
        String tarjeta = sc.nextLine();

        double precioTotal;

        switch (dia.toLowerCase()){

            case "miércoles":
                precioTotal = (numEntradas*5);
                break;
            case "jueves":
                if (numEntradas%2==0){
                    precioTotal = (numEntradas /2)*11;
                }else {
                    precioTotal = (numEntradas /2)*11;
                    precioTotal += 8;
                }
                break;
            default:
                precioTotal = numEntradas*8;

        }if (tarjeta.equalsIgnoreCase("S")) {
            precioTotal -= (precioTotal * 0.10);
        }

        System.out.println("numero de entradas " + numEntradas + " precio " + precioTotal);
    }
}
