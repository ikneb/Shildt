package Exception;

/**
 * Created by Benki on 23.02.2016.
 */
public class Ex2 {
    public static void exThrow(){
        try{
            throw new NullPointerException("Demonstration");
        }catch(NullPointerException e){

            throw e;
        }

    }

    public static void main(String[] args) {
        try{
            exThrow();
        }catch (NullPointerException e){
            System.out.println("repeated interception");
        }
    }

}
