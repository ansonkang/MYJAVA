/**
 * 
 */
package Test.Duck;

/**
 * @author Administrator
 *
 */
public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehavior=new FlyNoWay();
		quackBehavior=new Quack();
	}
	/* (non-Javadoc)
	 * @see Test.Duck.Duck#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A MODEL DUCK!");
	}

}
