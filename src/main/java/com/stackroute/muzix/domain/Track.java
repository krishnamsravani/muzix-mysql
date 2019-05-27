package com.stackroute.muzix.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Track {

    @Id
    private  int id;
    private String name;
    private String comment;
}