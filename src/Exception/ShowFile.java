package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Benki on 11.03.2016.
 */
public class ShowFile {
    public static void main(String[] args) {

        FileInputStream fil  = null;
        try {
            fil = new FileInputStream("E:/data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            while(fil.available()>0){
                System.out.println(fil.read());
            }
        } catch (IOException e) {
            System.out.println("FileNotFound");
        }finally {
            try {
                fil.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
