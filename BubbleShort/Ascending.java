package BubbleShort;
import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr =new int[a];
        for(int i =0;i<a;i++){
            arr[i] = scan.nextInt();
        }
        SwapAscending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int SwapAscending(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp  = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        return -1;
    } 
}
