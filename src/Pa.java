package src;

public class Pa implements Hand {
    private final String HAND_NAME = "パー";

    @Override
    public int compare(Hand hand) {
        if (hand instanceof Gu) {    // パー vs グー
            return 1;
        } else if (hand instanceof Choki) {    // パー vs チョキ
            return -1;
        } else {    // パー vs パー
            return 0;
        }
    }

    @Override
    public String getHandName() {
        return this.HAND_NAME;
    }
}
