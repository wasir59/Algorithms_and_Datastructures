/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_datastructures;

import java.util.Arrays;

/**
 *
 * @author Wasir
 */
public class QuickSort {

    public static int[] array = {1, 12, 5, 26, 7, 14, 3, 7, 2};

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        System.out.println(Arrays.toString(array));
        qs.quickSort(array, 0, array.length - 1);
    }

    public void quickSort(int arr[], int left, int right) {
        int index = partition(array, 0, right);

        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }

        if (index < right) {
            quickSort(arr, index, right);
        }

    }

    public int partition(int arr[], int left, int right) {
        int i = left, j = right, tmp;
        int middle = (left + right) / 2;
        int pivot = arr[middle];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }
}
