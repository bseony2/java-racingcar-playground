package utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class InputValidationsTest {

    @Test
    void carNamesValidation() {
        List<String> names = new ArrayList<>();
        names.add("car1");
        names.add("car22");
        assertThat(InputValidations.carNamesValidation(names)).isTrue();
        names.add("longName");
        assertThatThrownBy(() -> InputValidations.carNamesValidation(names))
                .isInstanceOf(IllegalArgumentException.class);
    }
}