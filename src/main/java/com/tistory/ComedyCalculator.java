package com.tistory;

/**
 * @author 민경수
 * @description comedy calculator
 * @since 2023.06.19
 **********************************************************************************************************************/
public class ComedyCalculator extends PerformanceCalculator{
  public ComedyCalculator(Performance aPerformance, Play play) {
    super(aPerformance, play);
  }

  @Override
  public int getAmount() {
    int result = 30000;
    if (this.aPerformance.getAudience() > 20) {
      result += 10000 + 500 * (this.aPerformance.getAudience() - 20);
    }
    result += 300 * this.aPerformance.getAudience();
    return result;
  }

  @Override
  public int getVolumeCredits() {
    return super.getVolumeCredits() + (int) Math.floor(this.aPerformance.getAudience() / 5.0);
  }

}