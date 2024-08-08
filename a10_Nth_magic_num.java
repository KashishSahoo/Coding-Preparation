public class a10_Nth_magic_num {
    public static void main(String[] args) {
        int n=6; //110 1*5**3+1*5**2+0*5**1=150
        int ans=0;
        int count=0;
        int base=5;
       //loop is running the no digits there in a number for binary representation.
        while (n>0) {
            int last =n&1;
            n=n>>1;
            count++;
            ans+=last*base;
            base=base*5;

        }
        System.out.println(ans);
        System.out.println(count);
    }
}
