package com.visiblewomen.visiblewomen.util;

import com.visiblewomen.visiblewomen.persistence.model.Pin;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.ArrayList;
import java.util.Arrays;

public class PinFactory {

    public static Pin createPin(){

        Pin pin = new Pin();
        pin.setId("1");
        pin.setTimeHappened(DateTime.now());
        pin.setWhatHappenedCategories(new ArrayList<>(Arrays.asList(Pin.HarrasCategory.ONE, Pin.HarrasCategory.TWO)));
        pin.setWhatHappenedText("CatCalling");
        pin.setGeoJsonPoint(new GeoJsonPoint(34.988889, 106.614444));
        return pin;
    }
}
