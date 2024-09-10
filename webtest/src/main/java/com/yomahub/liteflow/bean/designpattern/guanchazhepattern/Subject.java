package com.yomahub.liteflow.bean.designpattern.guanchazhepattern;

public interface Subject {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
