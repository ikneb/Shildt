package Exception;

import java.util.ArrayList;

/**
 * Created by Benki on 24.02.2016.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 0;
        for(int i: list){
            sum += i;
        }
        System.out.println(sum);
     }
}
