class a6_ith_bit{
    static void printKthBit(long n, long k)
    {
        System.out.println(
            ((n & (1 << (k - 1))) >> (k - 1)));
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        long n = 10, k = 2;
       
        // Function Call
        printKthBit(n, k);
    }
}
 