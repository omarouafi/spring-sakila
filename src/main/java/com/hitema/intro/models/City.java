package com.hitema.intro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class City {
    @Id
    @Column(name = "city_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="city")
    private String city;

    @Column(name="country_id")
    private Long countryId;

    @Column(name="last_update")
    private LocalDateTime lastUpdate;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCountryId() {
        return countryId;

    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }




}
