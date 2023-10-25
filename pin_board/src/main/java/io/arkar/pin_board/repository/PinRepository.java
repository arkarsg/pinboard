package io.arkar.pin_board.repository;

import io.arkar.pin_board.model.Pin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * A `Repository` is an interface that extends Spring Data MongoDB's
 * MongoRepository interface.
 * Defines necessary database operations such as saving, updating, and deleting
 * pins for our Pin model
 */
@Repository
public interface PinRepository extends MongoRepository<Pin, String> {

}
