package dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class CarsTest {

    @Test
    void getWinner() {
        String[] names = new String[]{"bai", "sun", "young"};
        Cars cars = new Cars(Arrays.asList(names));

        for(Car car : cars) {
            if("bai".equals(car.getName())) {
                car.setDistance(5);
            }

            if("sun".equals(car.getName())) {
                car.setDistance(3);
            }

            if("young".equals(car.getName())) {
                car.setDistance(5);
            }
        }

        List<String> winners = cars.getWinner();
        assertThat(winners.get(0)).isEqualTo("bai");
        assertThat(winners.get(1)).isEqualTo("young");
    }
}