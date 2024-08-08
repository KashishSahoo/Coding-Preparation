import java.util.Arrays;
  //flip=reverse arr And invert= 0=>1 and 1=>0
  //Google Interview
public class a22_Flip_img {
    public static void main(String[] args) {
        int [][] arr={
            {1,1,0}, //011
            {1,0,1}, //101
            {0,0,0}  //000
        };

        for(int i=0;i<arr.length;i++){
            rev(arr[i]);
            invert(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
        // for(int i=0;i<arr.length;i++){
        //     invert(arr[i]);
        // }
        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        
    }
    static void rev(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int start,int end){
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void invert(int [] arr){
        // for(int i=0;i<arr.length;i++){
        //  if(arr[i]==0){
        //     arr[i]=1;
        //  }
        //  else if(arr[i]==1){
        //     arr[i]=0;
        //  }
        // }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]^1;
        }
    }

}
