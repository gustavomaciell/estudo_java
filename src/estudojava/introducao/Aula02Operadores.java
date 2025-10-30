package estudojava.introducao;

public class Aula02Operadores {
    public static void main (String[] args) {

        // +  -  *  /

        int valor1 = 5;
        int valor2 = 2;
        int soma = valor1 + valor2;
        System.out.println(soma);

        int subtracao = valor1 - valor2;
        System.out.println(subtracao);

        int multiplicacao = valor1 * valor2;
        System.out.println(multiplicacao);

        int divisao = valor1 / valor2;
        System.out.println(divisao);
        /*
        A divisão de dois números inteiros sempre ira resultar em um número inteiro.

        Caso o resultado não seja um número inteiro, deveria ser alterada ao menos uma variavel
        para double.

        Poderiamos tambem fazer um casting porém o codigo ficaria "feio".
         */

        double  num2= 2;
        double exdivisao =  valor1 / num2;
        System.out.println(exdivisao);

        // % (resto)
        // Se o resto da divisão por 2 for 0 o número é par, caso contrário o número é impar.

        int resto= 10 % 2;
        System.out.println(resto);

        System.out.println("--------------------------------");

        // Operadores Relacionais ( Sempre retornam valores booleanos.)
        // <  >  >=  <=  ==  !=

        boolean maiorQue20 = 10 > 20;
        boolean menorQue20 = 10 < 20;
        boolean maiorIgual20 = 10 >= 20;
        boolean menorIgual20 = 10 <= 20;
        boolean igual10 = 10 == 10;
        boolean diferenteDe10 = 10 != 10;

        System.out.println("10 é maior que 20 - " + maiorQue20);
        System.out.println("10 é menor que 20 - " + menorQue20);
        System.out.println("10 é Maior ou igual a 20 - " + maiorIgual20);
        System.out.println("10 é menor ou igual a 20 - " + menorIgual20);
        System.out.println("10 é igual a 10 - " + igual10);
        System.out.println("10 é diferente de 10 - " + diferenteDe10);

        System.out.println("----------------------------------");

        // Operadores logicos ( São usados melhor em estruturas condicionais)
        // &&(AND)  ||(OR)  !(negação)
        // EX: && (e)

        int idade = 50;
        int tempoTrabalho = 19;
        boolean podeAposentar = idade >= 65 && tempoTrabalho >= 20;
        boolean naoPodeAposentar = idade < 65 && tempoTrabalho < 20;

        System.out.println(podeAposentar);
        System.out.println(naoPodeAposentar);

        // EX: || (ou)

        double contaCorrente = 500;
        double contaPoupanca = 10000;
        float valorProduto = 5000F;
        boolean podeComprar = contaPoupanca >= valorProduto || contaCorrente >= valorProduto;
        System.out.println(podeComprar);

        System.out.println("----------------------------------");

        // += -+ *= /=

        int valor = 5;
        valor += 2; // valor + 2
        valor -= 2; // valor - 2
        valor *= 2; // valor * 2
        valor /= 2; // valor / 2
        System.out.println(valor);

        // ++ --
        /*
        Se os operadores (++ ou --) venham antes da variavel eles primeiro implementam +1
        depois executam o código.

        Caso venham depois primeiro executam depois acrescentam.
         */
        int exemplo = 0;
        System.out.println(++exemplo);
    }
}
