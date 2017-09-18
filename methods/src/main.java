/**
 * Created by TFA on 12/09/2017.
 */
public class main {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        int highscore = calculateScore(true, 1000, 8, 200);
        System.out.println(highscore);

        highscore = calc(1500);
        displayHighScorePosition("tim", highscore);

        highscore = calc(900);
        displayHighScorePosition("bob", highscore);

        highscore = calc(400);
        displayHighScorePosition("percy", highscore);

        highscore = calc(50);
        displayHighScorePosition("gilbert", highscore);
    }

    public static int calculateScore(boolean gameOver,
                                     int score,
                                     int levelcompleted,
                                     int bonus) {

        if (gameOver) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 10000;
            System.out.println(finalscore);
            return finalscore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playername, int highScorePosition) {
        System.out.println(playername + " managed to get into :"
                + highScorePosition + " on the high score table");
    }

    public static int calc(int playerscore) {

        if (playerscore > 1000) {
            return 1;
        } else if (playerscore > 500 && playerscore < 1000) {
            return 2;
        } else if (playerscore > 100 && playerscore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
