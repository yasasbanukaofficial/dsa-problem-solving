public class _04_ButterflyPattern {
    /*
    rows = 5
    cols = 9

    *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    
    */

    private static final int N = 5;
    public static void main(String[] args) {
        for (int row = N; row >= 1; row--) {
            for (int star = 1; star <= (N + 1) - row; star++) {
                System.out.print("*");
            }
            for (int gap = 1; gap < 2 * row - 1; gap++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (N + 1) - row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 2; row <= N; row++) {
            for (int star = 1; star <= (N + 1) - row; star++) {
                System.out.print("*");
            }
            for (int gap = 1; gap < 2 * row - 1; gap++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (N + 1) - row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
