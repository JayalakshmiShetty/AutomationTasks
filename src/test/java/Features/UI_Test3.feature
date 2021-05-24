Feature: Criptocurrencies
Feature: Compare the results after filtering the data
As an end user of the coinmarketcap website
User should be able to click view full list options
User should be able to filter the price of the currencies
verify that proper results are shown on filtering

  @Test3 @ExistingFilter @Tests
  Scenario: Verify Criptocurrencies Ranking with Existing Filter
    Given I Launch CoinMarketCap
    When I click "Ranking" from Cryptocurrencies dropdown
    And Record all records in the page
    And Select Existing Filter Combination For Industry "Marketplace"
    Then Verify that Results are compared with Ranking page

#  @Test3 @NewFilter
#  Scenario: Verify Criptocurrencies Ranking with New Filter
#    Given I Launch CoinMarketCap
#    When I click "Ranking" from Cryptocurrencies dropdown
#    And Record Price in the Page
#    And Select Filter price Combination From "100" to "999900000"
#    Then Compare the price Combination From 100 to 999900000 with Ranking page data
#