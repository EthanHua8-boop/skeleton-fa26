import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // 声明一个Map<String, String>类型的L, 创建一个TreeMap<>()的实例，将地址返回给L
        Map<String, String> L = new TreeMap<>();
        // 使用put方法存入数据
        L.put("dog", "woof");
        L.put("cat", "meow");
        // 使用get方法获取对应的key的数据
        String sound = L.get("cat");
    }
}
