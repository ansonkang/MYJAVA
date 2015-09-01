/**
 * 
 */
package Test.Duck;

/**
 * @author Administrator
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard=new MallardDuck();
		mallard.perfromFly();
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.perfromFly();
		mallard.display();

	}

}
