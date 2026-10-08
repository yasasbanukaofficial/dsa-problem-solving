public class _01_Square {
    /*
    rows = 5
    cols = 5

    *****
    *****
    *****
    *****
    *****
    */

    private static final int N = 5;

    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int cols = 1; cols <= N; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
