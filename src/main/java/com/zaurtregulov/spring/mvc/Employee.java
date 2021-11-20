package com.zaurtregulov.spring.mvc;

import com.zaurtregulov.spring.mvc.validation.CheckEmail;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Setter
@Getter
@ToString
public class Employee {
  @Size(min = 2, message = "имя д.б. не менее 2 символов")
  private String name;

//  @NotEmpty(message = "фамилия обязательна")
  @NotBlank(message = "фамилия обязательна")
  private String surname;

  @Min(value = 500, message = "зарплата д.б. больше 499")
  @Max(value = 1500, message = "зарплата д.б. меньше 1501")
  private int salary;
  private String department;
  private String carBrand;
  private String[] languages;

  @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "номер должен соответствовать шаблону ХХХ-ХХ-ХХ")
  private String phoneNumber;

  @CheckEmail(value = "abc.com", message = "мыйло кончается на abc.com")
  private String email;


  @ToString.Exclude
  private Map<String, String> departments;
  @ToString.Exclude
  private Map<String, String> carBrands;
  @ToString.Exclude
  private Map<String, String> langList;

  public Employee() {
    departments = new LinkedHashMap<>();
    departments.put("ИТ", "ИТ");
    departments.put("Торговый", "Торговый");
    departments.put("Кадровый", "Кадровый");
    departments.put("Транспортный", "Транспортный");

    carBrands = new LinkedHashMap<>();
    carBrands.put("Жигуль", "Жигуль");
    carBrands.put("Москвич", "Москвич");
    carBrands.put("Запор", "Запор");

    langList = new LinkedHashMap<>();
    langList.put("Английский язык", "Английский");
    langList.put("Немецкий язык", "Немецкий");
    langList.put("Французский язык", "Французский");

  }


}



