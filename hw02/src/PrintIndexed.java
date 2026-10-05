public class PrintIndexed {
    /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
    public static void printIndexed(String s) {
        String count = "";
        int sLength = s.length();
        int num = sLength - 1;
        int x = 0;

        while (x < sLength) {
            char c = s.charAt(x);
            count = count + c + num;
            num--;
            x++;
        }
        System.out.println(count);
    }
    void main() {
        printIndexed("hello");
        printIndexed("cat"); // should print c2a1t0
    }
}
