public class _02_HollowRightTriangle {
    /*
    rows = 4
    cols = 4

    *
    **
    * *
    ****
    */

    private final static int N = 4;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row % 2 != 0 ? (col == 1 || col == row) ? "*" : " " : "*");
            }
            System.out.println();
        }
    }
}
