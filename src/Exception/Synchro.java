package Exception;

/**
 * Created by Benki on 29.02.2016.
 */
class Callme1 {
    void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }

    class Caller1 extends Thread {
        String msg;
        Callme1 target;

        Caller1(Callme1 targ, String st) {
            super(st);
            target = targ;
            msg = st;
            start();

        }


        @Override
        public void run() {
            synchronized (target){
                target.call(msg);
            }
        }
    }
}

public class Synchro {
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
