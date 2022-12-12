package com.example.loginuser.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//import com.example.loginuser.dto.UserDto;
import com.example.loginuser.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	@Query(nativeQuery = true, value="select * from user where email=?1")
	User findByEmail(String email);

	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(nativeQuery = true , value="update user set password=?1 where email=?2")
	void setPassword(String newPass,String email);

	@Query(nativeQuery = true, value="select name from user where user_id=?1")
	String findAllNames(int user_id);

	
	

}
