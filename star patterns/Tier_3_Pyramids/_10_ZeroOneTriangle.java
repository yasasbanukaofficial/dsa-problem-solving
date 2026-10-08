public class _10_ZeroOneTriangle {
    /*
    rows = 4

    1
    0 1
    1 0 1
    0 1 0 1
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
            for (int cols = 1; cols <= row; cols++) {
                int digit = (row + cols) % 2 == 0 ? 1 : 0;
                System.out.print(row == cols ? digit : digit + " ");
            }
            System.out.println();
        }
    }
}
