package com.visiblewomen.visiblewomen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
public class PinDto {

    private String id;
    private String whatHappenedText;
    private GeoJsonPoint geoJsonPoint;
    private LocalDateTime timeHappened;
    private ArrayList<com.visiblewomen.visiblewomen.persistence.model.Pin.HarrasCategory> whatHappenedCategories;
    private String mailAdress;

    @Getter
    public enum HarrasCategory {
        ONE,
        TWO,
        THREE,
        FOUR
    }
}
