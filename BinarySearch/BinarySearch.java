import java.util.*;

public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;

        boolean asc = arr[s] < arr[e];
        
        while(s<=e){
            int mid = s + (e-s) / 2;
            
            if(asc){
                if(target < arr[mid]){
                    e = mid -1;

                }
                else if( target>arr[mid]){
                    s = mid+1;
                }
                else return mid;
            }else{
                if(target > arr[mid]){
                    e = mid -1;

                }
                else if( target<arr[mid]){
                    s = mid+1;
                }
                else return mid;
            }
        }return -1;
    }
   public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);
    int n  = scan.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    int target = scan.nextInt();

    int ans  = binarySearch(arr, target);
    System.out.println(ans);
   }

   
}
