public class _04_HollowInvertedPyramid {
    /*
    rows = 4
    cols = 7

    *******
     *   *
      * *
       *
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int row = N; row >= 1; row--) {
            for (int gap = 1; gap <= N - row; gap++) {
                System.out.print(" ");
            }

            int formula = 2 * row - 1;

            for (int star = 1; star <= formula; star++) {
                System.out.print(star == formula || star == 1 || row == N ? "*" : " ");
            }
            System.out.println();
        }
    }
}
