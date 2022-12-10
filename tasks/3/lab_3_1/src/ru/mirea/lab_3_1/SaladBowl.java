package ru.mirea.lab_3_1;

public class SaladBowl extends Dish {
    private boolean isPoisoned = false;

    public SaladBowl(String name, boolean fancy, String food, boolean clean) {
        super(name, fancy, food, clean);
    }

    public boolean isPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(boolean poisoned) {
        isPoisoned = poisoned;
    }

    @Override
    public void wash() {
        if(!clean) {
            System.out.println("Washing salad bowl!");
            System.out.println("I like salad btw!");
            clean = true;
        }
    }

    @Override
    public String toString() {
        return "SaladBowl{" +
                "isPoisoned=" + isPoisoned +
                ", name='" + name + '\'' +
                ", fancy=" + fancy +
                ", food='" + food + '\'' +
                ", clean=" + clean +
                '}';
    }
}
