package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;
import com.example.demo.service.DemoService;


@RestController
public class DemoController {

	@Autowired
	private DemoService service;
	
	@GetMapping("/all")
	public List<Topic> getAllTopics() {
		return service.getAllTopics();
	}
	
	@GetMapping("/get/{id}")
	public Topic getTopicById(@PathVariable("id") String id) {
		return service.getAllTopicById(id);
	}
	
	@PostMapping("/create")
	public List<Topic> createTopicById(@RequestBody Topic topic) {
		return service.createTopic(topic);
	}
	
	@PutMapping("/update/{id}")
	public List<Topic> updateTopicById(@RequestBody Topic topic, @PathVariable("id") String id) {
		return service.updateTopicById(topic, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Topic> deleteTopicById(@PathVariable("id") String id) {
		return service.deleteTopicById(id);
	}
	
}
