package com.green.testCar.controller;

import com.green.testCar.dto.CarDTO;
import com.green.testCar.dto.SalesDTO;
import com.green.testCar.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/car")
@RequiredArgsConstructor
@Controller
public class CarController {
  private final CarService carService;

  //home화면
  @GetMapping("/home")
  public String home(){
    return "pages/home";
  }

  @GetMapping("/car-info")
  public String carInfo(Model model){
    //차량 제조사 목록
    List<CarDTO> productList = carService.productList();
    model.addAttribute("productList", productList);
    //차량목록
    List<CarDTO> carList = carService.selectCarList();
    model.addAttribute("carList", carList);
    return "pages/car_info";
  }

  //차량등록
  @PostMapping("/reg-car")
  public String regCar(CarDTO carDTO){
    carService.regCar(carDTO);
    return "redirect:/car/car-info";
  }

  //판매정보 등록 페이지
  @GetMapping("/sales-info")
  public String salesInfo(Model model){
    //차량 제조사 목록
    List<CarDTO> productList = carService.productList();
    model.addAttribute("productList", productList);

    return "pages/sales_info";
  }

  //판매정도 등록
  @PostMapping("/reg-sales")
  public String regSales(SalesDTO salesDTO){
    //판매등록 정보
    System.out.println(salesDTO);
    carService.regSales(salesDTO);
    return "pages/sales_info";
  }

}
