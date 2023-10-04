package game;

import utils.MovingStrategy;

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

    public String getCarPosition() {
        return getCarName() + " : " + this.position.getPosition();
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()) this.position.move();
    }
}
