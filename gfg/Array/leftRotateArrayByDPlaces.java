package Array;

import java.util.Arrays;

public class leftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {1};
        // int[] arr = {};
        int n = arr.length, d = 7;

        if(d > n) {
            d = d % n;
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        leftRotateByDPlaces1(arr, n, d);

        System.out.println("Array after left rotatation by one: " + Arrays.toString(arr));
    
    }

    // solution 1
    // time complexity - O(n * d)
    public static void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0]; 

        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void leftRotateByDPlaces1(int[] arr, int n, int d) {
        for(int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }
}
