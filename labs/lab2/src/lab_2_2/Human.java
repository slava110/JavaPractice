package lab_2_2;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human(Head head, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg) {
        this.head = head;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }
}
