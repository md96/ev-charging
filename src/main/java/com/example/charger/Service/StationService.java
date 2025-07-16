package com.example.charger.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.charger.Entity.Station;
import com.example.charger.Repository.Stationrepository;

@Service
public class StationService {
    
    @Autowired
    private Stationrepository stationrepository;

    public Station createStation(Station station){
        return stationrepository.save(station);
    }

    public List<Station> Getallstations(){
        return stationrepository.findAll();
    }
  
     public Station updateLocation(Long Id, String  location) {
        Optional<Station> optionalStation = stationrepository.findById(Id);
        if (!optionalStation.isPresent()) {
            return null;
        }
        Station station = optionalStation.get();
        System.out.println("Updated staton "+station);
        System.out.println("Updated location "+location);
        // Update location name
        station.setLocation(location);
        return stationrepository.save(station);
    }




}
