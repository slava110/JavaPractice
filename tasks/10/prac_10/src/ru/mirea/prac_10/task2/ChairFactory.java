package ru.mirea.prac_10.task2;

import ru.mirea.prac_10.task2.chairs.FunctionalChair;
import ru.mirea.prac_10.task2.chairs.MagicChair;
import ru.mirea.prac_10.task2.chairs.VictorianChair;

public class ChairFactory implements AbstractChairFactory {


    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(999);
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
