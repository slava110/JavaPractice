package ru.mirea.lab_2_2;

public class Leg {
    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "isAlive=" + isAlive +
                '}';
    }
}
