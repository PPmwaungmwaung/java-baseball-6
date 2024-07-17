package baseball;

import camp.nextstep.edu.missionutils.*;

public class Reader {
    public int[] readBaseball(String message) {
        System.out.print(message);

        String input = Console.readLine();
        int[] result = new int[3];

        if(input.length() != 3) {
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < 3; i++) {
            if(input.charAt(i) < '1' || input.charAt(i) > '9') {
                throw new IllegalArgumentException();
            }
            result[i] = input.charAt(i) - '0';
        }
        return result;
    }
    public boolean readEnd(String message) {
        System.out.print(message);

        String input = Console.readLine().trim();
        if (input.equals("1")) {
            return false;
        }
        else if (input.equals("2")) {
            return true;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
