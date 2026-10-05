public class _08_NumberIncreasingReversePyramid {
    /*
    rows = 4

    1 2 3 4
    1 2 3
    1 2
    1
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int row = N; row >= 1; row--) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(cols == row ? cols : cols + " ");
            }
            System.out.println();
        }
    }
}
