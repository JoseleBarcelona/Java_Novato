package conceptosBasicos.matrices;

public class Arrays {
    public static void main(String[] args) {

//      Primera manera de declarar un array

        int[] arrayInt;
        arrayInt = new int[5];
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        System.out.println(arrayInt[3]);

//      Segunda manera de declarar un array

        int[] arrayInt2 = {10, 20, 30, 40};

        System.out.println(arrayInt2[0]);

//      Manera de declarar un array de doble dimensión

        int[][] arrayDobleDimension = new int[2][3];

        arrayDobleDimension[0][0] = 100;
        arrayDobleDimension[0][1] = 200;
        arrayDobleDimension[0][2] = 300;

        arrayDobleDimension[1][0] = 400;
        arrayDobleDimension[1][1] = 500;
        arrayDobleDimension[1][2] = 600;

        System.out.println(arrayDobleDimension[0][2]);
    }
}
/*Output
40
10
300*/
