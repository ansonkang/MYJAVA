package Test.Singleton;

public class Singleton {

	private static Singleton uniqueInstance;

	public Singleton() {
	}

	public Singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
}
