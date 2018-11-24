package com.github.fehwilinando.scalabilidade;

import com.github.fehwilinando.scalabilidade.shared.domain.Author;
import com.github.fehwilinando.scalabilidade.shared.domain.Course;
import com.github.fehwilinando.scalabilidade.shared.repository.AuthorCommandRepository;
import com.github.fehwilinando.scalabilidade.shared.repository.CourseCommandRepository;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@EnableAdminServer
@SpringBootApplication
public class ScalabilidadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalabilidadeApplication.class, args);
    }

    @Autowired
    private CourseCommandRepository courseCommandRepository;

    @Autowired
    private AuthorCommandRepository authorCommandRepository;

    @PostConstruct
    public void populate(){
        Author fernando = new Author("Fernando");
        Author willian = new Author("willian");

        authorCommandRepository.save(fernando);
        authorCommandRepository.save(willian);


        courseCommandRepository.save(new Course("Spring", fernando));
        courseCommandRepository.save(new Course("Architecture", fernando));
        courseCommandRepository.save(new Course("Microservices", willian));
    }

}
