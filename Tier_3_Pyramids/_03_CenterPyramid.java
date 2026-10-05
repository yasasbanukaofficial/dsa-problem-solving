public class _03_CenterPyramid {
    /*
    rows = 4
    cols = 7
    gap = -1 each row

       *
      ***
     *****
    *******
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int gap = 1; gap <= N - rows; gap++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * rows - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
