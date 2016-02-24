package Exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Benki on 24.02.2016.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");


        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");

        }
        System.out.println();

            ListIterator<String> listIter = list.listIterator();
            while (listIter.hasNext()){
                String  element = listIter.next();
                System.out.print(element + "+ ");


            }

        System.out.println();

        itr = list.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");


        }
        System.out.println();


        while (listIter.hasPrevious()){
            String element = listIter.previous();
            System.out.print(element + " ");
        }


        }
    }
