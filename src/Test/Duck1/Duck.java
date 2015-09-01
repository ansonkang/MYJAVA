/**
 * 
 */
package Test.Duck1;

/**
 * @author Administrator
 *
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void perFromFly(){
		flyBehavior.fly();
	}
	public void perFormQuack(){
		quackBehavior.quack();
	}
}
