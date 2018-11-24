package com.github.fehwilinando.scalabilidade.register;

import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import lombok.Data;

@Data
class NewCourseRequest {
    private String courseName;
    private Long authorId;
}
