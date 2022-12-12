package com.example.loginuser.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.loginuser.dto.MovieDto;

public interface MovieService {


	public Page<MovieDto> findAll(Pageable pageable);

//	public boolean addMovie(MovieDto movieDto);
	


}


