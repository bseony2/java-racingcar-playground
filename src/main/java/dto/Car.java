package dto;

import java.util.Objects;

public class Car {
    private String name;
    private int distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void printDistance() {
        System.out.print(this.name + " : ");
        for(int i=0; i<this.distance; i++) {
            System.out.print("-");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Car)) return false;
        return ((Car) obj).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
