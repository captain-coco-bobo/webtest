import java.text.DecimalFormat;
import java.util.*;

public class sortTest {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("aaa",38.93);
        map.put("还是",98.93);
        map.put("还是是",100.0);
        map.put("125",08.93);
        map.put("127",08.93);
        System.out.println("111"+map);

        map = sortTest.sortByComparator(map);
        System.out.println("222"+map);


        String t1 = "100";
        String t2 = "80";
        int result = t1.compareTo(t2);
        System.out.println(result);
        DecimalFormat df=new DecimalFormat("0.00");

        long a = 200;
        long b = 3;
        System.out.println(df.format((double) a/b));
        System.out.println((double) a/b);

    }
    public static Map sortByComparator(Map unsortMap){
        List list = new LinkedList(unsortMap.entrySet());
// System.out.println("list:"+list);
        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });
        Map sortedMap = new LinkedHashMap();

        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry)it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;

    }
}
