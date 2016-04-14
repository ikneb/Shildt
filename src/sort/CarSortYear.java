package sort;

import java.util.Comparator;

/**
 * Created by Benki on 14.04.2016.
 */
public class CarSortYear implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer year1 = new Integer(car1.getYear());
        Integer year2 = new Integer(car2.getYear());
        return year1.compareTo(year2);
    }
}
