package com.example.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Person")
@Data
public class PersonEntity {
    @Id
    private final String name;
    private final Integer born;
    //Getters omitted
}
