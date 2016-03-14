package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Benki on 11.03.2016.
 */
public class TextReader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = reader.readLine();
            if (arr[i].equals("stop")) break;
        }

        for (String a : arr) {
            System.out.println(a);
            if (a.equals("stop")) break;
        }

    }
}
