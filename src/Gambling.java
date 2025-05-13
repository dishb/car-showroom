public class Gambling {
    public static String spinWheel() {
        int spin = (int) (Math.random() * (1000)) + 1;

        if (spin == 1) {
            return "jackpot";
        } else if (1 < spin && spin <= 101) {
            return "10000.00";
        } else if (101 < spin && spin <= 201) {
            return "-10000.00";
        } else if (201 < spin && spin <= 401) {
            return "7000.00";
        } else if (401 < spin && spin <= 901) {
            return "-7000.00";
        } else {
            return "5000.00";
        }
    }
}
