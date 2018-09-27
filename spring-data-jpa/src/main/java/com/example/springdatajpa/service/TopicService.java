package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Topic;

public interface TopicService {
    Topic findByTopicName(String topicName);
}
