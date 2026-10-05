public class DoubleUp {
    /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
    public static String doubleUp(String s) {
        String letter = "";

        for (int i = 0; i < s.length();i++) {
            char cp = s.charAt(i);
            letter += "" + cp + cp;
        }
        return letter;
    }

    void main() {
        String s = doubleUp("hello");
        IO.println(s);

        IO.println(doubleUp("cat"));
    }
}
