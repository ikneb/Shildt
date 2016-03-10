package Exception;

/**
 * Created by Benki on 29.02.2016.
 */
class iDemo implements Runnable {
    Thread t;
    String name;

    iDemo(String nameThread) {
        name = nameThread;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Star daughter thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted daughter thread");
        }
        System.out.println("Stop daughter thraed");
    }

}


public class Demo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Start home tread: " + t);
        new iDemo("first");
        new iDemo("second");
        new iDemo("third");

        try{
            for(int i = 5;i>0;i--){
                System.out.println("Home thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted home tread");
        }
        System.out.println("Stop home thread");
    }
}
