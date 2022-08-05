package com.nhuphuoc.blueit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Comment {
    @Id @GeneratedValue
    private Long id;
    private String body;

    // Relationship with Link
    @ManyToOne()
    private Link link;
}
