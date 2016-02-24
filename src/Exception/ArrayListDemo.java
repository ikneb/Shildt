package Exception;

import java.util.ArrayList;

/**
 * Created by Benki on 23.02.2016.
 */
public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size());

        list.add("b");
        list.add("c");
        list.add("d");
        list.add(1,"a2");
        System.out.println(list);
        System.out.println(list.size());

        list.remove(1);
        list.remove("c");
        System.out.println(list.size());
        System.out.println(list);
        //Creat array and add there collection
        String array[] = new String[list.size()];
        array = list.toArray(array);

    }
 }
