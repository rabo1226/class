package com.green.testCar.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SalesDTO {
  //자동차 판매 정보
  private Long salesNum;
  private String ownerName;
  private String ownerTel;
  private String color;
  private LocalDateTime salesDate;
  private Long modelNum;
  private CarDTO carDTO;
}
