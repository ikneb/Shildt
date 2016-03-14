package Exception;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by Benki on 10.03.2016.
 */

//обьявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}
public class Meta {
    //аннотировать метод
    @MyAnno(str = "ПРимер аннотации", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        //получить аннотацию из метода
        //и вывести значение ее членов
        try {
            //сначала получить обьект типа Class
            //представляющий данный класс
            Class<?> c = ob.getClass();
            //затем получить обьект типа Method
            //представляющий данный метод
            Method m = c.getMethod("myMeth");

            //далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);
            //и наконец вывести значение членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        }catch(NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }

        }

    public static void main(String[] args) {
        myMeth();
    }
    }

