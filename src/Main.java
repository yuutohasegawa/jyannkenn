package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Player user = new Player("ユーザ");
        Player com = new Player("CPU");

        // 入力指示表示
        System.out.println("1.グー");
        System.out.println("2.チョキ");
        System.out.println("3.パー");
        System.out.print("あなたの手を選択してください。> ");

        // ユーザ入力
        String input = null;
        try {
            BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
            input = inputUser.readLine();
        } catch (IOException e) {
            System.out.println("システムエラー");
            System.exit(0);
        }

        if (input == null || !(input.equals("1") || input.equals("2") || input.equals("3"))) {
            System.out.println("1-3の値を入力してください。");
            System.exit(0);
        }

        // ユーザの入力によりジャンケンの手をセットする
        switch (input) {
            case "1":
                user.setHand(new Gu());
                break;
            case "2":
                user.setHand(new Choki());
                break;
            case "3":
                user.setHand(new Pa());
                break;
        }

        // comの手を生成
        com.createRandomHand();

        // 勝敗決定
        int result = Game.judge(user, com);

        // 結果表示
        System.out.println(user.getPlayerName() + "の手: " + user.getHand().getHandName());
        System.out.println(com.getPlayerName() + "の手: " + com.getHand().getHandName());

        if (result < 0) {
            System.out.println("結果: " + user.getPlayerName() + "の負け");
        } else if (result > 0) {
            System.out.println("結果: " + user.getPlayerName() + "の勝ち");
        } else {
            System.out.println("結果: あいこ");
        }
    }
}
