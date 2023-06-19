package com.tistory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 민경수
 * @description create statement data
 * @since 2023.06.19
 **********************************************************************************************************************/
public class CreateStatementData {

  public static StatementData createStatementData(Invoice invoice, Map<String, Play> plays) {
    StatementData statementData = new StatementData();

    statementData.setCustomer(invoice.getCustomer());
    statementData.setPerformances(invoice.getPerformances().stream().map((Performance aPerformance) -> enrichPerformance(aPerformance, plays)).collect(Collectors.toList()));
    statementData.setTotalAmount(totalAmount(statementData));
    statementData.setTotalVolumeCredits(totalVolumeCredits(statementData));

    return statementData;
  }

  public static EnrichPerformance enrichPerformance(Performance aPerformance, Map<String, Play> plays) {
    PerformanceCalculator calculator = PerformanceCalculator.createPerformanceCalculator(aPerformance, playFor(plays, aPerformance));
    EnrichPerformance result = new EnrichPerformance(aPerformance);
    result.setPlay(calculator.getPlay());
    result.setAmount(calculator.getAmount());
    result.setVolumeCredits(calculator.getVolumeCredits());

    return result;
  }

  private static int totalAmount(StatementData statementData) {
    return statementData.getPerformances()
      .stream().reduce(0, (total, p1) -> total + p1.getAmount(), Integer::sum);
  }

  private static int totalVolumeCredits(StatementData statementData) {
    return statementData.getPerformances()
      .stream().reduce(0, (total, p1) -> total + p1.getVolumeCredits(), Integer::sum);
  }

  private static Play playFor(Map<String, Play> plays, Performance aPerformance) {
    return plays.get(aPerformance.getPlayId());
  }

}