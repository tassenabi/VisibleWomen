package com.visiblewomen.visiblewomen.web;

import com.visiblewomen.visiblewomen.dto.PinDto;
import com.visiblewomen.visiblewomen.mapper.FrontendMapper;
import com.visiblewomen.visiblewomen.persistence.model.Pin;
import com.visiblewomen.visiblewomen.persistence.service.PinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1")
public class Controller {

    private final PinService pinService;

    @Autowired
    Controller(PinService pinService){

        this.pinService = pinService;
    }

    @GetMapping("/pin/{id}")
    public ResponseEntity<PinDto> getPin(@PathVariable String id){

        Pin pin = pinService.getPin(id);
        PinDto response = FrontendMapper.getPinDto(pin);

        return ResponseEntity.ok(response);

    }

    @PostMapping("/pin/{id}")
    public void setPin(@RequestBody Pin newPin){
        this.pinService.setPin(newPin);
    }

    @GetMapping("/pins")
    ResponseEntity<List<Pin>> getAllPins() {

        List<Pin> response = pinService.getAllPins();

        return response != null ?
                ResponseEntity.ok(response) :
                ResponseEntity.noContent().build();
    }
}
