public class _01_PyramidPattern {
    /*
    rows = 5
    stars = +2 each row
    starTotal = 9

    *
    ***
    *****
    *******
    *********

    */

    private static final int N = 5;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int cols = 1; cols <= 2 * rows - 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
