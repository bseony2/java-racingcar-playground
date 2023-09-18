package utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UserInterfaceTest {

    @Test
    void printWinner() {
        ArrayList<String> winners = new ArrayList<>();
        winners.add("car11");
        winners.add("car13");
        winners.add("car");
        UserInterface.printWinner(winners);
    }
}