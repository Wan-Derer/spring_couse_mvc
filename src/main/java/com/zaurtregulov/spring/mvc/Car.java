package com.zaurtregulov.spring.mvc;

import lombok.Getter;
import org.springframework.stereotype.Component;

//@Component
@Getter
public enum Car {
  Жигуль("Жигуль"),
  Москвич("Москвич"),
  Запор("Запор");

  private String carName;

  Car(String carName) {
    this.carName = carName;
  }
}
