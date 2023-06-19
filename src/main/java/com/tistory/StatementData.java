package com.tistory;

import java.util.List;

/**
 * @author 민경수
 * @description statement data
 * @since 2023.06.18
 **********************************************************************************************************************/
public class StatementData {
  private String customer;
  private List<EnrichPerformance> performances;
  private int totalAmount;
  private int totalVolumeCredits;

  public StatementData () {

  }

  public StatementData(String customer, List<EnrichPerformance> performances, int totalAmount, int totalVolumeCredits) {
    this.customer = customer;
    this.performances = performances;
    this.totalAmount = totalAmount;
    this.totalVolumeCredits = totalVolumeCredits;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public List<EnrichPerformance> getPerformances() {
    return performances;
  }

  public void setPerformances(List<EnrichPerformance> performances) {
    this.performances = performances;
  }

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }

  public int getTotalVolumeCredits() {
    return totalVolumeCredits;
  }

  public void setTotalVolumeCredits(int totalVolumeCredits) {
    this.totalVolumeCredits = totalVolumeCredits;
  }

}