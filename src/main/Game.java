package main;

public class Game {
    static int numberOfSticksOnTable = 20;

    public static void main(String args[]) {
        ComputerLogic computer = new ComputerLogic();
        Player player = new Player("Player");
        MessageOutput messageOutput = new MessageOutput();
        messageOutput.startGame();
        messageOutput.NumberOfSticksOnTable();
        while (true) {
            messageOutput.nextPlayerName(computer.getName());
            numberOfSticksOnTable -= computer.getNumberOfSticksForMove(numberOfSticksOnTable);
            messageOutput.NumberOfSticksOnTable();
            if (numberOfSticksOnTable == 1) {
                messageOutput.endOfGame(computer.getName());
                break;
            }
            messageOutput.nextPlayerName(player.getName());
            numberOfSticksOnTable -= player.getNumberOfSticksForMove();
            messageOutput.NumberOfSticksOnTable();
        }
    }
}
