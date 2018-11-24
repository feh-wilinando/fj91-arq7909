package com.github.fehwilinando.scalabilidade.shared.repository;

import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import org.springframework.data.repository.Repository;

import java.util.stream.Stream;

public interface CourseQueryRepository extends Repository<Course, Long> {
    Stream<Course> findAll();
}
