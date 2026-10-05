public class ArrayBasics {
    public static void main(String[] args) {
        int[] z = null;
        int[] x, y;

        x = new int[] {1, 2, 3, 4, 5};
        y = x;
        x = new int[] {-1, 2, 5, 4, 69};
        // 在使用数组的构造器时，int[]可以看作在[]中输入变量的特殊构造器
        // []的输入决定了加入多少个非静态变量，并用index界定了变量名，虽然没有事先声明所有的变量类型
        y = new int[3];
        z = new int[0];
        int xL = x.length;

        String[] s = new String[6];
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins";

        int[] b = {9, 10, 11};
        System.arraycopy(b, 0, x, 3, 2);
    }
}
