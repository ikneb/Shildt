package Exception;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by Benki on 10.03.2016.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация текстового класса")
@MyAnno(str = "Anno", val = 99)
public class Anno {

    @What(description = "Аннотация текстового метода")
    @MyAnno(str = "Testing", val = 99)
    public static void myMeth() {
        Anno ob = new Anno();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            //выводим все аанотации для класса Anno
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            //вывести все аннотации для метода MyMeth
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            //все аннотации для метода MyMeth
            for (Annotation a : annos) System.out.println(a);
        }catch (NoSuchMethodException e){
            System.out.println("Метод не найден.");
        }

    }


    public static void main(String[] args) {
        myMeth();
    }
}
