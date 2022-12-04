package org.example.observers;

import org.example.WhetherObserver;
import org.example.WhetherStationSensorsEntity;
import org.example.WhetherSubject;

public class AlertSystem implements WhetherObserver {

    private WhetherSubject whetherSubject;
    private WhetherStationSensorsEntity whetherStationSensorsEntity;

    public AlertSystem(WhetherSubject whetherSubject) {
        this.whetherSubject = whetherSubject;
        whetherSubject.registerObserver(this);
    }

    public void alert(){
        System.out.println("Alert!");
        System.out.println(whetherStationSensorsEntity);
    }

    @Override
    public void update(WhetherStationSensorsEntity whetherStationSensorsEntity) {
        this.whetherStationSensorsEntity = whetherStationSensorsEntity;
        alert();
    }
}
