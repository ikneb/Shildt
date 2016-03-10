package Exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Benki on 04.03.2016.
 */
public class InputOutput {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream("E:/data.txt");
        FileOutputStream outputStream = new FileOutputStream("E:/out.txt");

        while(inputStream.available()>0){
            int read = inputStream.read();
            outputStream.write(read);
        }
        inputStream.close();
        outputStream.close();
    }
}
