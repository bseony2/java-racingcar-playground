package dto;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<String> cars) {
        this.cars = new ArrayList<>();
        for(String name : cars) {
            Car car = new Car(name);
            this.cars.add(car);
        }
    }
}
