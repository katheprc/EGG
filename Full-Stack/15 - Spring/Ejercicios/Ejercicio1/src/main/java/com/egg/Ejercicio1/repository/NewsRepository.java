package com.egg.Ejercicio1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.egg.Ejercicio1.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News, String>{
	
	@Query("SELECT n FROM News n where n.title = :title")
	public List<News> findByTitle(@Param("title") String title);
	
	@Query("SELECT n FROM News n where n.id = :id")
	public News findById(@Param("id") Integer id);
	
}
