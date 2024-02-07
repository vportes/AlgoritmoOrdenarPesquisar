import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insira o tamanho da matriz: ");
        int tamanho = scanner.nextInt();
        int[] matriz = new int[tamanho];
        System.out.println("Insira " + tamanho + " integrais:");
        for (int i = 0; i < tamanho; i++) {
            matriz[i] = scanner.nextInt();
        }

        Quicksort quicksort = new Quicksort();
        quicksort.ordenar(matriz);

        System.out.println("Matriz ordenada: " + Arrays.toString(matriz));

        System.out.print("Digite o número a ser pesquisado: ");
        int alvo = scanner.nextInt();

        PesquisaBinaria pesquisaBinaria = new PesquisaBinaria();
        int indice = pesquisaBinaria.pesquisar(matriz, alvo);

        if (indice != -1) {
            System.out.println(alvo + " encontrado no indice " + indice);
        } else {
            System.out.println(alvo + " não encontrado na matriz.");
        }
    }
}