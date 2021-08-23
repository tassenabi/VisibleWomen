package com.visiblewomen.visiblewomen.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.visiblewomen.visiblewomen.exception.VisibleWomanException;
import com.visiblewomen.visiblewomen.persistence.model.Pin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PinConverter {

    private final ObjectMapper objectMapper;

    @Autowired
    public PinConverter(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    public String entityToDto (final Pin pinInput){

        try{
            return objectMapper.writeValueAsString(pinInput);
        } catch (JsonProcessingException e) {
            throw new VisibleWomanException("The transformation to JSON format does not work. " + e.getMessage(), e);

        }
    }

    public Pin dtoToEntity(final String dto){

        try{
            return objectMapper.readValue(dto, Pin.class);
        }catch (JsonProcessingException e) {
            if(log.isTraceEnabled()){
                log.trace(e.getMessage(),e);
            }else{
                log.warn(e.getMessage());
            }
            return null;

        }



    }

}
