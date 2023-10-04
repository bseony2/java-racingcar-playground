package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class CarsTest {
    @Test
    @DisplayName("우승자 확인")
    void carsGenerate() {
        Car car1 = new Car("미국", 3);
        Car car2 = new Car("중국", 2);
        Car car3 = new Car("일본", 1);
        Car car4 = new Car("콩고", 3);

        Cars cars = new Cars(Arrays.asList(car1, car2, car3, car4));
        assertThat(cars.getWinners()).containsExactly(car1, car4);

    }
}