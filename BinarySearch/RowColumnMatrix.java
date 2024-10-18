import java.util.*;

public class RowColumnMatrix {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int a = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[c][a];

        for(int i=0;i<a;i++){
            for(int j = 0;j<a;j++){
                arr[i][j]= scan.nextInt();
            }  
        }
        int target = scan.nextInt();
        System.out.println(Arrays.toString(Matrix(arr,target)));
    }

    static int[] Matrix(int[][] arr, int target){
        int r = 0;
        int c= arr.length - 1;
        while(r<arr.length && c >=0){
           if(arr[r][c]==target) return new int[]{r,c};if(arr[r][c]>target) c--;else r++;
        }
        return new int[]{-1,-1};
    }
}
