/**
 * 
 */
package Test.Duck1;

import myUtil.Print;

/**
 * @author Administrator
 *
 */
public class FlyWithWings implements FlyBehavior{

	/* (non-Javadoc)
	 * @see Test.Duck1.FlyBehavior#fly()
	 */
	public void fly() {
		Print p=new Print();
		p.println("FlyWithWings");
	}

}
