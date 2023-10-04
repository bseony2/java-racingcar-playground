package game;

public class Car {
    private final Name name;

    public Car(String name) {
        this.name = new Name(name);
    }

    public String getCarName() {
        return this.name.getName();
    }
}
