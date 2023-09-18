package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static Scanner sc = new Scanner(System.in);
    static void getCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        try {
            String input = sc.nextLine();
            InputValidations.carNamesValidation(Arrays.asList(input.split(",")));
        }
        catch (Exception e) {
            System.out.println( e.getMessage() + " 입력값을 확인해주십시오.");
            getCarsName();
        }
    }
}
