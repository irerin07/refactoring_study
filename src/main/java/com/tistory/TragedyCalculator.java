package com.tistory;

/**
 * @author 민경수
 * @description tragedy calculator
 * @since 2023.06.19
 **********************************************************************************************************************/
public class TragedyCalculator extends PerformanceCalculator{
  public TragedyCalculator(Performance aPerformance, Play play) {
    super(aPerformance, play);
  }

  @Override
  public int getAmount() {
    int result = 40000;
    if (this.aPerformance.getAudience() > 30) {
      result += 1000 * (this.aPerformance.getAudience() - 30);
    }
    return result;
  }

}