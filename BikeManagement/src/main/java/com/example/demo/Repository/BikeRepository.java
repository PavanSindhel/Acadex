package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.*;
public interface BikeRepository extends JpaRepository<Bike,Long>{

}
