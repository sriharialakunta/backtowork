package com.example.loginuser.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.loginuser.dto.RatingDto;
import com.example.loginuser.entity.Rating;
import com.example.loginuser.repository.RatingRepository;
import com.example.loginuser.service.RatingService;

@RunWith(SpringRunner.class)
@SpringBootTest 
class RatingControllerTest {

		@Autowired 
	  	private RatingService ratingService;
		
		@MockBean 
	  	private RatingRepository ratingRepository;

//		@Test
//		void getReviewTest() {
//			when(reviewRepository.findAll()).thenReturn((List<Review>) Stream.of(new Review(1, 2, "good",5)).collect(Collectors.toList()));
//			assertEquals(1,reviewService.getAllReviewDetails().size());
//			
//		}
		 
		@Test
		public void saveRatingTest() {
			Rating review = new Rating(1, 2, 5,"good");
			RatingDto review1 = new RatingDto(1, 2, 5,"good");
			when(ratingRepository.save(review)).thenReturn(review);
			assertEquals(review, ratingService.saveRating(review1));
		}

	}
