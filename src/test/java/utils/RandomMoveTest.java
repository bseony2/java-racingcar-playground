package utils;

import game.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RandomMoveTest {

    @Test
    @DisplayName("차량 전진")
    void carMove() {
        Car car = new Car("test", 2);
        car.move(() -> true);
        assertThat("---").isEqualTo(car.getCarPosition());
    }

    @Test
    @DisplayName("차량 전진")
    void carDontMove() {
        Car car = new Car("test", 2);
        car.move(() -> false);
        assertThat("--").isEqualTo(car.getCarPosition());
    }
}