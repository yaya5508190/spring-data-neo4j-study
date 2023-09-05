package com.example.repository.neo4j;

import com.example.model.AssetVMS;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface VMSNeo4jRepository extends Neo4jRepository<AssetVMS, Long> {
}
