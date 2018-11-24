package com.github.fehwilinando.scalabilidade.catalog;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@AllArgsConstructor
public class CatalogController {

    private CatalogRepository repository;

    @GetMapping("courses")
    public List<CourseResponse> getAllCourses() {
        return repository.findAll()
                    .map(CourseResponse::new)
                        .collect(toList());
    }
}
