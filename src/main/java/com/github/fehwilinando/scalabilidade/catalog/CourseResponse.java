package com.github.fehwilinando.scalabilidade.catalog;

import com.github.fehwilinando.scalabilidade.shared.domain.Course;

public class CourseResponse {
    private final Course course;

    public CourseResponse(Course course) {
        this.course = course;
    }


    public String getTitle() {
        return course.getTitle();
    }

    public String getAuthor() {
        return course.getAuthorName();
    }

}
