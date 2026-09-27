public class InvertedTriangle {
    public static void main(String[] args) {
        for (int rows = 0; rows <= 5; rows++) {
            for (int stars = 5; stars >= rows; stars--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
