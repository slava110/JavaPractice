package ru.mirea.lab_3_1;

public abstract class Dish {
    protected String name;
    protected boolean fancy;
    protected String food;
    protected boolean clean;

    public Dish(String name, boolean fancy, String food, boolean clean) {
        this.name = name;
        this.fancy = fancy;
        this.food = food;
        this.clean = clean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFancy() {
        return fancy;
    }

    public void setFancy(boolean fancy) {
        this.fancy = fancy;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isClean() {
        return clean;
    }

    public abstract void wash();
}
