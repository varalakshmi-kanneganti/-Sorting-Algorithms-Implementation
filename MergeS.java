package Sorting;
import java.util.*;
public class MergeS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data:");
            data[i] = sc.nextInt();
        }
        mergeSort(data, 0, n - 1);
        System.out.println("Sorted elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static void mergeSort(int data[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(data, low, mid);
            mergeSort(data, mid + 1, high);
            merge(data, low, mid, high);
        }
    }

    public static void merge(int data[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        int temp[] = new int[data.length];

        while (i <= mid && j <= high) {
            if (data[i] < data[j]) {
                temp[k] = data[i];
                i++;
            } else {
                temp[k] = data[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = data[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = data[j];
            j++;
            k++;
        }

        for (int l = low; l <= high; l++) {
            data[l] = temp[l];
        }
    }
}
