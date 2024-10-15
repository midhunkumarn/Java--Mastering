import java.util.*;

public class Celing{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i =0;i<a;i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int ans = celing(arr,target);
        System.out.println(ans);
    }

    static void celing(  [] arr, int target){
        int s = 0;
        int end = arr.length() -1;

        while(s<=end){
            int mid = s + (end -s)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            if(target > arr[mid])
            s = mid +1;
            else return mid;
        }
        return s;
    }
}