package Exception;

/**
 * Created by Benki on 29.02.2016.
 */
class NewThread2 extends Thread {
    String name;

    NewThread2(String nameThread) {
        super(nameThread);
        name = nameThread;
        System.out.println("Start new thread: " + name);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            System.out.println("Interrupted tread");
        }

    }
}

public class IsAliveDemo {
    public static void main(String[] args) {

        NewThread2 ob1 = new NewThread2("first");
        NewThread2 ob2 = new NewThread2("second");
        NewThread2 ob3 = new NewThread2("third");

        System.out.println("Thread " + ob1.name + " launch: " + ob1.isAlive());
        System.out.println("Thread " + ob2.name + " launch: " + ob2.isAlive());
        System.out.println("Thread " + ob3.name + " launch: " + ob3.isAlive());

        try {
            ob1.join();
            ob2.join();
            ob3.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted  thread");
        }
        System.out.println("Thread " + ob1.name + " check: " + ob1.isAlive());
        System.out.println("Thread " + ob2.name + " check: " + ob2.isAlive());
        System.out.println("Thread " + ob3.name + " check: " + ob3.isAlive());


    }

}
