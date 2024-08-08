import java.util.*;

public class a15_print_pascal {

    static List<Integer> generate_row(int row) {
        long answer = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); // insering 1st element

        // calculate rest of elements
        for (int col = 1; col < row; col++) {
            answer = answer * (row - col);
            answer = answer / col;
            ansRow.add((int) answer);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // store entire pascal triangle

        for (int row = 1; row <= n; row++) {
            ans.add(generate_row(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int r = 5;
        List<List<Integer>> anss = pascalTriangle(r);
        for (List<Integer> it : anss) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
