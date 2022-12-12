package com.example.loginuser.dto;

import javax.persistence.Column;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingDto {
	
	private int rating_id;
	private int user_id;
	private int movie_id;
	private double ratings;
	private String review;
	@Column(nullable=false,unique=true)
	private String email;
	private String name;
	
	
	public RatingDto(int rating_id, int user_id, int movie_id, double ratings, String review, String email, String name) {
		super();
		this.rating_id = rating_id;
		this.user_id = user_id;
		this.movie_id = movie_id;
		this.ratings = ratings;
		this.review = review;
		this.email = email;
		this.name = name;
	}

	public RatingDto() {
		// TODO Auto-generated constructor stub
	}

	public RatingDto(int rating_id, int user_id, int ratings, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getRating_id() {
		return rating_id;
	}


	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}
	
	
	




}
