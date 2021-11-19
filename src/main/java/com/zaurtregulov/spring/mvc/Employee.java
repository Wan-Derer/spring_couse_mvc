package com.zaurtregulov.spring.mvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Employee {
  private String name;
  private String surName;
  private int salary;
  private String department;



}
