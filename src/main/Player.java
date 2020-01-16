package main;

import java.util.Scanner;

public class Player {
    private String name;
    Scanner sc = new Scanner(System.in);

    int getNumberOfSticksForMove() {
        int number = sc.nextInt();
        if (number < 4 && number > 0) {
            return number;
        } else {
            System.out.println("Разрешено убирать от 1 до 3 спичек");
            return (getNumberOfSticksForMove());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
