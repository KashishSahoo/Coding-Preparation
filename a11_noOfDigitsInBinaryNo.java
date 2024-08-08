public class a11_noOfDigitsInBinaryNo {
    public static void main(String[] args) {
        //method 1
        int n=15;//1111 
        int count=0;
       //loop is running the no digits there in a number for binary representation.
        while (n>0) {
            n=n>>1;
            count++;
        }
        System.out.println(count);

    }
}
