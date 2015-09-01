/**
 * 
 */
package Test.Duck;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author Administrator
 *
 */
public abstract class Duck {
	
	/**
	 * @param args
	 */
		FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;
		public Duck(){
			
		}
		public abstract void display();
		public void perfromFly(){
		 flyBehavior.fly();
		}
		public void perfromQuack(){
			quackBehavior.quack();
		}
		public void swin(){
			System.out.println("ALL DUCK FLOAT,EVEN DECOYS!");
		}
		
		public void setFlyBehavior(FlyBehavior fb){
			flyBehavior=fb;
		}
		public void setQuackBehavior(QuackBehavior qb){
			quackBehavior =qb;
		}
		
	}
