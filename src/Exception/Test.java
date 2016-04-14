package Exception;

import java.util.*;

/**
 * Created by Benki on 13.04.2016.
 */
public class Test {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
