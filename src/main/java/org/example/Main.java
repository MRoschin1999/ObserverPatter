package org.example;

import org.example.observers.AlertSystem;
import org.example.observers.Logger;
import org.example.observers.UserInterface;

public class Main {
    public static void main(String[] args) {
        WhetherStationSubject whetherStation = new WhetherStationSubject(new WhetherStationSensorsEntity(12, 13, 14));

        new AlertSystem(whetherStation);
        new AlertSystem(whetherStation);
        Logger logger = new Logger(whetherStation);
        new UserInterface(whetherStation);

        whetherStation.setWhetherStationSensorsEntity(new WhetherStationSensorsEntity(14, 13, 12));

        whetherStation.removeObserver(logger);

        whetherStation.setWhetherStationSensorsEntity(new WhetherStationSensorsEntity(1, 2, 3));
    }
}