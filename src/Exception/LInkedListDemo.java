package Exception;

import java.util.LinkedList;

/**
 * Created by Benki on 23.02.2016.
 */
public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("f");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("c");
        list.add("z");

        list.addFirst("a");
        list.add(1, "a2");
        System.out.println(list);

        list.remove("d");
        list.remove(1);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        String val = list.get(2);
        list.set(2, val + "cd");
        System.out.println(list);
    }
}
