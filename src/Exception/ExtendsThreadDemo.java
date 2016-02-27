package Exception;

/**
 * Created by Benki on 27.02.2016.
 */
class NewThreadDemo extends Thread {
    NewThreadDemo() {
        super("Демонстрационный поток");
        System.out.println("Демонстрационный поток запущен: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Демонстрационный поток");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Демонстрационный поток остановлен");
        }
        System.out.println("Демонстрационный поток закончен");
    }
}

public class ExtendsThreadDemo {
    public static void main(String[] args) {
        new NewThreadDemo();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток закончен");

    }
}
