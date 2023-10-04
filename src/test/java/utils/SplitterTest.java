package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SplitterTest {

    @Test
    @DisplayName("쉼표로 잘 분리되는지 확인")
    void commaSeperateTest() {
        Splitter splitter = new Splitter(",");
        Assertions.assertThat(Arrays.asList("수박", "참외", "포도")).containsAll(splitter.split("수박,포도,참외"));
        Assertions.assertThat(Arrays.asList("수박", "참외", "포도")).containsAll(splitter.split("수박,참외,포도"));
    }

    @Test
    @DisplayName(",: 분리 확인")
    void commaAndColonSeperateTest() {
        Splitter splitter = new Splitter(",:");
        Assertions.assertThat(Arrays.asList("수박", "참외", "포도")).containsAll(splitter.split("수박,포도:참외"));
        Assertions.assertThat(Arrays.asList("수박", "참외", "포도")).containsAll(splitter.split("수박:참외,포도"));
    }
}