public class a27_Patterns {
    public static void main(String[] args) {
        int n = 5;
        inc_triangle(n);

    }


    static void square(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row run col
            for (int col = 1; col<= n; col++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }

    static void inc_triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<= row; col++) {
                System.out.print(" *"+" ");
            }
            System.out.println(" ");
        }
    }

    
    static void dec_triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col>= row; col--) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    static void dec_triangle_1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<= n-row; col++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    static void number_pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }


    static void full_triangle_rightToLeft(int n) {
        for (int row = 1; row <= n; row++) {
        for (int col = 1; col<= row; col++) {
            System.out.print("*"+" ");
        }
        System.out.println(" ");
        }
        for (int row = 1; row <= n-1; row++) {
            for (int col = n-1; col>= row; col--) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }


    static void full_triangle_rightToLeft_1(int n) {
        for (int row = 0; row < 2*n; row++) {
          int totColsInRow=row>n?2*n-row:row;
        for (int col = 0; col< totColsInRow; col++) {
            System.out.print("*"+" ");
        }
        System.out.println(" ");
        }
    }
    static void rev_inc_triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col<= n-row; col++) {
                System.out.print(" "+" ");
            }
            for (int col = 1; col<= row; col++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    static void rev_dec_triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col< row; col++) {
                System.out.print(" "+" ");
            }
            for (int col = row; col<= n; col++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    static void full_triangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col< n; col++) {
                System.out.print(" "+" ");
            }
            for (int col = 1; col<= row; col++) {
                System.out.print("*"+" ");
            }
            for (int col = 1; col<= row-1; col++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    static void full_triangle_rev(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col< row; col++) {
                System.out.print(" "+" ");
            }
            for (int col = n; col>= row; col--) {
                System.out.print("*"+" ");
            }
            for (int col = n-1; col>= row; col--) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }

}
