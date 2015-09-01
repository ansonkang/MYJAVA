/**
 * 
 */
package Test.Duck1;

import myUtil.Print;

/**
 * @author Administrator
 *
 */
public class FlyNoWay implements FlyBehavior{

	/* (non-Javadoc)
	 * @see Test.Duck1.FlyBehavior#fly()
	 */
	public void fly() {
		Print.println("CAN'T FLY!!");
		
	}

}
