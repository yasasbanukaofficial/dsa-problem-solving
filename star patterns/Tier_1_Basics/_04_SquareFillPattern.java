public class _04_SquareFillPattern {
    /*
    rows = 6
    cols = 6

    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    */

    private static final int N = 6;

    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int cols = 1; cols <= N; cols++) {
                System.out.print(cols == 1 ? "*" : " *");
            }
            System.out.println();
        }
    }
}
