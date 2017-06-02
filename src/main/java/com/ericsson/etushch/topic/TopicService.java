package com.ericsson.etushch.topic;

import com.ericsson.etushch.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by etushch on 6/1/2017.
 */
@Service
@ComponentScan({"com.ericsson.etushch"})
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String topicId){
        return topicRepository.findOne(topicId);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
       topicRepository.delete(id);
    }

}
