package com.nhuphuoc.blueit.entity;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Vote extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    // user
    // link


}
