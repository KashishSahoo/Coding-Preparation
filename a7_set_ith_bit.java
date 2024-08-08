public class a7_set_ith_bit{
    static void setKthBit(long n, long k)
    {
        System.out.println(n|(1<<(k-1)));

    }
 
    // Driver Code
    public static void main(String[] args)
    {
        long n = 10, k = 3;
       
        // Function Call
        
        setKthBit(n, k);
    }
}

