package Exception;

/**
 * Created by Benki on 10.03.2016.
 */
enum Apple4 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo4 {
    public static void main(String[] args) {
        for (Apple4 a : Apple4.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        Apple4 ap = Apple4.RedDel;
        Apple4 ap1 = Apple4.GoldenDel;
        Apple4 ap3 = Apple4.RedDel;

        if (ap.compareTo(ap1) < 0) System.out.println(ap + " предшествует " + ap1);
        if (ap.compareTo(ap1) > 0) System.out.println(ap + " предшествует " + ap1);
        if (ap.compareTo(ap3) == 0) System.out.println(ap + " равно " + ap3);
        if (ap.equals(ap1)) System.out.println("Excepton");
        if (ap.equals(ap3)) System.out.println(ap + " равно " + ap3);
        if (ap == ap3) System.out.println(ap + " == " + ap3);
    }

}
