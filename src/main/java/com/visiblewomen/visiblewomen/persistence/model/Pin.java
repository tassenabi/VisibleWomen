package com.visiblewomen.visiblewomen.persistence.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

@Getter
@Setter
public class Pin {

    private String id;
    private String whatHappenedText;
    private GeoJsonPoint geoJsonPoint;
    private DateTime timeHappened;
    private HarrasCategory[] whatHappenedCategories;

    @Getter
    public enum HarrasCategory {
        ONE,
        TWO,
        THREE,
        FOUR
    }
}
