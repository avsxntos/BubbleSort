public class InsertionSort {
    public static void main(String[] args) {
        // Criando um vetor de números inteiros de 10 posições
        int[] vetor = new int[10];


        // Inserindo valores no vetor
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // Exibindo os valores do vetor
            System.out.println(vetor[i]);
        }

        // Método de ordenação Insertion  Sort
        int aux, j;
        for(int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        // Exibindo o vetor ordenado
        System.out.println("nosso Vetor ordenado");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
