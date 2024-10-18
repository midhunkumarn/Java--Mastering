package SelectionSort;
import java.util.*;
public class Ssort {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int[] arr = new int[a];
    for(int i =0;i<a;i++){
        arr[i]= scan.nextInt();
    }
    Selection(arr);
    System.out.println(Arrays.toString(arr));
  }  

  static int Selection(int[] arr){
    for(int i=0;i<arr.length;i++){
        int last = arr.length - i -1;
       int MaxInd = getMax(arr, 0,last);

       Swap(arr, MaxInd,last);
    }
    return -1;
  }

  static int getMax(int[] arr,int start, int last){
    int max = start;
    for(int i=start;i<=last;i++){
        if(arr[i]>arr[max])
        max =i;
    }
    return max;
  }

  static void Swap(int[] arr, int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second]=temp;
   
  }

}
