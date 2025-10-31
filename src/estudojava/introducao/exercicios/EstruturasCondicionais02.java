package estudojava.introducao.exercicios;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        //Considerando 1 como domingo

        int dia = 1;

        switch (dia){
            case 1, 7:
                System.out.println("Final de semana.");
                break;
            case 2,3,4,5,6:
                System.out.println("Dia útil.");
                break;
        }

    }
}
