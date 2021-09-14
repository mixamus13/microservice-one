package com.example.microserviceone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@RequiredArgsConstructor
public class Person {

  @Id
  @GeneratedValue
  private long id;
  private String username;
  private String lastname;
  private String email;
  private int age;
  private String address;
}
