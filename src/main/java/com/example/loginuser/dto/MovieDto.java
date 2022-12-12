package com.example.loginuser.dto;

import java.math.BigDecimal;

import com.example.loginuser.entity.Movie;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MovieDto {
	
	private int movie_id;
	private String title;
	private int yearOfRelease;
	private BigDecimal overAllRating;
	private String available;
	
	public MovieDto(int movie_id, String title, int yearOfRelease, BigDecimal overAllRating, String available) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.yearOfRelease = yearOfRelease;
		this.overAllRating = overAllRating;
		this.available = available; 
	}
	public MovieDto(Movie movie) {
		// TODO Auto-generated constructor stub
		super();
		movie_id = movie.getMovie_id();
		title = movie.getTitle();
		overAllRating = movie.getOverAllRating();
		available = movie.getAvailable();
		yearOfRelease = movie.getYearOfRelease(); 
		
	}
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public BigDecimal getOverAllRating() {
		return overAllRating;
	}
	public void setOverAllRating(BigDecimal overAllRating) {
		this.overAllRating = overAllRating;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}

}
