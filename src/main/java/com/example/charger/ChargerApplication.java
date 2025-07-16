package com.example.charger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.charger.Entity.Station;
import com.example.charger.Repository.Stationrepository;


@SpringBootApplication
@EntityScan(basePackages = "com.example.charger.entity")
public class ChargerApplication {

	public static void main(String[] args) {
      
		SpringApplication.run(ChargerApplication.class, args);

	}

	

}
