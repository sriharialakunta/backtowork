package com.example.loginuser.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.loginuser.dto.MovieDto;
import com.example.loginuser.entity.Movie;
import com.example.loginuser.repository.MovieRepository;
import com.example.loginuser.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepository;
	
	public Page<MovieDto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Movie> result = movieRepository.findAll(pageable);
		Page<MovieDto> page = result.map(x -> new MovieDto(x));
		return page;
	} 
 

//	public boolean addMovie(MovieDto movieDto) {
//		// TODO Auto-generated method stub
//
//		Movie movie = null;
//		try {
//		movie = movieRepository.findByTitle(movieDto.getTitle());
//		}
//		catch(Exception M) {
//		}
//		if(movie!=null) {
//			System.out.println("Movie already Exists");
//			return false;
//		}
//		Movie Nmov = new Movie();
//		Nmov.setTitle(movieDto.getTitle());
//		Nmov.setOverAllRating(movieDto.getOverAllRating());
//		Nmov.setAvailable(movieDto.getAvailable());
//		Nmov.setYearOfRelease(movieDto.getYearOfRelease());
//		Movie savedMovie = movieRepository.save(Nmov);
//		if(savedMovie!=null) {
//			System.out.println("New Movie Created");
//			return true;
//		}
//		else {
//			System.out.println( "Movie Creation Failed");
//			return false;
//		}
//	}
	
}