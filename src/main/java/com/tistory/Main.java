package com.tistory;

import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    // Sample data
    Map<String, Play> plays = Map.of(
      "hamlet", new Play("Hamlet", "tragedy"),
      "as-like", new Play("As You Like It", "comedy"),
      "othello", new Play("Othello", "tragedy")
    );

    List<Invoice> invoices = List.of(
      new Invoice("BigCo", List.of(
        new Performance("hamlet", 55),
        new Performance("as-like", 35),
        new Performance("othello", 40)
      ))
    );

    Statement statement = new Statement();

    System.out.println(statement.statement(invoices.get(0), plays));
  }

}