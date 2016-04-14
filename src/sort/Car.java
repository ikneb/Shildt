package sort;

/**
 * Created by Benki on 14.04.2016.
 */
public class Car implements Comparable<Car> {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
