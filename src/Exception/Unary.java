package Exception;

/**
 * Created by Benki on 26.02.2016.
 */
public class Unary {
    public static void main(String[] args) {
        int i = 2;
        i += i++ + ++i*i++;
        System.out.println(i);
    }
}
