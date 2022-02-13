package br.com.droidone.crusader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.droidone.crusader.dto.TripDto;
import br.com.droidone.crusader.model.Trip;
import br.com.droidone.crusader.service.TripService;

@RestController
@RequestMapping("/trips")
public class TripController {
    @Autowired
    private TripService service;

    @GetMapping()
    public List<Trip> getAllTrips(@RequestParam("username") String username) {
        return this.service.findByUsername(username);
    }

    @GetMapping("recommend")
    public String getRecommendedTrip() {
        return this.service.recommendTrip();
    }

    @PostMapping()
    public Trip createTrip(@RequestBody TripDto trip) {
        return this.service.createTrip(trip);
    }
}
