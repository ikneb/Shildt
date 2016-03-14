package Exception;

/**
 * Created by Benki on 13.03.2016.
 */
class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class WrapperCat extends Cat {
     private Cat original;

    public WrapperCat(Cat cat) {
        this.original=cat;


    }

    public String getName() {
        return "ura" + original.getName();
    }

    public void setName(String name) {
        original.setName(name);

    }

}


public class Wrapper {
    public static void main(String[] args) {
        Cat cat = new Cat("vasya");
        System.out.println(cat.getName());
        Cat wrapp = new WrapperCat(cat);
        printName(wrapp);


    }

    public static void printName(Cat name) {
        System.out.println(name.getName());
    }


}