public class  a9_allThrice_unquie {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,8,7,8,8};
        System.out.println(ans(arr));
    }

    static int ans(int [] arr){
        int sum=0;
        for(int n:arr){
            // u^=n;
            sum=sum+n;
        }
        System.out.println(sum);
        int answer=sum%3;
        return(answer);
    }
}

