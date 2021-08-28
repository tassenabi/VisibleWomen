package com.visiblewomen.visiblewomen.persistence.service;

import com.visiblewomen.visiblewomen.persistence.PinRepository;
import com.visiblewomen.visiblewomen.persistence.model.Pin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PinService {

    private final PinRepository pinRepo;

    public Pin getPin(final String id){

        Optional<Pin> entity = pinRepo.findById(id);

        return entity.orElseThrow(() -> new NoSuchElementException("Pin for id " + id + " couldn't be found"));
    }

    public void setPin(final Pin newPin){

        pinRepo.save(newPin);
    }

    public List<Pin> getAllPins(){

        List<Pin> pins = pinRepo.findAll();

        return pins;
    }
}
