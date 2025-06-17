package itmo.java.basic.homework4.part2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        int[] arr1 = {1, 2, 3, 4, 5};
        task1(arr1);
        int[] arr2 = {2, 3, 5, 4, 9};
        task1(arr2);
        System.out.println("===============");
        System.out.println("Task 2:");
        int[] result = task2();
        printArray(result);
        System.out.println("===============");
        System.out.println("Task 3:");
        int[] arr3 = {5, 6, 7, 2};
        task3(arr3);
        System.out.println("===============");
        System.out.println("Task 4:");
        int[] arr4 = {1, 2, 3, 1, 2, 4};
        task4(arr4);
        int[] arr5 = {1, 2, 2, 1, 2, 1};
        task4(arr5);

        System.out.println("===============");
        System.out.println("Task 5:");
        task5(10);
        task5(100);
    }

    private static void task1(int[] array) {
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    private static int[] task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Numbers of array:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }


        return array;
    }

    private static void task3(int[] array) {
        System.out.print("Array 1: ");
        printArray(array);

        if (array.length < 2) {
            return;
        }

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.print("Array 2: ");
        printArray(array);
    }

    private static void task4(int[] array) {
        int unique = -1;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique = array[i];
                break;
            }
        }

        if (unique != -1) {
            System.out.println("First unique number: " + unique);
        } else {
            System.out.println("No unique number found.");
        }
    }

    private static void task5(int size) {
        int[] array = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.print("Original array: ");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.print("Sorted array:   ");
        printArray(array);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    private static void printArray(int[] array) {
        System.out.print("Result: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
