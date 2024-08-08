public class a16_sumRow_pascal {
    public static void main(String[] args) {
        int row=5;
        @SuppressWarnings("unused")
        int ans=(int) (Math.pow(2, row-1));
        int answer=1<<(row-1);
        System.out.println(answer);
    }
}
