public class InvertedCenterPyramid {
    /*
    
    rows = 3
    columns/finalStarCount = 5

     *****
      ***
       *
    
    */
    public static void main(String[] args) {
        for (int rows = 0; rows < 3; rows++) {
            for (int gap = 0; gap <= rows; gap++) {
                System.out.print(" ");
            }

            for (int str = 0; str < 5 - (rows*2); str++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
