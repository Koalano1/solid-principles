package liskov_substitution.correct;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}
