Feature: Criptocurrencies


@Test1
  Scenario: Verify Criptocurrencies Count
    Given I Launch CoinMarketCap
    When I choose View 100 rows
    Then Verify that 100 results are displayed
