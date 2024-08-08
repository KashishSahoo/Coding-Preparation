public class a21_XOR_aTob {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans=cal_XOR_0ToN(b)^cal_XOR_0ToN(a-1);
       System.out.println(ans);

    }

    static int cal_XOR_0ToN(int n ){
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        if(n%4==3){
            return 0;
        }
        return n;
    }
}

