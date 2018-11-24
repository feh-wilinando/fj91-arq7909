package com.github.fehwilinando.scalabilidade.shared.repository;

import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import org.springframework.data.repository.Repository;

public interface CourseCommandRepository extends Repository<Course, Long> {
    void save(Course course);
}
