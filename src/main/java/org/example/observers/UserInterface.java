package org.example.observers;

import org.example.WhetherObserver;
import org.example.WhetherStationSensorsEntity;
import org.example.WhetherSubject;

public class UserInterface implements WhetherObserver {

    private WhetherSubject whetherSubject;
    private WhetherStationSensorsEntity whetherStationSensorsEntity;

    public void display(){
        System.out.println("UserInterface!");
        System.out.println(whetherStationSensorsEntity);
    }

    public UserInterface(WhetherSubject whetherSubject) {
        this.whetherSubject = whetherSubject;
        whetherSubject.registerObserver(this);

    }

    @Override
    public void update(WhetherStationSensorsEntity whetherStationSensorsEntity) {
        this.whetherStationSensorsEntity = whetherStationSensorsEntity;
        display();
    }
}
