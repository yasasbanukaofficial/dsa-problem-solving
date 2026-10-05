public class _12_ReverseNumberTrianglePattern {
    /*
    rows = 4

    1 2 3 4
      2 3 4
        3 4
          4
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
          for (int gap = 1; gap < 2 * row - 1; gap++) {
            System.out.print(" ");
          }
          for (int num = row; num <= N; num++) {
            System.out.print(num == N ? num : num + " ");
          }
          System.out.println();
        }
    }
}
