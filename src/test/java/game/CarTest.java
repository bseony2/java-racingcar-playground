package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    @DisplayName("자동차 생성")
    void carGenerate() {
        Car car = new Car("배선영");
        assertThat("배선영").isEqualTo(car.getCarName());
    }

    @Test
    @DisplayName("이름이 5글자일 경우 에러")
    void tooLongCarNameError() {
        assertThatThrownBy(() -> new Car("다섯글자초과"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름은 5글자를 초과할 수 없습니다");
    }
}
