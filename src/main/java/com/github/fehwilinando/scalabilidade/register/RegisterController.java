package com.github.fehwilinando.scalabilidade.register;

import com.github.fehwilinando.scalabilidade.shared.domain.Author;
import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.notFound;

@AllArgsConstructor
@RestController
public class RegisterController {


    private final RegisterService service;

    @PostMapping("courses")
    public ResponseEntity<Course> registerCourse(@RequestBody @Valid NewCourseRequest request) {
        Optional<Course> course = service.createCourseBy(request);

        URI uri = URI.create("course/" + course.map(Course::getId).orElse(0L));

        return course.map(created(uri)::body).orElseGet(notFound()::build);
    }

    @PostMapping("authors")
    public  ResponseEntity<?> registerAuthor(@RequestBody @Valid NewAuthorRequest request) {
        Author author = service.createAuthorBy(request);

        URI uri = URI.create("course/" + author.getId());

        return created(uri).body(author);
    }
}
