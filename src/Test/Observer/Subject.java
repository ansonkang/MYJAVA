package Test.Observer;

import java.util.Observer;

public interface Subject {
	// ��������ӿ�

	public void registerObserver(Observer obs);

	public void removeObserver(Observer obs);

	public void notityObserver();
}
