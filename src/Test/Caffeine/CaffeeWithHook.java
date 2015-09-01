package Test.Caffeine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		// TODO Auto-generated method stub

	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("addCondiments ");

	}

	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}else{
			return false;
	}

}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer=null;
		System.out.println("y or n");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try {
			answer=in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("IO error");
			e.printStackTrace();
		}
		if (answer==null){
			return "no";
		}
		return answer;
	}
}
