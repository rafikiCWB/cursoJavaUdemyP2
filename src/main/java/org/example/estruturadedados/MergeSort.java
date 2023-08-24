package org.example.estruturadedados;

public class MergeSort {


    public void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }


    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        }


    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 3, 1, 8, 6, 4, 2};

        System.out.println("Given array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        printArray(arr);


//        String[] vetor = {"Java", "Python", "C++", "C#", "JavaScript"};
//
//        System.out.println("Merge sorte usando Stream's()");
//        //Object[] sorted = Arrays.stream(vetorString).sorted().toArray();
//        Arrays.sort(vetor);
//        //System.out.println(Arrays.toString(sorted));
//        System.out.println(Arrays.toString(vetor));
//
//        for (String newVector : vetor) {
//            System.out.println(newVector + " ");
//        }

    }
}