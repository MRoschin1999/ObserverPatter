package org.example.observers;

import org.example.WhetherObserver;
import org.example.WhetherStationSensorsEntity;
import org.example.WhetherSubject;

public class Logger implements WhetherObserver {

    private WhetherSubject whetherSubject;
    private WhetherStationSensorsEntity whetherStationSensorsEntity;

    public void log(){
        System.out.println("logger!");
        System.out.println(whetherStationSensorsEntity);
    }

    public Logger(WhetherSubject whetherSubject) {
        this.whetherSubject = whetherSubject;
        whetherSubject.registerObserver(this);
    }


    @Override
    public void update(WhetherStationSensorsEntity whetherStationSensorsEntity) {
        this.whetherStationSensorsEntity = whetherStationSensorsEntity;
        log();
    }
}
