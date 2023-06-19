package com.tistory;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author 민경수
 * @description statement
 * @since 2023.06.17
 **********************************************************************************************************************/
public class Statement {

  public Statement() {

  }

  public String statement(Invoice invoice, Map<String, Play> plays) {
    StatementData statementData = CreateStatementData.createStatementData(invoice, plays);
    return renderPlainText(statementData);
  }

  public String renderPlainText(StatementData statementData) {
    StringBuilder result = new StringBuilder("Statement for " + statementData.getCustomer() + "\n");

    for (EnrichPerformance performance : statementData.getPerformances()) {
      result.append(String.format("%s: $%d %d seats\n",performance.getPlay().getName(), performance.getAmount() / 100, performance.getAudience()));
    }

    result.append(String.format("Amount owed is $%s\n", usd(statementData.getTotalAmount())));
    result.append(String.format("You earned %d credits", statementData.getTotalVolumeCredits()));

    return result.toString();
  }

  private String renderHtml(StatementData statementData) {
    StringBuilder result = new StringBuilder(String.format("<h1> Statement for %s)\n </h1>", statementData.getCustomer()));
    result.append("<table> \n");
    for (EnrichPerformance performance : statementData.getPerformances()) {
      result.append(String.format(
        "<tr><td> %s: </td> <td> $%d </td> <td> %d seats </td></tr>\n",
        performance.getPlay().getName(),
        performance.getAmount() / 100,
        performance.getAudience()
        )
      );
    }

    result.append("</table>\n");
    result.append("<tr><th> play </th> <th> seats </th> <th> cost </th>");
    result.append(String.format("Amount owed is $%d\n", usd(statementData.getTotalAmount())));
    result.append(String.format("You earned %d credits", statementData.getTotalVolumeCredits()));
    return result.toString();
  }

  public String usd(double aNumber) {
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
    format.setMinimumFractionDigits(2);

    return format.format(aNumber/100);
  }

}