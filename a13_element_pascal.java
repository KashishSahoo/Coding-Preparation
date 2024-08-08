public class a13_element_pascal {
   public static void main(String[] args) {
    int n=10;
    int r=3;
    long ans=cal_nCr(n, r);
    System.out.println(ans);  //TC:O(r); SC:O(1)

   }
    
   static long cal_nCr(int n,int r){
     long result=1;
     for(int i=0;i<r;i++){
        result=result*(n-i);
        result=result/(i+1);
     }
     return result;
   }
}