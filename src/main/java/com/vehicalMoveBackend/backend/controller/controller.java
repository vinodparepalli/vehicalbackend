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
	         new Coordinate(new Coordinate.Point(28.2380, 83.9956), new Coordinate.Point(28.2370, 83.9950)),
	         new Coordinate(new Coordinate.Point(28.2370, 83.9950), new Coordinate.Point(28.2360, 83.9940)),
	         new Coordinate(new Coordinate.Point(28.2360, 83.9940), new Coordinate.Point(28.2350, 83.9930)),
	         new Coordinate(new Coordinate.Point(28.2350, 83.9930), new Coordinate.Point(28.2340, 83.9920)),
	         new Coordinate(new Coordinate.Point(28.2340, 83.9920), new Coordinate.Point(28.2330, 83.9910))
	     );
	 }
}
