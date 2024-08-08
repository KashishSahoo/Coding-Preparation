import java.util.*;

public class a29_union_sorted_array {
    public static void main(String[] args) {
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        // int[] arr2 = { 2, 3, 4, 4, 5, 6 };
        int n1 = arr1.length;
        // int n2 = arr2.length;

        for (int i = 0; i < n1; i++) {
            if (arr1[i] != -1) {
                temp1.add(arr1[i]);
                arr1[i] = -1;
            }

        }
        System.out.println(temp1);
    }
}
