public class a12_noOfDigits_anyBase {
    public static void main(String[] args) {
        int n=1523212;
        int b=10;
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
