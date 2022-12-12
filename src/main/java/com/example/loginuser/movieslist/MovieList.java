package com.example.loginuser.movieslist;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieList {
   static final String DB_URL = "jdbc:mysql://localhost/movie-review";
   static final String USER = "root";
   static final String PASS = "Mysqlwork@6";

   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         // Execute a query
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO movie VALUES (1001, 'Zee5', 0, 0, 'VR', 2022)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1002, 'Hotstar', 0, 0, 'RRR', 2022)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1003, 'Prime Video', 0, 0, 'Pushpa', 2021)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1004, 'Aha', 0, 0, 'Eega', 2012)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1005, 'Netflix', 0, 0, 'I', 2015)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1006, 'Hotstar', 0, 0, 'Masuda', 2022)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1007, 'Zee5', 0, 0, 'Guru', 2018)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1008, 'Netflix', 0, 0, 'PS-I', 2022)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1009, 'Hotstar', 0, 0, 'Bhaubali 1', 2015)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1010, 'Zee5', 0, 0, 'Bhramastra', 2022)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO movie VALUES (1012, 'Netflix', 0, 0, 'Saho', 2019)";
	         stmt.executeUpdate(sql);
	         
	         
	         stmt.close();
	         conn.close();
	         System.out.println("Inserted records into the table...");   
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	}
}
