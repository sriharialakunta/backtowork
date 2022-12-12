package com.example.loginuser.entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "rating")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int rating_id;
	@Column(nullable=false)
	private int user_id;
	@Column(nullable=false)
	private int movie_id;
	@Column(nullable=false)
	private double ratings;
	private String review;
	
	public Rating() {
		super();
	}
	public Rating(int rating_id, int user_id, int ratings, String string) {
		super();
	}
	public Rating(int rating_id, int user_id, int movie_id, double ratings, String review) {
		super();
		this.rating_id = rating_id;
		this.user_id = user_id;
		this.movie_id = movie_id;
		this.ratings = ratings;
		this.review = review;
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
		
	
	
	
}
