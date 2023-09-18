import dto.Cars;
import utils.UserInterface;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars(UserInterface.getCarsName());
        int turn = UserInterface.getPlayTurn();

        System.out.println("실행 결과");
        while (--turn >= 0) {
            cars.move();
            cars.printDistance();
            System.out.println();
        }
        UserInterface.printWinner(cars.getWinner());
    }
}
