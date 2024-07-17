package baseball;

public class Player {
    private int[] _digits = new int[3];

    public int[] getDigits() {
        return _digits;
    }
    public void setDigits(int[] digits) {
        for(int i = 0; i < 3; i++) {
            _digits[i] = digits[i];
        }
    }
}
