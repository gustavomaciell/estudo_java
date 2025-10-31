package estudojava.introducao;

public class Aula03EstruturasCondicionais {
    public static void main(String[] args) {
        // IF ELSE
        // O IF só sera executado caso a condição seja verdadeira, caso seja falsa o else é executado automaticamente.

        /*
        Se a idade foi menor que 15 imprimir categoria infantil;
        Se a idade for maior ou igual a 15 e menor que 18 imprimir categoria juvenil;
        Se a idade for maior ou igual a 18 imprimir categoria adulto.
         */
        int idade = 21;
        String categoria = "";

        if (idade < 15) {
            categoria= "categoria infantil";
        } else if (idade >=15 && idade<18){
            categoria = "categoria juvenil";
        }else {
            categoria = "categoria adulto";
        }
        System.out.println(categoria);

        System.out.println("--------------------------------");
        /*
        Embora não seja aconselhável podemos usar um operador ternario para simplificar uma estrutura if else.
        OPERADOR TERNÁRIO: (condição) ? verdadeiro : falso
         */

        /*
        Outra estrutura de dados é o SWITCH.
        O switch é uma estrutura condicional para resolver problemas mais simples como por exemplo,
        imprimir o dia da semana de forma numérica.
         */
        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
                case 2:
                System.out.println("Segunda");
                break;
                case 3:
                System.out.println("Terça");
                break;
                case 4:
                System.out.println("Quarta");
                break;
                case 5:
                System.out.println("Quinta");
                break;
                case 6:
                System.out.println("Sexta");
                break;
                case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
