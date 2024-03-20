package org.example;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] vetor){
        int aux;
        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 0; j < vetor.length-i-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] vetor = {4, 7, 5, 2, 8, 1, 6, 3, 4};
        bubbleSort(vetor);
        System.out.println("Sorted array: " + Arrays.toString(vetor));
    }
}
