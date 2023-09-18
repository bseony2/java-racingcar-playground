package game;

import dto.Car;
import dto.Cars;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
public class CarTest {

    private ByteArrayOutputStream outputStreamCaptor;
    private PrintStream standardOut; // 표준 스트림
    @BeforeEach
    void setUp() {
        standardOut = System.out;
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    protected void printResult() {
        System.setOut(standardOut); // 표준 스트림 할당
        System.out.println(getOutput()); // 원하는 내용이 잘 나왔는지 문자열 디코딩 바이트를 가져와 출력
    }

    @Test
    void carTest() {
        Car car;
        car = new Car("car12");
        assertThat(car.getName()).isEqualTo("car12");
        assertThat(car).isEqualTo(new Car("car12"));
    }

    @Test
    void distanceTest() {
        Car car = new Car("Test");
        car.setDistance(5);
        car.printDistance();
        assertThat(getOutput()).isEqualTo("Test : -----");
    }

    @Test
    void moveTest() {
        String[] names = new String[]{"a", "b", "c", "d"};
        Cars cars = new Cars(Arrays.asList(names));

        int dis = 2;
        for(Car car : cars) {
            car.move(dis);
            if(dis < 4) {
                assertThat(car.getDistance()).isEqualTo(0);
            }
            else if(dis >= 4) {
                assertThat(car.getDistance()).isEqualTo(dis);
            }
            dis += 1;
        }
    }

    String getOutput() {
        return this.outputStreamCaptor.toString();
    }
}
