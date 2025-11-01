package estudojava.introducao;

public class Aula04EstruturasDeRepeticao {
    public static void main(String[] args) {

        // WHILE -- DO WHILE -- FOR

        int contagem = 0;

        while (contagem <= 10) {
            System.out.println(contagem++);
        }
        /*
        Assim como o if o While so é executado caso o valor booleano da condição for TRUE.

        a diferença do WHILE pro DO WHILE é que no DO WHILE o código sera executado ao menos uma vez mesmo que
        o valor não seja true.
         */
        System.out.println("-------------------------------");

        int contagem2 = 12;

        do {
            System.out.println("Dentro do Do While " + contagem2++);
        } while (contagem2 < 10);

        System.out.println("--------------------------------");

        /*
         A sintaxe do for é dividida em 3 partes que são separadas po ";".
         A primeira parte é declarada a variável, a segunda é até quando sera executada e a terceira
         define como a variável será alterada.
        for(int i=0; i<=10; i++)
         */
        for(int i= 0; i<= 10; i++){
            System.out.println(i);
        }

    }
}

