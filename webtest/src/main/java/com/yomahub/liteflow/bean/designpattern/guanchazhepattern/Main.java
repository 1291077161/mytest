package com.yomahub.liteflow.bean.designpattern.guanchazhepattern;

public class Main {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

		ConcreteObserver observer1 = new ConcreteObserver("Observer 1", subject);
		ConcreteObserver observer2 = new ConcreteObserver("Observer 2", subject);

		subject.registerObserver(observer1);
		subject.registerObserver(observer2);

		subject.setState(10);
		// Output:
		// Observer 1 received notification
		// Observer 2 received notification

		subject.removeObserver(observer1);

		subject.setState(20);
		// Output:
		// Observer 2 received notification
	}


}
