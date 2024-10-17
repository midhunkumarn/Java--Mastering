import java.util.*;

public class RotateCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Pivot(arr));
    }static int Pivot(int[] arr){
        int start= 0;
        int end = arr.length-1;

        while(start<=end){
            int mid  =start + (end - start) / 2;
            if(mid < end && arr[mid]>=arr[mid +1] ){
                return mid +1;
            }if(mid > start && arr[mid] <= arr[mid - 1]){
                return (mid -1)+1;
            }
            if(arr[mid]<=arr[start]){
                end = mid - 1;
            }else start  = mid +1;
        }
        return -1;
    }
}
