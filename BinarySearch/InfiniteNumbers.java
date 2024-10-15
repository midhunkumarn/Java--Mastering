import java.util.*;

public class InfiniteNumbers {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int[] arr = new int[a];
    for(int i= 0;i<a;i++){
        arr[i] = scan.nextInt();
    }
    int target = scan.nextInt();
    System.out.println(Ifinite(arr, target));
 }
 static int Ifinite(int[] arr, int target){
    int start = 0;
    int end = 1;
    while(target > arr[end]){
        int newstart = end + 1;
        end = end + (end - start + 1)* 2;
        start = newstart;
    }
    return BinarySearch(arr, target, start, end);
 }
 static int BinarySearch(int[] arr, int target, int start, int end){
    while(start<=end){
        int mid = start + (end - start)/2;
        if(target < arr[mid])
        end = mid - 1;
        else if(target > arr[mid])
        start = mid + 1;
        else return mid;
    }
    return -1;  
}
}
