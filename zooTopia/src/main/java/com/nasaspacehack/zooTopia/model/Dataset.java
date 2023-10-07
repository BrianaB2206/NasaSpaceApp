package com.nasaspacehack.zooTopia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity(name = "dataset")
public class Dataset {

    @Id
    private Integer id;

    private String name;

    private String description;
}
