package com.tistory;

/**
 * @author 민경수
 * @description play
 * @since 2023.06.17
 **********************************************************************************************************************/
public class Play {
  private String name;
  private String type;

  public Play(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }
}