package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {

    @Test
    @DisplayName("초기 거리는 0임")
    void initialPositionIsZero() {
        Position position = new Position();
        assertThat("").isEqualTo(position.getPosition());
    }

    @Test
    @DisplayName("position의 크기만큼 - 반환")
    void printDistance() {
        Position position = new Position(4);
        assertThat("----").isEqualTo(position.getPosition());
    }

    @Test
    @DisplayName("전진하는 자동차 출력")
    void getCarPositionTest() {
        Car car = new Car("car", 4);
        assertThat("car : ----").isEqualTo(car.getCarPosition());

        Car car1 = new Car("배선영", 7);
        assertThat("배선영 : -------").isEqualTo(car1.getCarPosition());
    }
}