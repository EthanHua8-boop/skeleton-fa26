public class ArrayBasic2 {
    public static void main(String[] args) {
        // 这里int[][]的意思是，有一个装int[]的[]
        int[][] pascalsTriangle;
        // 但在这里实例化的逻辑是由外层到内层,而非int[][4]这种和int[][]声明同一个逻辑
        // 准确来说，你得把int[][]的实例化理解成一个独特的构造器,他先构造外层,再构造里层
        pascalsTriangle = new int[4][];
        int[] rowZero = pascalsTriangle[0];

        // 在使用数组非构造器的[index]语法时,可以理解为为一个不需要dot引用的变量,*在这里的使用和构造器的语法是不同的
        // 而对于{}方法可以理解为一种批量把index(非静态变量),绑定到某个值封装，也需要用new 关键词
        pascalsTriangle[0] = new int[]{1};
        pascalsTriangle[1] = new int[]{1, 1};
        pascalsTriangle[2] = new int[]{1, 2, 1};
        pascalsTriangle[3] = new int[]{1, 3, 3, 1};
        // 这里的赋值语句右侧的[index],也是用index表示变量的方法,没有new来声明，但是做了相同的操作
        int[] rowTwo = pascalsTriangle[2];
        rowTwo[1] = -5;

        int[][] matrix;
        matrix = new int[4][];
        matrix = new int[4][4];

        int[][] pascalAgain = new int[][]{{1}, {1,1}, {1, 2, 1}, {1, 3, 3, 1}};

    }
}
