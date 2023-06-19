package com.tistory;

/**
 * @author 민경수
 * @description performance calculator
 * @since 2023.06.19
 **********************************************************************************************************************/
public class PerformanceCalculator {

  protected Performance aPerformance;
  protected Play play;

  public PerformanceCalculator(Performance aPerformance, Play play) {
    this.aPerformance = aPerformance;
    this.play = play;
  }

  public static PerformanceCalculator createPerformanceCalculator(Performance aPerformance, Play aPlay) {
    switch(aPlay.getType()) {
      case "tragedy": return new TragedyCalculator(aPerformance, aPlay);
      case "comedy": return new ComedyCalculator(aPerformance, aPlay);
      default:
        throw new RuntimeException(String.format("알 수 없는 장르: %s", aPlay.getType()));
    }
  }
  public int getAmount() {
    throw new RuntimeException("서브클래스에서 처리하도록 설계되었습니다");
  }

  public int getVolumeCredits() {
    return Math.max(this.aPerformance.getAudience() - 30, 0);
  }

  public Performance getaPerformance() {
    return aPerformance;
  }

  public void setaPerformance(Performance aPerformance) {
    this.aPerformance = aPerformance;
  }

  public Play getPlay() {
    return play;
  }

  public void setPlay(Play play) {
    this.play = play;
  }
}