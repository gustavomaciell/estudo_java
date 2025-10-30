package estudojava.introducao.exercicios;

public class TipoPrimitivo {
    public static void main(String[] args) {
        /*
        Crie variáveis para os campos descritos abaixo entre <> e impriva a seguinte mensagem:

        Eu <nome> morando no endereço <endereço>
        confirmo que recebi o salário de <salario> na data <data>.
         */

        String nome = "Gustavo";
        String endereco = "sei la";
        double salario = 8880.73;
        int dia = 12;
        int mes = 12;
        int ano = 2026;

        System.out.println("Eu, " + nome + " morando no endereço "+ endereco +
                "\nconfirmo que recebi o salário de R$"+ salario + " na data "+ dia+"/"+mes+"/"+ano+".");
    }
}
