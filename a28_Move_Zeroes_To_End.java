import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("unused")
public class a28_Move_Zeroes_To_End {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int[] ans = ZeroesToEnd_Optimal(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] ZeroesToEnd_Brut(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        return arr;

    }

    static int[] ZeroesToEnd_Optimal(int[] arr){
      int n = arr.length;
      int i=0;
      int j=0;
      for(int k=0;k<n;k++){
        if(arr[j]!=0){
            j++;
        }
        if(arr[i]==0){
            i++;
        }
        if(arr[j]==0 && arr[i]!=0){
           int temp=arr[j];
           arr[j]=arr[i];
           arr[i]=temp;
           i++;
           j++;
        }
        if(i==n+1){
            return arr;
        }
      
      }
    return arr;
     

    }




}
