package com.ericsson.etushch.repository;

import com.ericsson.etushch.course.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by etushch on 6/2/2017.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, String>{
    public List<Course> findByTopicId(String topicId);
}
