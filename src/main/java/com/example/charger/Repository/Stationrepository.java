package com.example.charger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.charger.Entity.Station;

@Repository
public interface  Stationrepository extends JpaRepository<Station ,Long>{

    
}
