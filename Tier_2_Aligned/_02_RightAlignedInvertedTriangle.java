public class _02_RightAlignedInvertedTriangle {
    /*
    rows = 5

    *****
     ****
      ***
       **
        *
    */

    private static int N = 5;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int gap = 1; gap < rows; gap++) {
                System.out.print(" ");
            }
            for (int stars = N; stars >= rows; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
