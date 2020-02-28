package main;


public class ComputerLogic {
    private String name = "Computer";

    int getNumberOfSticksForMove(int numberOfSticks) {
        if (numberOfSticks % 4 == 0) {
            System.out.println("3");
            return 3;
        } else if (numberOfSticks % 2 == 0) {
            System.out.println("1");
            return 1;
        } else {
            System.out.println("2");
            return 2;
        }
    }

    public String getName() {
        return name;
    }
}
