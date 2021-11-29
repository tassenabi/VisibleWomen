package com.visiblewomen.visiblewomen.util;

import com.visiblewomen.visiblewomen.persistence.model.Pin;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class PinFactory {

    public static Pin createPin(String id){

        Pin pin = new Pin();
        pin.setId(id);
        pin.setTimeHappened(LocalDateTime.now());
        pin.setWhatHappenedCategories(new ArrayList<>(Arrays.asList(Pin.HarrasCategory.ONE, Pin.HarrasCategory.TWO)));
        pin.setWhatHappenedText("CatCalling");
        pin.setGeoJsonPoint(new GeoJsonPoint(34.988889, 106.614444));
        return pin;
    }
}
