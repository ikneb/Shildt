package Exception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Benki on 17.02.2016.
 */
public class MapTest {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("Murzic", "cat");
        map.put("Fozya","mouse");
        map.put("Barsik","dog");

        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry maps = iter.next();
            System.out.println(maps.getKey() + " " + maps.getValue());
        }
    }
}
