package com.Movieist.Movieist;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MoviesRepository mr;
	
	public List<Movies> allMovies() {
		   List<Movies> movies = mr.findAll();
	        System.out.println(movies); // Debugging
	        return movies;
	    }
	public Optional<Movies> singlemovie(String imdbId)
	{
		return mr.findMovieByImdbId(imdbId);
	}
}
