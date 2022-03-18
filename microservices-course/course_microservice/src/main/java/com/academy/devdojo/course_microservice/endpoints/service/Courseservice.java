package com.academy.devdojo.course_microservice.endpoints.service;

import com.academy.devdojo.core.model.Course;
import com.academy.devdojo.core.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )

public class Courseservice {
    
    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable){
        log.info("list all courses");
        return courseRepository.findAll(pageable);
        
    }


}
