package Test.Singleton;

public class ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = new Singleton();
		s.getInstance();
		System.out.println(s.getInstance().hashCode());
		s = new Singleton();
		s.getInstance();
		System.out.println(s.getInstance().hashCode());

	}

}
