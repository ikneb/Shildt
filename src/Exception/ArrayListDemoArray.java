package Exception;

import java.util.ArrayList;

/**
 * Created by Benki on 23.02.2016.
 */
public class ArrayListDemoArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Integer array[] = new Integer[list.size()];
        array = list.toArray(array);

        int sum = 0;
        for (int i : array) sum += i;
        System.out.println(sum);

    }
}
