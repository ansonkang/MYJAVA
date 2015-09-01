package Test.Bevarage;

public abstract class Bevarage {
	String description = "UnKnow Bevarage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
