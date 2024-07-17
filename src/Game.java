package src;

public class Game {

    /**
     * 手の強弱を比較する。
     * 返り値 -1 : p1の負け
     *          0 : ひきわけ
     *          1 : p1の勝ち
     */
    public int judge(Player p1, Player p2) {
        if (p1 == null || p2 == null || p1.getHand() == null || p2.getHand() == null) {
            throw new IllegalArgumentException("Player and Hand must not be null");
        }
        return p1.getHand().compare(p2.getHand());
    }
}
