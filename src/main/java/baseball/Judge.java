package baseball;

public class Judge {
    public int judge(int[] a, int[] b) {
        String result = "";
        int strike = CountStrike(a, b), ball = CountBall(a, b);

        if(strike == 0 && ball == 0) {
            System.out.println("낫싱");
            return 0;
        }

        if(ball != 0) {
            result += ball + "볼 ";
        }
        if(strike != 0) {
            result += strike + "스트라이크";
        }
        System.out.println(result);

        if(strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return 1;
        }
        return 0;
    }
    public int CountStrike(int[] a, int[] b) {
        int cnt = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println(a[i] + " =?= " + b[i]);
            if(a[i] == b[i]) {
                cnt++;
            }
        }
        return cnt;
    }
    public int CountBall(int[] a, int[] b) {
        int cnt = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == j) continue;

                if(a[i] == b[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
