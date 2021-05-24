Feature: Criptocurrencies
  As an end user of the coinmarketcap website
  User clicks select 100 rows
  Verify 100 rows are displaying appropriately

@Test1 @Tests
  Scenario: Verify Criptocurrencies Count
    Given I Launch CoinMarketCap
    When I choose View 100 rows
    Then Verify that 100 results are displayed
