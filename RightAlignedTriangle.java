public class RightAlignedTriangle {
    public static void main(String[] args) {
        for (int rows = 0; rows < 5; rows++) {
            for (int gaps = 4; gaps > rows; gaps--) {
                System.out.print(" ");
            }
            for (int stars = 0; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
