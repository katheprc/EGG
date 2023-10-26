package com.egg.Ejercicio1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.Ejercicio1.entity.News;
import com.egg.Ejercicio1.repository.NewsRepository;

@Service
public class NewsService {

	@Autowired
	NewsRepository nRepo;

	public void saveNews(News news) {
		try {
			validarStr(news.getTitle());
			nRepo.save(news);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteNews(News news) {
		nRepo.delete(news);
	}

	public News buscarPorId(Integer id) {
		try {
			validar(id);
			return nRepo.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<News> buscarPorTitulo(String title) {
		try {
			validarStr(title);
			return nRepo.findByTitle(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Transactional
	public void modifyTitle(String title, String id) {

		Optional<News> responseAuthor = nRepo.findById(id);

		if (responseAuthor.isPresent()) {

			News news = new News();

			news.setTitle(title);

			nRepo.save(news);

		}

	}

	@Transactional
	public void modifyBody(String body, String id) {

		Optional<News> responseAuthor = nRepo.findById(id);

		if (responseAuthor.isPresent()) {

			News news = new News();

			news.setTitle(body);

			nRepo.save(news);

		}

	}
	
	public List<News> listNews(){
		List<News> list = new ArrayList<>();
		list.addAll(nRepo.findAll());
		return list;
	}
	
	

	public void validar(Integer num) throws Exception {
		if (num == null) {
			throw new Exception("El campo no puede ser null");
		}
	}

	public void validarStr(String string) throws Exception {
		if (string == null || string.isEmpty()) {
			throw new Exception("El campo no puede ser null o vacío");
		}
	}

}
