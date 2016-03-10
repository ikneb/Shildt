package Exception;

/**
 * Created by Benki on 09.03.2016.
 */

enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
};

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        Apple allApple[] = Apple.values();
        for(Apple a: allApple){
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println(ap);
    }
}
