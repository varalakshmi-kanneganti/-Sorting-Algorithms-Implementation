package Sorting;
import java.util.*;
public class QuickSort1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        System.out.println("Enter data:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        QuickSort(data, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static void QuickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = divide(data, low, high);
            QuickSort(data, low, pivotIndex - 1);
            QuickSort(data, pivotIndex + 1, high);
        }
    }
    public static int divide(int[] data, int low, int high) {
        int pivot = data[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= high && data[i] <= pivot) {
                i++;
            }
            while (data[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        data[low] = data[j];
        data[j] = pivot;
        return j;
    }
}
