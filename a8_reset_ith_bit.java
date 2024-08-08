public class a8_reset_ith_bit{
    static void resetKthBit(long n, long k)
    {
        System.out.println(n&(~(1<<(k-1))));

    }
    public static void main(String[] args)
    {
        long n = 10, k = 2;
        resetKthBit(n, k);
    }
}

