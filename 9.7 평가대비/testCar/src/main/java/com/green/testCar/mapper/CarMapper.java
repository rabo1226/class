package com.green.testCar.mapper;

import com.green.testCar.dto.CarDTO;
import com.green.testCar.dto.SalesDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
  //제조사 목록조뢰
  List<CarDTO> productList();
  //차량 정보 목록 조회
  List<CarDTO> selectCarList();

  //차량등록 쿼리
  void regCar(CarDTO carDTO);

  //판매정보 등록 쿼리
  void regSales(SalesDTO salesDTO);

  //판매목록 조회 쿼리
  List<SalesDTO> selectSalesList();
}
