package com.github.fehwilinando.scalabilidade.shared.repository;

import com.github.fehwilinando.scalabilidade.shared.domain.Author;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface AuthorQueryRepository extends Repository<Author, Long> {
    Optional<Author> findById(Long authorId);
}
