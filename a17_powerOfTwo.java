public class a17_powerOfTwo {
    public static void main(String[] args) {
        int n=64;
        // int count=0;
        // while (n!=0) {
        //     int bit=n&1;
        //     n= n>>1;
        //     if(bit==1){
        //         count++;
        //     }
        // }
        // if(count==1){
        //     System.out.println("power of two");
        // }
        // else{
        //     System.out.println("not power of two");
        // }

        if((n&(n-1))==0){
            System.out.println("Power Of Two");
        }
        else{
            System.out.println("Not A Power Of Two");
        }
    }
    
}
