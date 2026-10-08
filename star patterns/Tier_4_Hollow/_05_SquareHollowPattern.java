public class _05_SquareHollowPattern {
    /*
    rows = 5
    cols = 5

    * * * * *
    *       *
    *       *
    *       *
    * * * * *
    */

    private static final int N = 5;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                boolean condition = col == 1 || row == 1 || col == N || row == N;
                System.out.print(condition ? (col != 1 || col == N ? " *" : "*") : "  ");
            }
            System.out.println();
        }
    }
}
