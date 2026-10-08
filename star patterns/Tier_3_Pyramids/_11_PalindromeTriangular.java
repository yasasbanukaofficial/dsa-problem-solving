public class _11_PalindromeTriangular {
    /*
    rows = 4

          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
          for (int gap = 1; gap <= 2 * (N - row); gap++) {
            System.out.print(" ");
          }
          // First half
          for (int i = row; i >= 1; i--) {
            System.out.print(i == 1 ? i : i + " ");
          }
          // Second half
          for (int j = 2; j <= row; j++) {
            System.out.print(" " + j);
          }
          System.out.println();
        }
    }
}
