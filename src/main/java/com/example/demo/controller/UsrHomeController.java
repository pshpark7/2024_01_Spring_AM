package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	
	@RequestMapping("/usr/home/getList")
	@ResponseBody
	public List<String> getList() {
		List<String> list = new ArrayList<>();
		list.add("야구");
		list.add("축구");
		return list;

	}
	@RequestMapping("/usr/home/getMap")
	@ResponseBody
	public Map<String, Object> getMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("야구", "baseball");
		map.put("축구", "soccer");
		
		return map;

	}

	@RequestMapping("/usr/home/getInt")
	@ResponseBody
	public int getint() {
		return 1;

	}

	@RequestMapping("/usr/home/getString")
	@ResponseBody
	public String getString() {
		return "abc";

	}
	@RequestMapping("/usr/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true;

	}
	@RequestMapping("/usr/home/getDouble")
	@ResponseBody
	public double getDouble() {
		return 3.3;

	}
	

	@RequestMapping("/usr/home/getArticle")
	@ResponseBody
	public Article getArticle() {
		Article article = new Article(1, "제목1");
		
		return article;

	}

}
