package Exception;

/**
 * Created by Benki on 23.02.2016.
 */
public class ThrowsDemo {
    static void throwsOne() throws IllegalAccessException{
        System.out.println("Втеле метода throwsOne()");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwsOne();
        } catch (IllegalAccessException e) {

        }
    }
}
