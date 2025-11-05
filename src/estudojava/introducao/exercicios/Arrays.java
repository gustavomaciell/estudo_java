package estudojava.introducao.exercicios;

public class Arrays {
    public static void main(String[] args) {
        //Crie um vetor Ae depois um vetor B do mesmo tamanho, onde cada elemento de B seja igual
        // ao elemento correspondente de A.

        int[] a ={1, 3, 5};
        int[] b= new int[a.length];

        for (int i = 0; i < 3; i++){
            b[i] = a[i];
            System.out.println("Elementos vetor B: "+ b[i]);

            }

        }

    }

