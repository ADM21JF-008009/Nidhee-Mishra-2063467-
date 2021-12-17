package com.cognizant.ormlearn.CountryRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	List<Country> findByNameContainingOrderByNameAsc(String name);
}
