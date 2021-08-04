package com.visiblewomen.visiblewomen.persistence.service;

import com.visiblewomen.visiblewomen.persistence.PinRepository;
import com.visiblewomen.visiblewomen.persistence.model.Pin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PinService {

    private final PinRepository pinRepo;

    public Optional<Pin> getPin(final String id){
        return pinRepo.findById(id);
    }

    public void setPin(final Pin newPin){
        pinRepo.save(newPin);
    }

    public List<Pin> getAllPins(){
        return pinRepo.findAll();
    }
}
