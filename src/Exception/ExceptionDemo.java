package Exception;


/**
 * Created by Benki on 23.02.2016.
 */

class MyException extends Exception {
    private int detali;

    MyException(int a) {
        detali = a;
    }

    @Override
    public String toString() {
        return "MyException{" + "detali=" + detali + '}';
    }
}


public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Cause method compute(" + a + ")");
        if (a > 10) throw new MyException(a);
        System.out.println("norm complete");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(12);
        }catch (MyException e){
            System.out.println("Intercepted exception: " + e);
        }
    }

}
