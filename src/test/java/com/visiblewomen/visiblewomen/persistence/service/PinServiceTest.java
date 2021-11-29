package com.visiblewomen.visiblewomen.persistence.service;

import com.visiblewomen.visiblewomen.persistence.PinRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


//@SpringBootTest
@DataMongoTest
@ExtendWith(SpringExtension.class)
class PinServiceTest {

    @Autowired
    PinRepository pinRepository;

    @Autowired
    PinService pinService;

    @AfterEach
    void cleanUp(){
        pinRepository.deleteAll();
    }

    @Test
    void throw_exception_if_pin_not_existing() {
    }

    @Test
    void find_pin_if_existings() {
    }

    @Test
    void getAllPins() {
    }
}
