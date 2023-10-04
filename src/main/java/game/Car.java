package game;

import utils.MovingStrategy;

import java.util.Objects;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public String getCarName() {
        return this.name.getName();
    }

    public String printCarPosition() {
        return getCarName() + " : " + this.position.printPosition();
    }

    public int getCarPosition() {
        return position.getPosition();
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()) this.position.move();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
