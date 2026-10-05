public class _04_InvertedCenterPyramid {
    /*
    rows = 3
    cols = 5
    gap = +1 each row

    *****
     ***
      *
    
    */

    private static final int N = 3;
     public static void main(String[] args) {
        for (int rows = N; rows >= 1; rows--) {
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
