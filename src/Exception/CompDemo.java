package Exception;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Benki on 24.02.2016.
 */

class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String aStr = a;
        String bStr = b;
        return bStr.compareTo(aStr);
    }
}


public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("C");

        for (String element:ts) {
            System.out.println(element + " ");
            System.out.println();

        }
    }

}
