package utils;

import game.Car;

import java.util.List;
import java.util.stream.Collectors;

public class UserInterface {
    public static void getCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void getTurn() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printWinners(List<Car> winners) {
        String winnersNames = winners.stream().map(Car::getCarName).collect(Collectors.joining(", "));
        System.out.println(winnersNames + "가 최종 우승했습니다.");
    }
}
