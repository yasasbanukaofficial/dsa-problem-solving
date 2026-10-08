public class _02_InvertedPyramidPattern {
    /*
    rows = 5
    stars = -2 each row
    starTotal = 9

    *********
    *******
    *****
    ***
    *
    
    */

    private static final int N = 5;
    public static void main(String[] args) {
        for (int rows = N; rows >= 1; rows--) {
            for (int cols = 1; cols <= 2 * rows - 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
