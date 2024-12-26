package com.Movieist.Movieist;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {
	
	@Autowired 
	private MovieService ms;
	
	@GetMapping
	public ResponseEntity<List<Movies>> getallMovies() {
		return new ResponseEntity<List<Movies>> (ms.allMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movies>> getsingleMovie(@PathVariable String imdbId) {
		return new ResponseEntity<Optional<Movies>> (ms.singlemovie(imdbId), HttpStatus.OK);
	}
}
