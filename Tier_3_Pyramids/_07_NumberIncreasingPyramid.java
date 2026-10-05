public class _07_NumberIncreasingPyramid {
    /*
    rows = 4

    1
    1 2
    1 2 3
    1 2 3 4
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols == rows ? cols : cols + " ");
            }
            System.out.println();
        }
    }
}
