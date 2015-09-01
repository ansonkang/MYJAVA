/**
 * 
 */
package Test.Duck1;

import myUtil.Print;

/**
 * @author Administrator
 *
 */
public class QucakMute implements QuackBehavior{

	/* (non-Javadoc)
	 * @see Test.Duck1.QuackBehavior#quack()
	 */
	public void quack() {
		// TODO Auto-generated method stub
		Print.println("CAN'T QUACK!");
	}

}
