import game.Car;
import game.Cars;
import utils.Splitter;
import utils.UserInterface;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RacingMain {
    static Scanner sc = new Scanner(System.in);
    static final String SPLITTER_FLAG = ",";
    static Cars racingCars;
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            getCars();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            getCars();
        }


        UserInterface.getTurn();
        int T = sc.nextInt();

        System.out.println("실행 결과");
        for(int i=0; i<T; i++) {
            racingCars.move();
            racingCars.printCarPosition();
            System.out.println();
        }

        UserInterface.printWinners(racingCars.getWinners());
    }

    private static void getCars() {
        UserInterface.getCars();
        String input = sc.next();

        Splitter splitter = new Splitter(SPLITTER_FLAG);
        List<String> names = splitter.split(input);
        List<Car> cars = names.stream().map(Car::new).collect(Collectors.toList());

        racingCars = new Cars(cars);
    }
}
