package Exception;

/**
 * Created by Benki on 25.03.2016.
 */
public class Main {


   /* public class TypesTutorial {*/
        public static void main(String... args) {
            A alpha = new B(0);
        }
    }

    class A {
        A(int x){            // - 1 -
            a(x);            // - 2 -
        }



        void a(int x) {
            System.out.println("A-a: " + x);
        }
    }

    class B extends A {
        B(int x) {
            super(x);
            // - 3 -
            a(x);            // - 4 -
        }

        void a(int x) {
            System.out.println("B-a: " + x);
        }
    }