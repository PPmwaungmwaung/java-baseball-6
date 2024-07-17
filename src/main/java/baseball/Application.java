package baseball;
public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Catcher catcher = new Catcher();
        Player player = new Player();
        Reader reader = new Reader();
        Judge judge = new Judge();

        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true) {
            player.setDigits(reader.readBaseball("숫자를 입력해주세요 : "));
            if(judge.judge(player.getDigits(), catcher.getDigits()) == 1) {
                if(reader.readEnd("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n")) {
                    break;
                } else {
                    catcher.initDigits();
                }
            }
        }
    }
}
