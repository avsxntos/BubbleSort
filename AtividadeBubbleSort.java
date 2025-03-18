import java.util.Scanner;

public class AtividadeBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação de um array para armazenar os 15 números
        int[] numeros = new int[15];
        
        // Entrada de 15 números
        System.out.println("Digite 15 números:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Aplicando o algoritmo Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca de posição
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        // Exibindo os números ordenados
        System.out.println("\nNúmeros ordenados em ordem crescente:");
        for (int i = 0; i < 15; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
