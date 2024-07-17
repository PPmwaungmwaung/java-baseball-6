package baseball;

import camp.nextstep.edu.missionutils.*;

public class Catcher {
    private int[] _digits = new int[3];
    private boolean[] _selected = new boolean[10];

    public Catcher() {
        initDigits();
    }

    public void initDigits() {
        int rand;

        for(int i=1;i<10;i++) {
            _selected[i] = false;
        }

        for(int i = 0; i < 3; i++) {
            while(true) {
                rand = Randoms.pickNumberInRange(1, 9);
                if(!_selected[rand]) {
                    _digits[i] = rand;
                    break;
                }
            }
        }
    }
    public int[] getDigits() {
        return _digits;
    }
}
