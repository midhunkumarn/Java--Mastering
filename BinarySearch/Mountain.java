import java.util.*;
public class Mountain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();
        int[] arr=new int[a];
        for(int i =0;i<a;i++){
            arr[i]= scan.nextInt();
        }
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1])
            end = mid;
            else start = mid + 1;
        }
        System.out.println(start);
    }
}
