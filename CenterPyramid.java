public class CenterPyramid {
    /*

    rows = 4
    columns/finalStarCount = 7
    progression = +2

        *
       ***
      *****
     *******

    */
    public static void main(String[] args) {
        for (int rows = 0; rows < 4; rows++) {
            for (int gap = 3; gap >= rows; gap--) {
                System.out.print(" ");
            }
            for (int star = 0; star < (rows * 2 + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}