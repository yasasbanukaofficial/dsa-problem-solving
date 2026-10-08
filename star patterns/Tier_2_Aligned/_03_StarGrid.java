public class _03_StarGrid {
    /*
    rows = 4
    cols = 4
    gap = 1 between stars

    * * * *
    * * * *
    * * * *
    * * * *
    */

    private static int N = 4;
    public static void main(String[] args) {
        // Write your code
        for (int rows = 1; rows <= N; rows++) {
            for (int cols = 1; cols <= N; cols++) {
                System.out.print(cols == 1  ? "*": " *");
            }
            System.out.println();
        }
    }
}
