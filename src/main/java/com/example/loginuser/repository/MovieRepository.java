package com.example.loginuser.repository;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.loginuser.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie ,Integer>{
	
	@Query(nativeQuery = true, value="select * from user where title=?1")
	Movie findByTitle(String title);
	
	@Modifying
    @Transactional
    @Query(nativeQuery = true, value="update movie set over_all_rating=?2, count=?3 where movie_id=?1")
		void setRating(int movieId, BigDecimal value, int count);
	
	
}