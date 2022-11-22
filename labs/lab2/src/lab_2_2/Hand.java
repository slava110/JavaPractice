package lab_2_2;

public class Hand {
    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "isAlive=" + isAlive +
                '}';
    }
}
