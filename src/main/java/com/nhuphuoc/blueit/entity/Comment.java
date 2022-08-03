package com.nhuphuoc.blueit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Comment {
    @Id @GeneratedValue
    private Long id;
    private String body;

    // Relationship with Link
}
