package src;

public class Choki implements Hand {
    private final String HAND_NAME = "チョキ";

    /**
     * 手の強弱を比較する。
     * 返り値 -1 : 自身が引数で指定した手より弱い
     *          0 : 自身が引数で指定した手と同じ
     *          1 : 自身が引数で指定した手より強い
     */
    @Override
    public int compare(Hand hand) {
        if (hand instanceof Pa) {    // チョキ vs パー
            return 1;
        } else if (hand instanceof Gu) {    // チョキ vs グー
            return -1;
        } else {    // チョキ vs チョキ
            return 0;
        }
    }

    @Override
    public String getHandName() {
        return this.HAND_NAME;
    }
}
