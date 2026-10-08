public class _03_InvertedTriangle {
    /*
    rows = 5

    *****
    ****
    ***
    **
    *
    
    */

    private static final int N = 5;

    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int cols = 1; cols <= N - rows + 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
