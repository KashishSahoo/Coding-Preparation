public class a18_rightMostSetBit {
    public static void main(String[] args) {
        int n=48;//110000   5
        System.out.println(Integer.toBinaryString(n));
        int ans=n&(-n);
        int count=0;
       while(ans!=1){
        ans=ans>>1;
        count++;
       }
       System.out.println(count+1);
    }
}
