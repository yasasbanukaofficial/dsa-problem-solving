public class _01_Diamond {
    /*
    rows = 4 (each half)
    cols = 7

       *
      ***
     *****
    *******
     *****
      ***
       *
    */

    private static final int N = 4; 
    public static void main(String[] args) {
        for (int row = 1; row <= N; row++) {
            for (int gap = 1; gap <= N - row; gap++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = N - 1; row >= 1; row--) {
            for (int gap = 1; gap <= N - row; gap++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
