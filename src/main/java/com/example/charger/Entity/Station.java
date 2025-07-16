package com.example.charger.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.*;

@Entity
@Table(name="Station")
public class Station {
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long Id ;
    
    @Column(nullable=false)
    private String location;
    
    @Column(nullable=false)
    private String name;

    public Station(long Id ,String location ,String name){
        this.Id=Id;
        this.location=location;
        this.name=name;

    }
    public Station(){
        //Defualt constructor 
    }

    public long getId() {
        return this.Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", location='" + getLocation() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
