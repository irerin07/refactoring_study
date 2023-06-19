package com.tistory;

/**
 * @author 민경수
 * @description performance
 * @since 2023.06.17
 **********************************************************************************************************************/
public class Performance {
  private String playId;
  private Integer audience;

  public Performance(String playId, Integer audience) {
    this.playId = playId;
    this.audience = audience;
  }

  public String getPlayId() {
    return playId;
  }

  public Integer getAudience() {
    return audience;
  }
}