package main;

public class MessageOutput {
    void startGame() {
        System.out.println("Игра началась!");
    }

    void NumberOfSticksOnTable() {
        System.out.println("На столе осталось " + Game.numberOfSticksOnTable + " спичек");
    }

    void nextPlayerName(String name) {
        System.out.print("-Следующий ход выполняет " + name + ". Количество выбраных спичек = ");
    }

    void endOfGame(String name) {
        System.out.println("Игра окончена!");
        System.out.println("Победитель: " + name);
    }
}
