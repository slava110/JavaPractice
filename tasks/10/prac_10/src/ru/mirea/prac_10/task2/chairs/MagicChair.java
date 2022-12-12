package ru.mirea.prac_10.task2.chairs;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Woooo-Hoooo, maaaaagic!");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
