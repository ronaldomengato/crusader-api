package br.com.droidone.crusader.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.droidone.crusader.model.Trip;

@Repository
public interface TripRepository extends MongoRepository<Trip, String> {

    @Query("{username: '?0'}")
    List<Trip> findTripByUsername(String username);

    public long count();

}
