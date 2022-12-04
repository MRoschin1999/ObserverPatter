package org.example;

@FunctionalInterface
public interface WhetherObserver {
    void update(WhetherStationSensorsEntity whetherStationSensorsEntity);
}
