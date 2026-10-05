import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 声明一个类型的L,创建一个ArrayList<String>的实例,将地址返回给L
        List<String> L = new ArrayList<>();
        // 调用add方法存入一个数据
        L.add("a");
        L.add("b");
        // 使用get方法获取对应的数据
        System.out.println(L.get(0));
        String x = L.get(0);
    }
}
