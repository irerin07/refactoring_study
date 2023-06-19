package com.tistory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 민경수
 * @description invoice
 * @since 2023.06.17
 **********************************************************************************************************************/
public class Invoice {
  private String customer;
  List<Performance> performances = new ArrayList<>();

  public Invoice(String customer, List<Performance> performances) {
    this.customer = customer;
    this.performances = performances;
  }

  public String getCustomer() {
    return customer;
  }

  public List<Performance> getPerformances() {
    return performances;
  }
}