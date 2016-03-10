package Exception;

/**
 * Created by Benki on 29.02.2016.
 */
class NewThread1 implements Runnable {
    Thread t;
    String name;

    NewThread1(String nameThraed) {
        name = nameThraed;
        t = new Thread(this, name);
        System.out.println("Start new traed: " + name);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread: " + name + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread: " + name);
        }
        System.out.println("Stop thread: " + name);

    }
}

public class JoinDemo {
    public static void main(String[] args) {

        NewThread1 ob1 = new NewThread1("first");
        NewThread1 ob2 = new NewThread1("second");
        NewThread1 ob3 = new NewThread1("third");

        System.out.println("Thread first launched :" + ob1.t.isAlive());
        System.out.println("Thread second launched: " + ob2.t.isAlive());
        System.out.println("Thread third launched: " + ob3.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted tread");
        }

        System.out.println("Check thread: " + ob1.t.isAlive());
        System.out.println("Check thread: " + ob2.t.isAlive());
        System.out.println("Check thread: " + ob3.t.isAlive());
    }
}
