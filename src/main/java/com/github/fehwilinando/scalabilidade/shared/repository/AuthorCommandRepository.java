package com.github.fehwilinando.scalabilidade.shared.repository;

import com.github.fehwilinando.scalabilidade.shared.domain.Author;
import org.springframework.data.repository.Repository;

public interface AuthorCommandRepository extends Repository<Author, Long> {
    void save(Author author);
}
