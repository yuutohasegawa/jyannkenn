package src;

public class Gu implements Hand {
    private final String HAND_NAME = "グー";

    /**
     * 手の強弱を比較する。
     * 返り値 -1 : 自身が引数で指定した手より弱い
     *          0 : 自身が引数で指定した手と同じ
     *          1 : 自身が引数で指定した手より強い
     */
    @Override
    public int compare(Hand hand) {
        if (hand instanceof Choki) {    // チョキ vs グー
            return 1;
        } else if (hand instanceof Pa) {    // パー vs グー
            return -1;
        } else {
            return 0;    // グー vs グー
        }
    }

    @Override
    public String getHandName() {
        return this.HAND_NAME;
    }
}
