package InsertionSort;

import java.util.*;

public class InsSort {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int[] arr = new int[a];
    for(int i =0;i<a;i++){
        arr[i]= scan.nextInt();
    }
    Insertion(arr);
    System.out.println(Arrays.toString(arr));
  }  
  static void Insertion(int[] arr){
    for(int i=0;i<arr.length -1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]) Swap(arr,j,j-1);
            else break;
        }
    }
  }

  static void Swap(int[] arr, int start,int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end ] = temp;
  }
}
