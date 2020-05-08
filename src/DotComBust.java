import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom dot_p = new DotCom();
        dot_p.setName("P.com");
        DotCom dot_q = new DotCom();
        dot_q.setName("P.com");
        DotCom dot_s = new DotCom();
        dot_s.setName("P.com");
        dotComsList.add(dot_q);
        dotComsList.add(dot_p);
        dotComsList.add(dot_s);

        for (DotCom dotComSet : dotComsList) {
            dotComSet.setLocationCells(helper.placeDotCom(3));
        }

        System.out.println("enter number to hit com");
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("enter your guess: ");
            String result = checkUserGuess(userGuess);
            System.out.println(result);
        }
        finishGame();

    }

    private String checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComSet : dotComsList) {
            String guessResult = dotComSet.checkYourself(userGuess);
            if (guessResult.equals("hit")) {
                result = guessResult + " " + dotComSet.getName();
                break;
            } else if (guessResult.equals("kill")) {
                result = guessResult + " " + dotComSet.getName();
                dotComsList.remove(dotComSet);
                break;
            }
        }
        return result;
    }

    private void finishGame() {
        System.out.println("Game Over");
        System.out.println("You Guess " + numOfGuesses + "times");
        if (numOfGuesses <= 16) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Regret");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
