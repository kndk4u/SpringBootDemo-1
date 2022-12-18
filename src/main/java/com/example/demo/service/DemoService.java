package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Topic;

@Service
public class DemoService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("101","Java","Java Desc"),
			new Topic("102","Springboot","Springboot Desc"),
			new Topic("103","AWS","AWS Desc")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getAllTopicById(String id) {
		return topics.stream()
					.filter(t -> t.getId().equals(id))
					.findFirst()
					.get();
	}

	public List<Topic> createTopic(Topic topic) {
		topics.add(topic);
		return topics;
	}

	public List<Topic> updateTopicById(Topic topic, String id) {
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		return topics;
	}

	public List<Topic> deleteTopicById(String id) {
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
				break;
			}
		}
		return topics;
	} 
	
	
	
}
