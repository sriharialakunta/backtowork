package com.example.loginuser.entity;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "movie")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Movie {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int movie_id;
	@Column(nullable=false)
	private String title;
	@Column(precision = 2, scale = 1)
	private BigDecimal overAllRating;
	private String available;
	private int yearOfRelease;
	private int count;
	
	public Movie() {
		super();
	}

	public Movie(Movie x) {
		super();
	}

	public Movie(int movie_id, String title, BigDecimal overAllRating, String available, int yearOfRelease, int count) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.overAllRating = overAllRating;
		this.available = available;
		this.yearOfRelease = yearOfRelease;
		this.count = count;
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

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
