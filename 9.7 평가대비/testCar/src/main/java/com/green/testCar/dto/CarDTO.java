package com.green.testCar.dto;

import lombok.Data;

@Data
public class CarDTO {
  //자동차정보DTO
  private Long modelNum;
  private String modelName;
  private Long carPrice;
  private String productCom;
}
