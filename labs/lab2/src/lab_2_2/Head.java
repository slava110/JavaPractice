package lab_2_2;

public class Head {
    private boolean isAlive;
    private boolean containsBrain;

    public Head(boolean containsBrain) {
        this.containsBrain = containsBrain;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isContainsBrain() {
        return containsBrain;
    }

    public void setContainsBrain(boolean containsBrain) {
        this.containsBrain = containsBrain;
    }

    @Override
    public String toString() {
        return "Head{" +
                "isAlive=" + isAlive +
                ", containsBrain=" + containsBrain +
                '}';
    }
}
