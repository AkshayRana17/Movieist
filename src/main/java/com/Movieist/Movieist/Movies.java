package com.Movieist.Movieist;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor


public class Movies {
	@Id
	private ObjectId id;
	
	@JsonProperty("title")
    private String title;

    @JsonProperty("imdbId")
    private String imdbId;

    @JsonProperty("trailerLink")
    private String trailerLink;

    @JsonProperty("poster")
    private String poster;

    @JsonProperty("releaseDate")
    private String releaseDate;

    @JsonProperty("genres")
    private List<String> genres;

    @JsonProperty("backdrops")
    private List<String> backdrops;
	
	@DocumentReference 
	@JsonProperty("reviewIds")
	private List<Review> reviewIds;
}
