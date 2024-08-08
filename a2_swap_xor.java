public class a2_swap_xor {
    public static void main(String[] args) {
        int a=11;
        int b=22;
        System.out.println("Before Swap a="+a+" And b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swap a="+a+ " And b="+b);
    }
}
