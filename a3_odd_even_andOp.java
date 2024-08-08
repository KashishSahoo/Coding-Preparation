public class a3_odd_even_andOp {
    public static void main(String[] args) {
        int n=787898;
        System.out.println(isOdd(n));
  
    }
    static boolean isOdd(int n){
        return((n&1)==1);
    }
}
