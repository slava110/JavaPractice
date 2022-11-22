package lab_3_1;

public class DishTest {

    public static void main(String[] args) {
        FruitBowl fruitBowl = new FruitBowl("Favorite fruit bowl", true, "Apple", true, 3);
        PepperMill pepperMill = new PepperMill("Cool pepper mill", false, "Pepper", false);
        SaladBowl saladBowl = new SaladBowl("Crab salad", false, "Crab salad", true);

        System.out.println(fruitBowl);
        System.out.println(pepperMill);
        System.out.println(saladBowl);

        pepperMill.wash();
        saladBowl.setPoisoned(true);

        System.out.println(fruitBowl);
        System.out.println(pepperMill);
        System.out.println(saladBowl);
    }
}
