package com.green.testCar.service;

import com.green.testCar.dto.CarDTO;
import com.green.testCar.dto.SalesDTO;
import com.green.testCar.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarService {
  private final CarMapper carMapper;

  //제조사 목록 조회 기능
  public List<CarDTO> productList(){
    return carMapper.productList();
  }
  //차량목록 조회 기능
  public List<CarDTO> selectCarList(){
    return carMapper.selectCarList();
  }

  //차량등록 기능
  public void regCar(CarDTO carDTO){
    carMapper.regCar(carDTO);
  }

  //판매정보 등록 기능
  public void regSales(SalesDTO salesDTO){
    carMapper.regSales(salesDTO);
  }
}
