package com.example.loginuser.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.loginuser.dto.RatingDto;
import com.example.loginuser.dto.ReviewDto;


public interface RatingService {

	public boolean saveRating(RatingDto ratingDto);

	public Page<ReviewDto> findAll(Pageable pageable, int movie_id);


	

}
