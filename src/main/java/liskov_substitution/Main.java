package liskov_substitution;

import liskov_substitution.correct.Rectangle;
import liskov_substitution.correct.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle square = new Square(7);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Square area: " + square.area());
    }
}