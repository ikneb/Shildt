package Exception;

/**
 * Created by Benki on 23.02.2016.
 */
public class ChainExDemo {
    static  void demoproc()throws NullPointerException{
        NullPointerException e = new NullPointerException("Top Level");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Intercepted exception: " + e);
            System.out.println("Cause: " + e.getCause());
        }
    }
}

