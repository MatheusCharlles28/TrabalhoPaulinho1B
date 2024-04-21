package lista.trabalho;

import java.util.Scanner;

public class Trabalho {
    
    public static void main(String[] args) {
        System.out.println("1= Insercao \n 2= selecao \n 3= bolha");
            int escolha;
        Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();
        if (escolha == 1){
            metodo1();
        }
        if (escolha == 2){
            metodo2();
        }
        else {
            metodo3();
        }
    }
    public static void metodo1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
            int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os numeros do vetor:");
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scanner.nextInt();
            }
            
        System.out.println("Vetor original:");
            exibirVetor(vetor);
        
        insercao(vetor);
        
        System.out.println("Vetor ordenado:");
            exibirVetor(vetor);
            
        scanner.close();
        }

        public static void exibirVetor(int[] vetor) {
        System.out.print("Vetor: ");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    public static void insercao(int[] vetor) {
        int n = vetor.length;
            for (int i = 1; i < n; ++i) {
                int key = vetor[i];
                    int j = i - 1;
                    
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }
    public static void metodo2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
            int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                    vetor[i] = scanner.nextInt();
            }
        System.out.println("\nVetor original:");
            exibirVetor(vetor);

        selecao(vetor);

        System.out.println("\nVetor ordenado:");
            exibirVetor(vetor);
        scanner.close();
    }
    public static void selecao(int[] vetor) {
        int n = vetor.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                    for (int j = i + 1; j < n; j++) {
                        if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                        }
                    }
        int temp = vetor[minIndex];
        vetor[minIndex] = vetor[i];
        vetor[i] = temp;
        }
    }
    public static void exibirVetor2(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    public static void metodo3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
            int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
        }
        System.out.println("\nVetor original:");
            exibirVetor(vetor);
        bolha(vetor);

        System.out.println("\nVetor ordenado:");
            exibirVetor(vetor);
        scanner.close();
    }
    public static void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
    public static void exibirVetor3(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
// Foi dividido cada metodo em um void diferente para não ter problemas, 
//também como os metodos de ordenação foram separados,
// metodo para exbir o vetor também foram separados.
// Deixei o codigo todos em sequencia para ficar mais facil a compreensão.
//Tentei jogar mais para o lado o codigo conforme abaixa também para facilitar.
