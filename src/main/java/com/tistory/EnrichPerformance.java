package com.tistory;

/**
 * @author 민경수
 * @description enrich performance
 * @since 2023.06.19
 **********************************************************************************************************************/
public class EnrichPerformance {
  private String playId;
  private int audience;
  private Play play;
  private int amount;
  private int volumeCredits;

  EnrichPerformance(Performance performance) {
    this.playId = performance.getPlayId();
    this.audience = performance.getAudience();
  }

  public String getPlayId() {
    return playId;
  }

  public void setPlayId(String playId) {
    this.playId = playId;
  }

  public int getAudience() {
    return audience;
  }

  public void setAudience(int audience) {
    this.audience = audience;
  }

  public Play getPlay() {
    return play;
  }

  public void setPlay(Play play) {
    this.play = play;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getVolumeCredits() {
    return volumeCredits;
  }

  public void setVolumeCredits(int volumeCredits) {
    this.volumeCredits = volumeCredits;
  }
}