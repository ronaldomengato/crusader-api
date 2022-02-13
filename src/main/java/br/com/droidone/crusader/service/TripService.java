package br.com.droidone.crusader.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.droidone.crusader.dto.TripDto;
import br.com.droidone.crusader.model.Trip;
import br.com.droidone.crusader.repository.TripRepository;

@Service
public class TripService {

    @Autowired
    private TripRepository repository;

    @Autowired
    private CountryService countryService;

    public List<Trip> findByUsername(String username) {
        return this.repository.findTripByUsername(username);
    }

    public Trip createTrip(TripDto dto) {
        Trip trip = dto.toEntity();
        trip.setId(this.generateId());
        return this.repository.save(trip);
    }

    public String recommendTrip() {
        return "You should visit " + this.countryService.getRandomCountry();
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        while (!this.repository.findById(id).isEmpty()) {
            id = UUID.randomUUID().toString();
        }
        return id;
    }
}
