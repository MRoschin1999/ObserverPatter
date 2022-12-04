package org.example;

import lombok.Data;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class WhetherStationSubject implements WhetherSubject{

    private WhetherStationSensorsEntity whetherStationSensorsEntity;
    public WhetherStationSubject(WhetherStationSensorsEntity whetherStationSensorsEntity) {
        whetherStationSensorsEntity = whetherStationSensorsEntity;
    }

    public void setWhetherStationSensorsEntity(WhetherStationSensorsEntity whetherStationSensorsEntity) {
        this.whetherStationSensorsEntity = whetherStationSensorsEntity;
        notifyObservers();
    }

    private Set<WhetherObserver> observers = new HashSet<>();

    public void registerObserver(WhetherObserver observer){
        observers.add(observer);
    }

    public void removeObserver(WhetherObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        observers.forEach(o -> o.update(whetherStationSensorsEntity));
    }
}
