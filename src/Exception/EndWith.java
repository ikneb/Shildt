package Exception;

/**
 * Created by Benki on 14.03.2016.
 */
public class EndWith {


        public static void main(String args[]){
            String Str = new String("This is really not immutable!!");
            boolean retVal;

            retVal = Str.endsWith( "immutable!!" );
            System.out.println("Returned Value = " + retVal );

            retVal = Str.endsWith( "immu" );
            System.out.println("Returned Value = " + retVal );

            retVal = Str.endsWith( "e!" );
            System.out.println("Returned Value = " + retVal );




        }
    }

