public class StarTriangle5 {
    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle5() {
        String x;
        int y, m, n;

        x = "";
        y = 1;
        while (y <= 5) {
            x = "";
            m = y;
            n = y;
            while (m <= 5) {
                x += " ";
                m ++;
            }
            while (n > 0) {
                x += "*";
                n--;
            }
            System.out.println(x);
            y ++;
        }
    }

    void main() {
        starTriangle5();
    }
}
