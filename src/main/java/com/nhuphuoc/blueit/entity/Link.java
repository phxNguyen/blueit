package com.nhuphuoc.blueit.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Link {
    @Id @GeneratedValue
    private long id;
    @NonNull
    private String title;
    @NonNull
    private String url;


    // relationship with Comment
}
