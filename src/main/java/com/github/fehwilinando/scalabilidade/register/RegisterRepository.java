package com.github.fehwilinando.scalabilidade.register;

import com.github.fehwilinando.scalabilidade.shared.domain.Author;
import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import com.github.fehwilinando.scalabilidade.shared.repository.CourseCommandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class RegisterRepository {
    private CourseCommandRepository courseRepository;
    private AuthorRepository authorRepository;


    public Optional<Author> findAuthor(Long authorId) {
        return authorRepository.findById(authorId);
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }
}
