package estudojava.introducao;

public class Aula07ArraysMultidimensionais2 {
    public static void main(String[] args) {
        //Inicializações de Arrays

        int[] array = {5, 3, 10};
        int[][] numeros = new int[3][];

        numeros[0] = new int[2];
        numeros[1] = array;
        numeros[2] = new int[]{1, 2, 3, 4, 5, 6};

        for (int[] arrayBase : numeros) {
            System.out.println("\n------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }

        }

    }
}
