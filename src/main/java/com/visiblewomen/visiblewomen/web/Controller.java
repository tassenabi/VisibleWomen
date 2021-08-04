package com.visiblewomen.visiblewomen.web;

import com.visiblewomen.visiblewomen.persistence.model.Pin;
import com.visiblewomen.visiblewomen.persistence.service.PinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class Controller {

    private final PinService pinService;

    @Autowired
    Controller(PinService pinService){

        this.pinService = pinService;
    }

    //ResponseEntity fehlt hier noch
    @GetMapping("/pin")
    public Optional<Pin> getPin(String id){
        return this.pinService.getPin(id);
    }

    @PostMapping("/pin")
    public void setPin(@RequestBody Pin newPin){
        this.pinService.setPin(newPin);
    }

    //ResponseEntity fehlt hier noch
    @GetMapping("/pins")
    List<Pin> all() {
        return pinService.getAllPins();
    }
}
