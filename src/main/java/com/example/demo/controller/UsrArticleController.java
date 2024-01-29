package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;

@Controller
public class UsrArticleController {
	int lastArticleId;
	List<Article> articles;

	public UsrArticleController() {
		lastArticleId = 0;
		articles = new ArrayList<>();

		makeTestData();
	}

	private void makeTestData() {
		for (int i = 1; i <= 10; i++) {
			String title = "제목" + i;
			String body = "내용" + i;

			writeArticle(title, body);
		}
	}

	public Article writeArticle(String title, String body) {
		int id = lastArticleId + 1;
		Article article = new Article(id, title, body);
		articles.add(article);
		lastArticleId++;

		return article;
	}

	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		Article article = writeArticle(title, body);
		return article;
	}

	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articles;
	}

	@RequestMapping("/usr/article/doDelete")
	@ResponseBody
	public String doDelete(int id) {
		Article article = getArticle(id);
		if (article == null) {
			return String.format("%d번 글은 없습니다.", id);
		}
		deleteArticle(id);
		return String.format("%d번 글이 삭제되었습니다", id);
	}

	private void deleteArticle(int id) {
		Article article = getArticle(id);
		articles.remove(article);
	}

	private Article getArticle(int id) {
		for (Article article : articles) {
			if(article.getId() == id) {
				return article;
			}
		}
		return null;
	}

	@RequestMapping("/usr/article/doModify")
	@ResponseBody
	public Object doModify(int id, String title, String body) {
		Article foundarticle = articles.get(id - 1);
		if (foundarticle == null) {
			return String.format("%d번 글은 없습니다.", id);
		}
		foundarticle.setTitle(title);
		foundarticle.setTitle(body);
		return foundarticle + String.format("%d번 글이 수정되었습니다", id);
	}


}
