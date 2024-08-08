public class a19_noOfSetBits {
    public static void main(String[] args) {
        int n=17;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Count_setBits(n));
    }

    static int Count_setBits(int n){
        int count=0;
        while (n>0) {
            count++;
            // n=n-(n&-n);
            n=n&(n-1);
        }
        return count;
    }
}
