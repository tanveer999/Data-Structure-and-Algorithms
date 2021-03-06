package Array;

public class MajorityElement {
    public static void main(String[] args) {
        // int[] arr = {8, 3, 4, 8, 8};
        int[] arr = {3, 7, 4, 7, 7, 5};
        majorityElement1(arr, arr.length);
        majorityElement2(arr, arr.length);
    }

    public static void majorityElement1(int[] arr, int n) {
        int element = 0, count, max = 0;

        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > n / 2) {
                element = arr[i];
                max = count;
            }
        }
        if(max > 0) {
            for(int i = 0; i < n; i++) {
                if(arr[i] == element) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }

    // O(n) 
    // boyer-moore voting algo
    public static void majorityElement2(int[] arr, int n) {
        int count = 1;
        int res = 0;

        for(int i = 1; i < n; i++) {
            if(arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if(count  == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == arr[res]) count++;
        }
        if(count > n / 2) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }
}
