public class _04_PlusPattern {
    /*
    rows = 5
    cols = 5

      *
     ***
    *****
     ***
      *
    */

    private static int N = 3; 
    public static void main(String[] args) {
        // First half
        for (int rows = 1; rows <= N; rows++) {
            for (int gap = 1; gap <= N - rows; gap++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * rows - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half
        for (int rows = N - 1; rows >= 1; rows--) {
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
