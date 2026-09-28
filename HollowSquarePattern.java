public class HollowSquarePattern {
    /*
    
    rows = 5
    constantGap = 3
    
    *****
    *   *
    *   *
    *   *
    *****

    */
    public static void main(String[] args) {
        for (int r = 0; r < 5; r++) {
            System.out.print("*");
            for (int stars = 0; stars < 3; stars++) {
                if (r % 4 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
