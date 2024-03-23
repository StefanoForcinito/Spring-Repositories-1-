package com.example.spring.repositorie.repositories;


import com.example.spring.repositorie.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {
}
