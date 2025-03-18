# 📌 Estrutura de Dados - Aula 06

## 📌 Métodos Elementares de Ordenação

Nesta aula, exploramos os algoritmos de ordenação em Java, suas aplicações e complexidades. O objetivo é entender qual algoritmo utilizar para melhor desempenho e legibilidade do código.

### 📊 Complexidade dos Algoritmos

A complexidade de um algoritmo de ordenação é avaliada em três cenários:
- **Pior Caso**
- **Caso Médio**
- **Melhor Caso**

---

## 🔄 Algoritmos de Ordenação

### 🟢 1. Bubble Sort

O **Bubble Sort** é um algoritmo simples, baseado na troca de valores consecutivos até que a lista esteja ordenada.

📌 **Complexidade:**
  - ⏳ Pior Caso: `O(n²)`
  - ⏳ Caso Médio: `O(n²)`
  - ⚡ Melhor Caso: `O(n)`

✅ **Vantagens:** Fácil implementação.
❌ **Desvantagens:** Muitas comparações e baixa eficiência para grandes conjuntos de dados.

🔹 **Passo a passo:**
```java
for (int i = 0; i < n-1; i++) {
    for (int j = 0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
            // Troca os elementos
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
```

---

### 🟡 2. Insertion Sort

O **Insertion Sort** funciona ordenando os elementos um a um, inserindo cada novo elemento na posição correta.

📌 **Complexidade:**
  - ⏳ Pior Caso: `O(n²)`
  - ⏳ Caso Médio: `O(n²)`
  - ⚡ Melhor Caso: `O(n)`

✅ **Vantagens:** Efetivo para pequenas listas e parcialmente ordenadas.
❌ **Desvantagens:** Ineficiente para grandes conjuntos de dados.

🔹 **Passo a passo:**
```java
for (int i = 1; i < n; i++) {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
    }
    arr[j + 1] = key;
}
```

---

### 🟠 3. Selection Sort

O **Selection Sort** busca o menor elemento da lista e o troca com o primeiro elemento, repetindo esse processo para cada posição subsequente.

📌 **Complexidade:**
  - ⏳ Pior Caso: `O(n²)`
  - ⏳ Caso Médio: `O(n²)`
  - ⏳ Melhor Caso: `O(n²)`

✅ **Vantagens:** Fácil de entender e implementar.
❌ **Desvantagens:** Baixa eficiência para grandes conjuntos de dados.

🔹 **Passo a passo:**
```java
for (int i = 0; i < n-1; i++) {
    int min_idx = i;
    for (int j = i+1; j < n; j++) {
        if (arr[j] < arr[min_idx]) {
            min_idx = j;
        }
    }
    int temp = arr[min_idx];
    arr[min_idx] = arr[i];
    arr[i] = temp;
}
```

---

### 🔴 4. Quick Sort

O **Quick Sort** utiliza a técnica de "dividir para conquistar", separando a lista em sublistas menores e ordenando cada uma recursivamente.

📌 **Complexidade:**
  - ⏳ Pior Caso: `O(n²)`
  - ⚡ Caso Médio: `O(n log n)`
  - ⚡ Melhor Caso: `O(n log n)`

✅ **Vantagens:** Muito eficiente para grandes conjuntos de dados.
❌ **Desvantagens:** Implementação mais complexa e possível pior caso se o pivô for mal escolhido.

🔹 **Passo a passo:**
```java
int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}
```

---

## 📌 Exercício Proposto

📝 **Desafio:**
Implemente um programa que receba **15 números via teclado** e os ordene em ordem crescente utilizando o **Bubble Sort**.

```java
import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }
        
        // Aplica Bubble Sort
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---



