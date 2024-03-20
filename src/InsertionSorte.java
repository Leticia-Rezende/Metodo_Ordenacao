import java.util.Scanner;

public class InsertionSorte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[7];

        System.out.println("Digite 7 valores das cartas que você pegou: ");
        System.out.println("------------------");
        for (int i = 0; i < vetor.length; ++i ) {
            System.out.print("Quais são elas: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 1; i < vetor.length; ++i) {
            int posicaoVetor = vetor[i];
            int j = i - 1;

            System.out.println("Vetor antes de ordenar " + posicaoVetor);
            for (int k = 0; k < vetor.length; ++k ){
                System.out.print("");
                System.out.print((vetor[k] + " "));
                System.out.print("");

            }

            while (j >= 0 && posicaoVetor < vetor[j]) {
                    vetor[j + 1] = vetor[j];
                    j--;
                }
                vetor[j + 1] = posicaoVetor;
            }
        System.out.println();
        System.out.println("O vetor ordenado: " + " ");
        for (int i = 0; i < vetor.length; ++i) {
            System.out.print(vetor[i] + "");
        }
        System.out.println();
        }
    }


