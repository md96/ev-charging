package com.example.charger.Service;

import java.util.List;

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




}
