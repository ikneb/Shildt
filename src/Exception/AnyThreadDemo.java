package Exception;

/**
 * Created by Benki on 27.02.2016.
 */
class NewThreads implements Runnable {
    String name;
    Thread t;

    NewThreads(String nameThread) {
        name = nameThread;
        t = new Thread(this, name);
        System.out.println("Start  thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " thread: " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupt " + name + " thread");
        }
        System.out.println("End " + name + " thread");

    }
}


public class AnyThreadDemo {
    public static void main(String[] args) {
        new NewThreads("First");
        new NewThreads("Second");
        new NewThreads("Third");

        try{
            for(int i = 5;i > 0;i--) {
                System.out.println("Home thread: " + i);
                Thread.sleep(10000);
            }

        }catch (InterruptedException e){
            System.out.println("Interrupt home thread");
        }
        System.out.println("End home thread");

    }
}
