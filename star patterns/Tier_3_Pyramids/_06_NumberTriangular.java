public class _06_NumberTriangular {
    /*
    rows = 4

       1
      2 2
     3 3 3
    4 4 4 4
    */

    private static final int N = 4;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int gap = 1; gap <= N - rows; gap++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= rows; num++) {
                System.out.print(rows == num ? rows : rows + " ");
            }
            System.out.println();
        }
    }
}
