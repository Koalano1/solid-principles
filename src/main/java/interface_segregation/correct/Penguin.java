package interface_segregation.correct;

public class Penguin implements SwimmingCreature, FeatheredCreature {
    private int numberOfFeathers;

    public Penguin(int initialFeathers) {
        this.numberOfFeathers = initialFeathers;
    }

    public void swim() {
        String currentLocation = "in the water";
    }

    public void molt() {
        this.numberOfFeathers -= 4;
    }

}
