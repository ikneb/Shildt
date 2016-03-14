package Exception;

import java.io.PrintWriter;

/**
 * Created by Benki on 11.03.2016.
 */
public class PrintWritenDemo  {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        int a = 34;
        double c = 4.5e-7;
        pw.println(a);
        pw.println(c);
    }
}
