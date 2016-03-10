package Exception;

/**
 * Created by Benki on 09.03.2016.
 */
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
};

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println(ap);
        System.out.println();
        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println("Переменная ар содержит GoldenDel.\n");
        //применить перечисление для управления оператором swich.

        switch (ap) {
            case Jonathan:
                System.out.println("сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("сорт GoldenDel желтый");
                break;
            case RedDel:
                System.out.println("сорт RedDel красный");
                break;
            case Winesap:
                System.out.println("сорт Winesap красный");
                break;
            case Cortland:
                System.out.println("сорт Cortland красный");
                break;

        }

    }
}
