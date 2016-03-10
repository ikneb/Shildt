package Exception;

/**
 * Created by Benki on 09.03.2016.
 */
enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple3(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println(Apple3.Winesap.getPrice());

        for (Apple3 a : Apple3.values()) {
            System.out.println( a + " price: " + a.getPrice());
        }
    }
}
