package com.example.charger.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.charger.Entity.Station;
import com.example.charger.Service.StationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import io.micrometer.core.annotation.Timed;

//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/station")
public class StationController {

    @Autowired
    private StationService stationService;
     @Timed(value = "station.create", description = "Time taken to create station")
    @PostMapping
    public Station createStation(@RequestBody Station station) {
        return stationService.createStation(station);
    }

    @GetMapping
    public List<Station> getAllStations() {
        return stationService.Getallstations();
    }

   
    
}