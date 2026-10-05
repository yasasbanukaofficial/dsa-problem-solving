public class _06_RhombusPattern {
    /*
    rows = 5

        * * * *
       * * * *
      * * * *
     * * * *
    * * * *
    
    */

    private static int N = 5;
    public static void main(String[] args) {
        for (int rows = 1; rows <= N; rows++) {
            for (int gaps = 1; gaps <= N - rows; gaps++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= N-1; stars++) {
                System.out.print(stars == 1 ? "*" : " *");
            }
            System.out.println();
        }
    }
}
