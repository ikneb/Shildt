package sort;

import sort.Car;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Benki on 14.04.2016.
 */
public class Start {
  private static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        Car car1 = new Car("Niva",1990);
        Car car2 = new Car("BMW",2013);
        Car car3 = new Car("Opel",1999);
        Car car4 = new Car("Zaz",2001);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

//        Collections.sort(cars);


        /*CarSortName carSortName = new CarSortName();
        Collections.sort(cars,carSortName);
        */

        CarSortYear carSortYear = new CarSortYear();
        Collections.sort(cars,carSortYear);

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car.getName()+" "+ car.getYear());
        }



    }

}
