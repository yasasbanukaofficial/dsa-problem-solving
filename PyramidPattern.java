public class PyramidPattern {
    /*
    
    rows = 5
    starTotal = 9
    gap = +3 from 0

    *
    ***
    *****
    *******
    *********
    
    */

    public static void main(String[] args) {
        for (int rows = 0; rows < 9; rows+=2) {
            for (int stars = 0; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
