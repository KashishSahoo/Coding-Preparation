public class a14_row_pascal {
    public static void main(String[] args) {
        int r=6;
        cal_row_optimise(r);
    
       }
        
       static long cal_nCr(int n,int r){
         long result=1;
         for(int i=0;i<r;i++){
            result=result*(n-i);
            result=result/(i+1);
         }
         return result;
       }

       static void cal_row_brutforce(int r){
        for(int c=1;c<=r;c++){
            System.out.print(cal_nCr(r-1, c-1)+" ");
        }
       }

       static void cal_row_optimise(int r){
        int answer=1;
        System.out.print(answer+" ");
        for(int c=1;c<r;c++){
           answer=answer*(r-c);
           answer=answer/c;
           System.out.print(answer+" ");
        }
       }
}
