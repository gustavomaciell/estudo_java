package estudojava.introducao.exercicios;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        /*
        Dado um determinado valor, imprimir quanto sera pago de imposto.
        Salário: 0 a 34712 - imposto = 9.70%
        Salário: 34713 a 68507 - imposto = 37.35%
        Salário: 68508 - imposto = 49.50%
         */
        double salario = 43000;

        if (salario >= 0 && salario <= 34712) {
            salario = salario * 9.70 / 100;
            System.out.println("O valor pago sera de R$" + salario);
        } else if (salario >= 34713 && salario <= 68507) {
            salario = salario * 37.35 / 100;
            System.out.println("O valor pago sera de R$" + salario);
        } else {
            salario = salario * 49.50 / 100;
            System.out.println("O valor pago sera de R$" + salario);

        }

    }
}
