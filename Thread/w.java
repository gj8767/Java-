package Thread;

import java.util.*;

public class w {

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int binary(int arr[], int key) {
        // bubble(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                l = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        return -1;
    }

    static void bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.print("Enter the " + n + " size of array is : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Sorted array is : ");
            bubble(arr);
            System.out.print("Enter you key is : ");
            int key = sc.nextInt();
            System.out.println("Index is : " + binary(arr, key));
        }

    }
}
