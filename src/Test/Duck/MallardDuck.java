/**
 * 
 */
package Test.Duck;

/**
 * @author Administrator
 *
 */
public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior=new Quack();
		flyBehavior=new FlyNoWay();
	}
	/* (non-Javadoc)
	 * @see Test.Duck.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("A REAL MALLARD DUCK!");
		
	}
	

}
