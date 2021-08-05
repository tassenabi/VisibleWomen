package com.visiblewomen.visiblewomen.persistence.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@Document(collection = "pin")
public class Pin {

    @Id
    private String id;
    private String whatHappenedText;
    private GeoJsonPoint geoJsonPoint;
    private DateTime timeHappened;
    private ArrayList<HarrasCategory> whatHappenedCategories;

    @Getter
    public enum HarrasCategory {
        ONE,
        TWO,
        THREE,
        FOUR
    }
}
