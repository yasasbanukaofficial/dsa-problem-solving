public class _05_NumberPyramid {
    /*
    rows = 5
    gap = +1 each row

        1
       12
      123
     1234
    12345
    */

    private static final int N = 5;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int gap = 1; gap <= N - rows; gap++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= rows; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
