package com.visiblewomen.visiblewomen.persistence.model;

import lombok.*;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "pin")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force=true)
public class Pin {

    @Id
    private final String id;
    private final String whatHappenedText;
    private final GeoJsonPoint geoJsonPoint;
    private final DateTime timeHappened;
    private final ArrayList<HarrasCategory> whatHappenedCategories;
    private final String mailAdress;

    @Getter
    public enum HarrasCategory {
        ONE,
        TWO,
        THREE,
        FOUR
    }
}
