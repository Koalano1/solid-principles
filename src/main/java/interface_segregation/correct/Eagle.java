package interface_segregation.correct;

public class Eagle implements FlyingCreature, FeatheredCreature {

    private int numberOfFeathers;

    public Eagle(int initialFeathers) {
        this.numberOfFeathers = initialFeathers;
    }

    public void fly() {
        String currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
