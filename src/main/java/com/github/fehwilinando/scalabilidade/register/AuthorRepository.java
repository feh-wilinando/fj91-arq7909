package com.github.fehwilinando.scalabilidade.register;

import com.github.fehwilinando.scalabilidade.shared.repository.AuthorCommandRepository;
import com.github.fehwilinando.scalabilidade.shared.repository.AuthorQueryRepository;

public interface AuthorRepository extends AuthorQueryRepository, AuthorCommandRepository {
}
