public class _01_HollowSquarePattern {
    /*
    rows = 5
    cols = 5
    inner gap = 3

    *****
    *   *
    *   *
    *   *
    *****
    */

    private final static int N = 5;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                System.out.print((row == 1 || row == N || col == 1 || col == N) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
