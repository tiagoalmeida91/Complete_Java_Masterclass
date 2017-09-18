/**
 * Created by TFA on 13/09/2017.
 */
public class main {
    public static void main(String[] args) {
        int newScore = calculeteScore("tim", 5000);
        System.out.println("New score is " + newScore);
        calculeteScore(125);
        calculeteScore();
    }

    public static int calculeteScore(String playername, int score) {
        System.out.println("Player " + playername + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculeteScore(int score) {
        System.out.println(" scored " + score + " points");
        return score * 1000;
    }

    public static void calculeteScore() {
        System.out.println("blank");

    }

}

