package org.example.estruturadedados;

import org.jetbrains.annotations.NotNull;

public class QuickSort {
    void displayArray(@NotNull int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }
    }

    void sort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivot = partition(arr, esquerda, direita);
            sort(arr, esquerda, pivot - 1);
            sort(arr, pivot + 1, direita);
        }
    }

    private int partition(int[] arr, int esquerda, int direita) {
        int pivot = arr[direita];
        int i = (esquerda - 1);
        for (int j = esquerda; j < direita; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[direita];
        arr[direita] = temp;
        return i + 1;


    }

    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 3, 1, 2, 4, 6, 8};
        int n = arr.length;

        System.out.println("Array inicial");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n - 1);
        System.out.println("\nSorted array");
        qs.displayArray(arr);
    }


    /* int partition(int arr[], int low, int high) {
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

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    static void displayArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {9, 7, 5, 3, 1, 2, 4, 6, 8};
        int n = arr.length;

        System.out.println("Array inicial");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n - 1);

        System.out.println("\nSorted array");
        displayArray(arr);
    }*/
}