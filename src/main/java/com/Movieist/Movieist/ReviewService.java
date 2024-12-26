package com.Movieist.Movieist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
	
	@Autowired 
	public ReviewRepository rr;
	
	@Autowired
	private MongoTemplate mt;
	
	public Review createReview(String reviewBody, String imdbId) {
		Review review = rr.insert(new Review(reviewBody));
		
		 
		 
		 mt.update(Movies.class)
		 	.matching(Criteria.where("imdbId").is(imdbId))
		 	.apply(new Update().push("reviewIds").value(review))
		 	.first();
		 
		 return review;
	}
}
