package com.example.demo.Controller;
import com.example.demo.entity.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.BikeRepository;
@RestController
@RequestMapping("/api")
public class BikeController {
	@Autowired
	BikeRepository repo;
	@GetMapping("/bikes")
	public List<Bike>getAllbikes(){			
		List<Bike>bikes= repo.findAll();
		return bikes;
	}
	@GetMapping("/bikes/{id}")
	public Bike getbike(@PathVariable int id ) {
		Bike bike =repo.findById((long )id).get();
		return bike;
		
	}
	@PostMapping("/bikes/add")
	public Bike createBike(@RequestBody Bike bike) {
		return repo.save(bike);
		
	}
	@PutMapping("/bikes/update/{id}")
	public Bike updateBike(@PathVariable int id, @RequestBody Bike updatedBike) {
	    Bike bike = repo.findById((long) id).orElseThrow(() -> new RuntimeException("Bike not found"));

	    bike.setBikename(updatedBike.getBikename());
	    bike.setBikemodel(updatedBike.getBikemodel());
	    bike.setBikeprice(updatedBike.getBikeprice());

	    return repo.save(bike);
	}

		
	
	@DeleteMapping("bikes/delete/{id}")
	public void removeBike( @PathVariable int id ) {
		Bike bike=repo.findById((long)id).get();
		repo.delete(bike);
	}

}
