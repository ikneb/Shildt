package sort;

import java.util.Comparator;

/**
 * Created by Benki on 14.04.2016.
 */
public class CarSortName implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.compareTo(car2);
    }
}
