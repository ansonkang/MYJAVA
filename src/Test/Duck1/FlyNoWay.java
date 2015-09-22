/**
 * 
 */
package Test.Duck1;


/**
 * @author Administrator
 *
 */
public class FlyNoWay implements FlyBehavior {

	/*
	 * (non-Javadoc)
	 * 
	 * @see Test.Duck1.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("CAN'T FLY!!");

	}

}
