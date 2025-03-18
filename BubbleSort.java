public class BubbleSort {
    public static void main(String[] args) {
        // Criando um vetor de números inteiros de 10 posições 
        int[] vetor = new int [1000000];


        // Inserindo valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

            // Exibindo os valores do vetor
            System.out.println(vetor[i]);
        }
        



        // Metódo de Ordenação Bubble Sort
        int aux;
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        // Exibindo o vetor ordenado
        System.out.println("Nosso vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}




















