package com.example.repository.neo4j;

import com.example.model.MovieEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import reactor.core.publisher.Mono;

import java.util.List;

public interface MovieRepository extends Neo4jRepository<MovieEntity, String> {
    List<MovieEntity> findOneByTitle(String title);
}
