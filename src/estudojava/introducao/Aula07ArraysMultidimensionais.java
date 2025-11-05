package estudojava.introducao;

public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {

        /*
        Os Multidimesionais são uma forma de colocar arrays dentro de arrays.

        Exemplo de Array Multidimensional (dias da semana de um mês):

        No exemplo, o indice [4] cria 1 Array com 4 posições( [0], [1], [2], [3]) representando as semanas do mês,
        cada um desses espaços, contém 1 array de 7 posições do tipo String( [0], [1], [2], [3], [4], [5], [6])
        representando os dias da semana.

         */
        String[][] dias = new String[4][7];

        dias[0][0] = "Domingo";
        dias[0][1] = "Segunda";
        dias[0][2] = "Terça";
        dias[0][3] = "Quarta";
        dias[0][4] = "Quinta";
        dias[0][5] = "Sexta";
        dias[0][6] = "Sábado";

        dias[1][0] = "Domingo";
        dias[1][1] = "Segunda";
        dias[1][2] = "Terça";
        dias[1][3] = "Quarta";
        dias[1][4] = "Quinta";
        dias[1][5] = "Sexta";
        dias[1][6] = "Sábado";

        dias[2][0] = "Domingo";
        dias[2][1] = "Segunda";
        dias[2][2] = "Terça";
        dias[2][3] = "Quarta";
        dias[2][4] = "Quinta";
        dias[2][5] = "Sexta";
        dias[2][6] = "Sábado";

        dias[3][0] = "Domingo";
        dias[3][1] = "Segunda";
        dias[3][2] = "Terça";
        dias[3][3] = "Quarta";
        dias[3][4] = "Quinta";
        dias[3][5] = "Sexta";
        dias[3][6] = "Sábado";

        for (int i = 0; i < dias.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }
        }

    }
}
