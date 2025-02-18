package open_closed;

import open_closed.correct.CasualPersonality;
import open_closed.correct.FormalPersonality;
import open_closed.correct.Greeter;

public class Main {
    public static void main(String[] args) {
        Greeter formalGreeter = new Greeter(new FormalPersonality());
        System.out.println(formalGreeter.greet());  // Output: Good evening, sir.

        Greeter casualGreeter = new Greeter(new CasualPersonality());
        System.out.println(casualGreeter.greet());  // Output: Hey, what's up?

    }
}