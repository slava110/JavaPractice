package ru.mirea.lab_4_2;

public class Car implements Priceable {
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
