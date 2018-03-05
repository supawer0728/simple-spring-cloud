package com.parfait.simplespringcloud.board.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/boards", collectionResourceRel = "boards")
public interface BoardRepository extends JpaRepository<Board, Long> {
}
