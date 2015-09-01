package Test.State;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER=1;
	final static int HAS_QUARTER=2;
	final static int SOLD=3;
	
	int state=SOLD_OUT;
	int count=0;
	
	public GumballMachine(int count){
		this.count=count;
		if(count>0){
			state=NO_QUARTER;
		}
	}
	
	public void insertQuarter(){
		if(state==HAS_QUARTER){
			System.out.println("有硬币，请勿在投币好嘛1");
		}else if(state==SOLD_OUT){
			System.out.println("已售罄，勿投币好嘛！");
		}else if(state==SOLD){
			System.out.println("please wait,we're already giving you a gumball");
		}else if(state==NO_QUARTER){
			state=HAS_QUARTER;
			System.out.println("你投了一个硬币");
		}
	}

}
