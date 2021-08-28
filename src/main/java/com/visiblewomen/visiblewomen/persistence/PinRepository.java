package com.visiblewomen.visiblewomen.persistence;

import com.visiblewomen.visiblewomen.persistence.model.Pin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface PinRepository extends MongoRepository<Pin, String> {

    Optional<Pin> findById(final String id);
    List<Pin> findAll();

}
