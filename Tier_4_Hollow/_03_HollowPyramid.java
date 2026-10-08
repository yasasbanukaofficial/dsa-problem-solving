public class _03_HollowPyramid {
    /*
    rows = 4
    cols = 7

       *
      * *
     *   *
    *******
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
            for (int gap = 1; gap <= N - row; gap++) {
                System.out.print(" ");
            }
            
            int formula = 2 * row - 1;

            for (int star = 1; star <= formula; star++) {
                System.out.print(star == 1 || star == formula || row == N ? "*" : " ");
            }
            System.out.println();
        }
    }
}
