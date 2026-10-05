public class _01_RightAlignedTriangle {
    /*
    
    rows = 5

        *
       **
      ***
     ****
    *****

    */

    private static int N = 5;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int gaps = N; gaps >= rows; gaps--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
