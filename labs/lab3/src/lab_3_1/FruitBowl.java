package lab_3_1;

public class FruitBowl extends Dish {
    private int fruitAmount;

    public FruitBowl(String name, boolean fancy, String food, boolean clean, int fruitAmount) {
        super(name, fancy, food, clean);
        this.fruitAmount = fruitAmount;
    }

    public int getFruitAmount() {
        return fruitAmount;
    }

    public void setFruitAmount(int fruitAmount) {
        this.fruitAmount = fruitAmount;
    }

    @Override
    public void wash() {
        if(!clean) {
            System.out.println("Washing fruit bowl!");
            clean = true;
        }
    }

    @Override
    public String toString() {
        return "FruitBowl{" +
                "fruitAmount=" + fruitAmount +
                ", name='" + name + '\'' +
                ", fancy=" + fancy +
                ", food='" + food + '\'' +
                ", clean=" + clean +
                '}';
    }
}
