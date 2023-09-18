package utils;

import java.util.List;

public class InputValidations {
    public static boolean carNameValidation(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름의 길이는 5를 초과할 수 없습니다.");
        }
        return true;
    }

    public static boolean carNamesValidation(List<String> names) {
        for(String name : names) {
            carNameValidation(name);
        }
        return true;
    }
}
