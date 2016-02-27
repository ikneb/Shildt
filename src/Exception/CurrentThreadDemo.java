package Exception;

/**
 * Created by Benki on 27.02.2016.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);
        t.setName("My Thread");
        System.out.println("После изменения потока: " + t);
        for(int i =5;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Главный поток исполнения прерван");
            }
        }
    }
}
