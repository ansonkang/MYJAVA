package Test.Observer;

import java.util.Observer;

public interface Subject {
	// 定义主体接口

	public void registerObserver(Observer obs);

	public void removeObserver(Observer obs);

	public void notityObserver();
}
