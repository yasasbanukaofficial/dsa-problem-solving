public class Diamond {
    /*
    

        *
       ***
      *****
     *******
      *****
       ***
        *
    
    */


    public static void main(String[] args) {
        for (int r = 0; r < 4; r++) {
           for (int fGap = 3; fGap > r; fGap--) {
                System.out.print(" ");
           }
           for (int str = 0; str < r*2+1; str++) {
                System.out.print("*");
           }
           System.out.println();
        }
        for (int r = 0; r < 3; r++) {
            for (int gp = 0; gp <= r ; gp++) {
                System.out.print(" ");
            }
            for (int str = 0; str < 5 - (r*2); str++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
