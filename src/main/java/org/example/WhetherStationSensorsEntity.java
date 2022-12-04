package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WhetherStationSensorsEntity {
    private int pressure;
    private int windSpeed;
    private int temperature;
}
