import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
    public String  myTest(){
        String classPath = this.getClass().getClassLoader().getResource("").getPath();
        return classPath;
    }

    public static void main(String[] args) throws UnknownHostException {
        Test test= new Test();
        String str = test.myTest();
        System.out.println(str);
        long long1 = 1700;
        long long2 = 3899;
        double dou = 100 * long1 / long2;
        System.out.println(dou);
        InetAddress add = InetAddress.getLocalHost();
        String ip = add.getHostAddress().toString();
        System.out.println(ip);
        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("a", "1");
        map1.put("b", "2");
        map1.put("c", "3");
        map1.put("d", "4");
//        map1.put(null, "null1");

        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("e", "33");
        map2.put("f", "44");
        map2.put("g", "5");
        map2.put("h", "6");
//        map2.put(null, "null2");

        Map<String,String> map3 = new HashMap<String,String>();
        map3.putAll(map1);
        // map2中含有和map1中相同的key，那么执行如下方法之后
        // map2中的值会覆盖掉map1中的值
        map3.putAll(map2);
        System.out.println(map3);
//        for (Entry<String,String> entry : map3.entrySet()) {
//            System.out.println(entry.getKey() + " ==== " + entry.getValue());
//        }
    }

}
