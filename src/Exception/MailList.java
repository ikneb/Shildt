package Exception;

import java.util.LinkedList;

/**
 * Created by Benki on 24.02.2016.
 */
class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n,String s,String c,String st,String cd){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString(){
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}


public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W. West","Sverdlova avenu","Parafiyvka", "Ukrain", "61103"));
        ml.add(new Address("J.W. Best","Derevanko avenu","Parafiyvka", "Ukrain", "61103"));
        ml.add(new Address("J.W. Nak","Balakireva avenu","Parafiyvka", "Ukrain", "61103"));
        ml.add(new Address("J.W. Srak","Sevastopolska avenu","Parafiyvka", "Ukrain", "61103"));
        ml.add(new Address("J.W. Tik","Lenina avenu","Parafiyvka", "Ukrain", "61103"));
        ml.add(new Address("J.W. Aper","Shevchenka avenu","Parafiyvka", "Ukrain", "61103"));

        for(Address element: ml) System.out.println(element + "\n");

        System.out.println();

    }
}
