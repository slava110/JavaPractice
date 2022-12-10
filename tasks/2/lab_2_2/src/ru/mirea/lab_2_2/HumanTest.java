package ru.mirea.lab_2_2;

public class HumanTest {

    public static void main(String[] args) {
        Head head = new Head(false);

        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        Leg leg1 = new Leg();
        Leg leg2 = new Leg();

        Human human = new Human(head, hand1, hand2, leg1, leg2);

        System.out.println(human);

        human.getRightHand().setAlive(false);
        human.getLeftLeg().setAlive(false);

        System.out.println(human);
    }
}
