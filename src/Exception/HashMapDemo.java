package Exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Benki on 24.02.2016.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("D.V. Jeckson", new Double(2342.3));
        hm.put("M.B. Checkson", new Double(2542.3));
        hm.put("K.L. Sheckson", new Double(3442.3));

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());


        }
        double balans = hm.get("D.V. Jeckson");
        hm.put("D.V. Jeckson", balans + 1000);
        System.out.println(hm.get("D.V. Jeckson"));
    }
}
