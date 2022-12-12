package com.example.loginuser.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.loginuser.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating,Integer>{
	
	@Query(nativeQuery = true, value="select * from rating where user_id=?1 and movie_id=?2")
	Rating findByIds(int user_id, int movie_id);
	
	@Query(nativeQuery = true, value="select * from rating where movie_id=?1")
	Page<Rating> retrieveAllReviews(Pageable pageable,int movie_id);
	
	@Query(nativeQuery = true, value="select movie_id from rating where movie_id=?1")
	Boolean findMovieId(int movie_id);
	

	

	
	
}
