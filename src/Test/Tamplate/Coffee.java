package Test.Tamplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends AbstracTamplate {

	@Override
	void addOther() {
		// TODO Auto-generated method stub
		System.out.println("add sugar!");
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("add Coffee!");
	}

	@Override
	boolean getHood() {
		// TODO Auto-generated method stub
		if (get().toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}

	String get() {
		String str = "";
		BufferedReader bfReader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("would u add other like sugar?(y/n)");
		try {
			str = bfReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("your entry is error!");
		}
		if (str == null)
			return "no";
		else
			return str;
	}
}
