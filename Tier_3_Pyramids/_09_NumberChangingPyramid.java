public class _09_NumberChangingPyramid {
    /*
    rows = 4

    1
    2 3
    4 5 6
    7 8 9 10
    */

    private static final int N = 4;
    public static void main(String[] args) {
        int num = 1;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col == row ? num : num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
