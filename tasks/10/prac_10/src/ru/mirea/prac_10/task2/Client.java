package ru.mirea.prac_10.task2;

import ru.mirea.prac_10.task2.chairs.Chair;

public class Client {
    private Chair chair;

    public Client(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Sitting on " + (chair != null ? chair : "the floor"));
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
