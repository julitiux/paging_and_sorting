package com.paging_and_sorting.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "people")
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  UUID id;
  String name;
  String lastname;
  String email;
  @CreationTimestamp
  Date dateCreated;
  @CreationTimestamp
  Date lastUpdated;

}
