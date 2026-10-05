public class StarTriangleN {
    /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle(int N) {
        String x;
        int y, n, m;

        y = 1;
        while (y < N) {
            x = "";
            n = y;
            m = y;
            while (n <= N){
                x += " ";
                n ++;
        }
            while (m > 0) {
                x += "*";
                m --;
            }
            System.out.println(x);
            y ++;
        }
    }

    void main() {
        starTriangle(7);
    }
}
