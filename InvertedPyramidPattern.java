public class InvertedPyramidPattern {
    public static void main(String[] args) {
        for (int r = 0; r < 5; r++) {
            for (int s = 9 - r; s > r; s--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
