package org.example;

public interface WhetherSubject {
    public void registerObserver(WhetherObserver observer);

    public void removeObserver(WhetherObserver observer);

    public void notifyObservers();
}
