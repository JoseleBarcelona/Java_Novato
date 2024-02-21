package calculos;

import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Elige las siguientes opciones: \nPiedra, Papel, Tijeras:");
        String eleccion = sc.nextLine();
        sc.close();

        int IA = (int) (Math.random()*3+1);
        String eleccionIA = "";
        
        switch (IA) {
            
            case 1:
                eleccionIA = "Piedra";
                break;
            case 2:
                eleccionIA = "Papel";
                break;
            case 3:
                eleccionIA = "Tijeras";
                break;
        }
        if (eleccion.equalsIgnoreCase("Piedra") && eleccionIA.equals("Tijeras")) {
            System.out.println("Tu piedra gana a las tijeras de la IA");
        } else if (eleccion.equalsIgnoreCase("Papel") && eleccionIA.equals("Piedra")) {
            System.out.println("Tu papel gana a la piedra de la IA");
        } else if (eleccion.equalsIgnoreCase("Tijeras") && eleccionIA.equals("Papel")) {
            System.out.println("Tu tijeras ganan a el papel de la IA");
        } else if (eleccion.equalsIgnoreCase(eleccionIA)) {
            System.out.println("Habéis empatado al haber elegido los dos " + eleccion);
        } else {
            System.out.println("Has perdido contra la inteligencia artificial");
        }
        System.out.println("Has elegido " + eleccion + " y la IA ha elegido " + eleccionIA.toLowerCase());

    }
}
/*
Elige las siguientes opciones:
Piedra, Papel, Tijeras:
piedra
Has perdido contra la inteligencia artificial
Has elegido piedra y la IA ha elegido Papel
 */