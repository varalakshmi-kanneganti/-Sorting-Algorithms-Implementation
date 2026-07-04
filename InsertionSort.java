package Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of ements:");
        int n = sc.nextInt();
        int data[] = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the data:");
            data[i] = sc.nextInt();
        }
        for(int i = 0; i<n ; i++){
            int key = data[i];
            int j = i-1;
            while((j>=0) && (data[j]> key)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
        for (int i = 0; i< n; i++) {
            System.out.print(" "+data[i]);  
        }
    }
}
