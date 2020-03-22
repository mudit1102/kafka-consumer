package com.kafka.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private String name;
  private String dept;
  private Long salary;

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", dept='" + dept + '\'' +
        ", salary=" + salary +
        '}';
  }
}
