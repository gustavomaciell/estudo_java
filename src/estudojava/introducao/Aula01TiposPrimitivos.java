package estudojava.introducao;

public class Aula01TiposPrimitivos {
    public static void main(String[] args){
        /*
        TIPOS PRIMITIVOS
        int, short, byte, long, double, float, boolean, char
         */
        int idade = 10;
        short idadeShort = 10;
        byte idadeByte = 10;
        long numeroGrande = 100000000;
        double salarioDouble = 2500;
        float salarioFloat = 2500;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        /*
        CASTING não é uma boa prática mas é uma ferramenta para converter tipos primitivos maiores
        em menores.

        EX(nesse exemplo é perdida a parte decimal):
         */
        double exCasting =(int) 23.13;
        System.out.println(exCasting);

    }
}
