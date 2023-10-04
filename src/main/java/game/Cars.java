package game;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getWinners() {
        int maxDistance = getMaxDistance();
        return this.cars.stream()
                    .filter(car -> car.getCarPosition() == maxDistance)
                    .collect(Collectors.toList());
    }

    private int getMaxDistance() {
        return cars.stream().mapToInt(Car::getCarPosition).max().orElse(0);
    }
}
