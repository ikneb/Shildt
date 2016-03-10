package Exception;

/**
 * Created by Benki on 27.02.2016.
 */
class NewThreadsYet extends Thread{
    String name;

    NewThreadsYet(String namethread){
        super(namethread);
        name = namethread;
        System.out.println("Start  thread: " + this);
        start();
    }
    @Override

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupt " + name + " thread");
        }
        System.out.println("End " + name + " thread");

    }


}

public class AnyThreadsDemo {
    public static void main(String[] args) {
        new NewThreads("First");
        new NewThreads("Second");
        new NewThreads("Third");

        try{
            for(int i = 5;i > 0;i--) {
                System.out.println("Home thread: " + i);
                Thread.sleep(3000);
            }

        }catch (InterruptedException e){
            System.out.println("Interrupt home thread");
        }
        System.out.println("End home thread");

    }

}
