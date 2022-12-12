package com.example.loginuser.dto;
import com.example.loginuser.entity.Rating;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDto {
	private String review;
	private int user_id;
	
	public ReviewDto(String review, int user_id) {
		super();
	
		this.review = review;
		this.user_id = user_id;
	}
	
	public ReviewDto(Rating rating) {
		// TODO Auto-generated constructor stub

		user_id = rating.getUser_id();
		review = rating.getReview();
	}

	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
