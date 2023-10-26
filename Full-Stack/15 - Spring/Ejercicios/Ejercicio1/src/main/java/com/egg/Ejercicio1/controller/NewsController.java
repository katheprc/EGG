package com.egg.Ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.Ejercicio1.entity.News;
import com.egg.Ejercicio1.service.NewsService;

@Controller
@RequestMapping("/")
public class NewsController {

	@Autowired
	NewsService nSrv;

	@GetMapping("/")
	public String index() {
		return "index.html";
	}

	@PostMapping("/guardar")
	public String guardar(@RequestParam("title") String title, @RequestParam("body") String body) {
		News news = new News();
		news.setTitle(title);
		news.setBody(body);
		nSrv.saveNews(news);
		return "index.html";
	}
	
	@PostMapping("/eliminar")
	public String eliminar(@RequestParam("title") String title) {
		List<News> news = nSrv.buscarPorTitulo(title);
		
		for(News nnews : news) {
			nSrv.deleteNews(nnews);
		}
		
		return "index.html";
	}

	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<News> listaNews = nSrv.listNews();
		
		model.addAttribute("listaNews", listaNews);
		
		return "index.html";
	}

}
