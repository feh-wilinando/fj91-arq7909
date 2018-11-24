package com.github.fehwilinando.scalabilidade.register;

import com.github.fehwilinando.scalabilidade.shared.domain.Author;
import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RegisterService {

    private RegisterRepository repository;

    Optional<Course> createCourseBy(NewCourseRequest request) {

        Optional<Course> courseOptional = repository.findAuthor(request.getAuthorId())
                                                .map(author -> new Course(request.getCourseName(), author));


        courseOptional.ifPresent(repository::saveCourse);

        return courseOptional;
    }

    Author createAuthorBy(NewAuthorRequest request) {

        Author author = new Author(request.getName());

        repository.saveAuthor(author);

        return author;
    }
}
