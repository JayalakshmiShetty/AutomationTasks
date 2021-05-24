Feature: Criptocurrencies



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