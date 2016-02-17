package Exception;

/**
 * Created by Benki on 16.02.2016.
 */
public class Exception1 {
    public static void main(String[] args) {
        try {

            int a = 0;
            int d = 2 / a;
        }catch (Exception e){
            System.out.println("No zero");
        }
    }
}