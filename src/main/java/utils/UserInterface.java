package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static Scanner sc= new Scanner(System.in);
    public static List<String> getCarsName() {
        List<String> result = null;
        try {
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            String s = sc.nextLine();
            result = Arrays.asList(s.split(","));
            InputValidations.carNamesValidation(result);
        }
        catch (Exception e) {
            System.out.println( e.getMessage() + " 입력값을 확인해주십시오.");
            getCarsName();
        }
        return result == null ? new ArrayList<>() : result;
    }

    public static int getPlayTurn() {
        int cnt = 0;
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            cnt = sc.nextInt();
        }
        catch (Exception e) {
            System.out.println( e.getMessage() + " 입력값을 확인해주십시오.");
            getPlayTurn();
        }
        return cnt;
    }

    static public void printWinner(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        for(String name : winners) {
            sb.append(name).append(", ");
        }

        sb.delete(sb.length()-2, sb.length());
        System.out.println(sb.toString() + "가 최종 우승했습니다.");
    }
}
