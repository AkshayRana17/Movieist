package com.Movieist.Movieist;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@Data
@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor
	
public class Review {
	@Id
	@JsonProperty
	private ObjectId id;
	@JsonProperty
	private String body;
	
	public Review(String body) {
		this.body =body;
	}
}
	