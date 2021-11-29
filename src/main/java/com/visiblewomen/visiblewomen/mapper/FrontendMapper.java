package com.visiblewomen.visiblewomen.mapper;

import com.visiblewomen.visiblewomen.dto.PinDto;
import com.visiblewomen.visiblewomen.persistence.model.Pin;

public class FrontendMapper {

    private FrontendMapper() {

    }

    public static PinDto getPinDto(Pin pin){

        PinDto dto = new PinDto();

        dto.setId(pin.getId());
        dto.setGeoJsonPoint(pin.getGeoJsonPoint());
        dto.setWhatHappenedCategories(pin.getWhatHappenedCategories());
        dto.setTimeHappened(pin.getTimeHappened());
        dto.setWhatHappenedText(pin.getWhatHappenedText());

        return dto;
    }
}
