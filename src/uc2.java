import java.util.Random;
public class uc2 {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        Random rand = new Random();
        isHumanTurn = rand.nextBoolean();

        if (isHumanTurn) {
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human goes first.");
        } else {
            System.out.println("Computer goes first.");
        }

        System.out.println("Human symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }

}