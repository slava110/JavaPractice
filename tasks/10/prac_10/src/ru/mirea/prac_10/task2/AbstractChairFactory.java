package ru.mirea.prac_10.task2;

import ru.mirea.prac_10.task2.chairs.FunctionalChair;
import ru.mirea.prac_10.task2.chairs.MagicChair;
import ru.mirea.prac_10.task2.chairs.VictorianChair;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair();

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
