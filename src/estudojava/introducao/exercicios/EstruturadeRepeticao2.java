package estudojava.introducao.exercicios;

public class EstruturadeRepeticao2 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado.
        //Condição valorParcela >= 1000

        double valorCarro = 50000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("O carro pode ser parcelado em " + parcela + " de R$" + valorParcela);
            } else {
                break;
            }

        }


    }
}

