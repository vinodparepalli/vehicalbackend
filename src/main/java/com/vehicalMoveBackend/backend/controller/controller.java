package com.vehicalMoveBackend.backend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicalMoveBackend.backend.model.Coordinate;

@CrossOrigin("https://vinodparepalli.github.io/vehicalMovement/")
@RestController
@RequestMapping("/api")
public class controller {

	@GetMapping("/coordinates")
	public List<Coordinate> getCoordinates() {
	     // Sample data; in a real application, this might come from a database or another service.
	     return Arrays.asList(
	         new Coordinate(new Coordinate.Point(16.5092, 80.6175), new Coordinate.Point(16.5256, 80.6843)),
	         new Coordinate(new Coordinate.Point(16.4957, 80.6542), new Coordinate.Point(16.4346, 80.5662)),
	         new Coordinate(new Coordinate.Point(16.5419, 80.8050), new Coordinate.Point(16.4957, 80.6542)),
	         new Coordinate(new Coordinate.Point(20.9320, 77.7523), new Coordinate.Point(16.3067, 80.4365)),
	         new Coordinate(new Coordinate.Point(16.5238, 80.7914), new Coordinate.Point(16.7107, 81.0952))
	     );
	 }
}
