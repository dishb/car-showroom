public class Gambling {
    private final static int MAX = 1000;
    private final static int MIN = 1;
    private final static int JACKPOT = 548;

    public static int spinWheel() {
        return (int) (Math.random() * (MAX - MIN + 1) + MIN);
    }
}
