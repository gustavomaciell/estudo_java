package estudojava.introducao;

public class Aula06Arrays01 {
    public static void main(String[] args) {

        /*

        Arrays são considerados objetos na memória e são variáveis do tipo refference.
        São usados para alocar mais de um item no mesmo espaço da memória.

       Padrão de inicialização:

       int, double, short, long, byte, float: 0
       char: '\u0000'
       boolean: false
       String: null
         */

        int[] idades = new int[3];
        idades[0] = 23;
        idades[1] = 24;
        idades[2] = 30;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        System.out.println("--------------------------");

        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Itachi";
        nomes[2] = "Kakashi";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);

        }
        System.out.println("----------------------");

        int[] numeros = new int[]{1, 2, 3, 4, 5};
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[6];

        //  for (int i = 0; i < numeros2.length; i++){
        //     System.out.println(numeros2[i]);
        //}
        for (int num : numeros) { //FOREACH
            System.out.println(num);

            //Foreach é apenas uma forma abreviada de usar o for.
        }
    }
}
