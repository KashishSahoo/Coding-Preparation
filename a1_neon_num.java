import java.util.*;
class a1_neon_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        neon(num);
        sc.close();
        
    }
   static void neon(int n){
    int sq=n*n;
    int sum=0;
    while(sq!=0){
        int digit=sq%10;
        sum=sum+digit;
        sq=sq/10;
    }
    if(n==sum){
        System.out.println("Neon Number");
    }
    else{
        System.out.println("Not A Neon Number");
    }
   }
}