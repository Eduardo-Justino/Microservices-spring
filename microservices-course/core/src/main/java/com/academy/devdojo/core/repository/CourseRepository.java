package com.academy.devdojo.core.repository;
import com.academy.devdojo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
    
}
