import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int meio = arr.length / 2;
        int[] metadeEsquerda = new int[meio];
        int[] metadeDireita = new int[arr.length - meio];

        for (int i = 0; i < meio; i++) {
            metadeEsquerda[i] = arr[i];
        }
        for (int i = meio; i < arr.length; i++) {
            metadeDireita[i - meio] = arr[i];
        }
        mergeSort(metadeEsquerda);
        mergeSort(metadeDireita);
        merge(arr, metadeEsquerda, metadeDireita);
    }

    private static void merge(int[] arr, int[] metadeEsquerda, int[] metadeDireita) {
        int i = 0, j = 0, k = 0;
        while (i < metadeEsquerda.length && j < metadeDireita.length) {
            if (metadeEsquerda[i] < metadeDireita[j]) {
                arr[k++] = metadeEsquerda[i++];
            } else {
                arr[k++] = metadeDireita[j++];
            }
        }
        while (i < metadeEsquerda.length) {
            arr[k++] = metadeEsquerda[i++];
        }
        while (j < metadeDireita.length) {
            arr[k++] = metadeDireita[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[7];

        System.out.println("------------------");
        System.out.println("Digite os 7 valores das cartas que você retirou: ");
        System.out.println("Lembre-se os valores das cartas tem que ser <= 13");
        System.out.println("------------------");
        for (int i = 0; i < vetor.length; ++i) {
            System.out.println("Quais são elas: ");
            vetor[i] = scanner.nextInt();
        }

            System.out.println("Array antes da ordenação:");
            for (int num : vetor) {
                System.out.print(num + " ");

            }

            mergeSort(vetor);
            System.out.println("");
            System.out.print("Vetor depois da ordenação:");
            for (int num : vetor) {
                System.out.print(num + " ");

                for (int i = 0; i < vetor.length; ++i) {
                    int posicaoVetor = vetor[i];
                    int arr = i + 1;
                }
            }
        }
    }