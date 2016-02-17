package Exception;

/**
 * Created by Benki on 17.02.2016.
 */
public class Exc2 {
    public static void testExcep(){
        try {
            int a = 0;
            int b = 2 / a;
        }catch (Exception e){
            System.out.println("no zero");
        }
    }

    public static void main(String[] args) {
        testExcep();
    }
}
