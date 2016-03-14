package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Benki on 11.03.2016.
 */
public class ReaderFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*String br="";
        while (!br.equals("q")) {
            br = reader.readLine();

        }
        System.out.println(")))next");
        char c;
        do{
            c = (char) reader.read();
        }while (c != 'q');*/
        String stop;
       do{
           stop = reader.readLine();
       }while (!stop.equals("stop"));
    }
}
