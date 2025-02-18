package open_closed.incorrect;

public class Greeter {
    private String formality;

    public String greet() {
        return switch (this.formality) {
            case "formal" -> "Good evening, sir.";
            case "casual" -> "Sup bro?";
            case "intimate" -> "Hello Darling!";
            case null, default -> "Hello.";
        };
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
