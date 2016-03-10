package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Benki on 04.03.2016.
 */
public class Exampl {
    public static void main(String[] args) throws Exception{


            FileInputStream inputStream = new FileInputStream("E:/data.txt");


        int sum =0;
        while(inputStream.available()>0){
            int data = inputStream.read();
            sum += data;

        }
        inputStream.close();
        System.out.println(sum);
    }
}
