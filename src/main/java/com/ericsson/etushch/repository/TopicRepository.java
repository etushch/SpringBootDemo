package com.ericsson.etushch.repository;

import com.ericsson.etushch.topic.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by etushch on 6/2/2017.
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
