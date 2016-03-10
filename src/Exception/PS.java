package Exception;

/**
 * Created by Benki on 29.02.2016.
 */
class Q{
    int n;
    synchronized int get(){
        System.out.println("Get : " + n);
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        System.out.println("Set: " + n);
    }
}

class  Produser implements Runnable{
    Q q;
    Produser(Q q){
        this.q = q;
        new Thread(this,"Provider").start();
    }

    @Override
    public void run() {
        int i = 0;

        while(true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted thread");
            }
            q.put(i++);

        }
    }
}
class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this,"consumer").start();
    }


    @Override
    public void run() {

        while(true){
            q.get();
        }
    }
}
public class PS {
    public static void main(String[] args) {
        Q q = new Q();
        new Produser(q);
        new Consumer(q);
    }
}
