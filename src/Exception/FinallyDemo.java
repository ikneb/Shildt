package Exception;

/**
 * Created by Benki on 23.02.2016.
 */
public class FinallyDemo {

    static void procA() {
        try {
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Body finally method procA");
        }

    }

    static void procB() {
        try {
            System.out.println("Body try method procB");
            return;
        } finally {
            System.out.println("Body finally method procB");
        }
    }

    static void procC() {
        try {
            System.out.println("Body try method procC");
        } finally {
            System.out.println("Body finally method procC");
        }

    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (RuntimeException e){
            System.out.println("Exception intercepted");
        }
        procB();
        procC();
    }
}
