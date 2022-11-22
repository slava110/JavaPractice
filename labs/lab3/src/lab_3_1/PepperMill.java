package lab_3_1;

public class PepperMill extends Dish {

    public PepperMill(String name, boolean fancy, String food, boolean clean) {
        super(name, fancy, food, clean);
    }

    @Override
    public void wash() {
        if(!clean) {
            System.out.println("Khe-khe, washing pepper mill, khe-khe");
            clean = true;
        }
    }

    @Override
    public String toString() {
        return "PepperMill{" +
                "name='" + name + '\'' +
                ", fancy=" + fancy +
                ", food='" + food + '\'' +
                ", clean=" + clean +
                '}';
    }
}
