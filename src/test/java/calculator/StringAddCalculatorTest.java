package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class StringAddCalculatorTest {
    @Test
    @DisplayName("빈문자 집어넣은 경우")
    void splitAndSum_null_or_blank(){
        int result = StringAddCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);

        result = StringAddCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자 하나 입력")
    void splitAndSum_single_char(){
        String s = "3";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(3);

        s = "123123";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(123123);

        s = "23333";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(23333);
    }

    @Test
    @DisplayName("쉼표 구분자 입력")
    void commaSeperatedInput(){
        String s = "3,2";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(5);

        s = "123123,3";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(123126);

        s = "23333,333";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(23666);
    }

    @Test
    @DisplayName("콜론 구분자 입력")
    void colonSeperatedInput(){
        String s = "3:2";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(5);

        s = "123123:3";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(123126);

        s = "23333:333";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(23666);
    }

    @Test
    @DisplayName("콜론과 쉼표 구분자 입력")
    void colonAndcommaSeperatedInput(){
        String s = "3:2,10";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(15);

        s = "123,125:3";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(251);

        s = "2,3:333";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(338);
    }

    @Test
    @DisplayName("커스텀 구분자 입력")
    void customSeperatedInput(){
        String s = "//;\n3:2,10";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(15);

        s = "123,125:3";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(251);

        s = "2,3:333";
        assertThat(StringAddCalculator.splitAndSum(s)).isEqualTo(338);
    }

    @Test
    @DisplayName("음수 입력")
    void minusInput() {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("//;\n3:2,-10"))
                .isInstanceOf(RuntimeException.class);

        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("123,-125:3"))
                .isInstanceOf(RuntimeException.class);

        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("-2,3:333"))
                .isInstanceOf(RuntimeException.class);
    }
}