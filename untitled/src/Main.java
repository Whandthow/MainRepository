import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2,4,"Car1",100);
        System.out.println(Car.getCountOfCars());

        Car car2 = new Car(1,4,"Car2",220);
        System.out.println(Car.getCountOfCars());

        Car car3 = new Car(5,4,"Car3",350);
        System.out.println(Car.getCountOfCars());

        System.out.println(car.getTotalDistance()+" км Car1");
        System.out.println(car2.getTotalDistance()+" км Car2");
        System.out.println(car3.getTotalDistance()+" км Car3");
    }
}