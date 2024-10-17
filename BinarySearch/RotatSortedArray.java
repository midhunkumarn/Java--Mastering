import java.util.Scanner;

public class RotatSortedArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i =0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        System.out.println(Ans(arr, target));
    }

    static int Ans(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid]==target) return mid;
            if(arr[start] <= arr[mid]){
                if(arr[start]<=target && target<=arr[mid]){
                    start = mid -1;
                }else start = mid + 1;
            }else{
                
                    if(arr[mid]<=target && target<=arr[end]){
                        end = mid + 1;
                    }else end = mid -1;
                
            }
        }return -1;
    }
}