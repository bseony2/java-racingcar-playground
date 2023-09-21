package dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars implements Iterable<Car>{
    private List<Car> cars;
    static final int MAX_DIS = 9;

    public Cars(List<String> cars) {
        this.cars = new ArrayList<>();
        for(String name : cars) {
            Car car = new Car(name);
            this.cars.add(car);
        }
    }


    @Override
    public Iterator<Car> iterator() {
        return this.cars.iterator();
    }

    public void move() {
        Random random = new Random();
        for(Car car : this.cars) {
            int dis = random.nextInt(MAX_DIS);
            car.move(dis);
        }
    }

    public void printDistance() {
        for(Car car : this.cars) {
            car.printDistance();
            System.out.println();
        }
    }

    public List<String> getWinner() {
        int maxDis = this.cars.stream().mapToInt(Car::getDistance).max().orElse(Integer.MAX_VALUE);

        return this.cars.stream()
                .filter(car -> car.getDistance() == maxDis)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
