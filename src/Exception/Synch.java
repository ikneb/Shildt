package Exception;

/**
 * Created by Benki on 29.02.2016.
 */
class Callme {
    public synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    Caller(Callme targ, String st) {
        msg = st;
        target = targ;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);

    }
}

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();

        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "peace");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}