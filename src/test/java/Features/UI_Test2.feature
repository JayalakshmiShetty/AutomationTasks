Feature: Criptocurrencies


  @Test2
  Scenario: Verify Criptocurrencies Watchlist
    Given I Launch CoinMarketCap
    And I login with email "jayatestuser@gmail.com" and password "Password@123"
    When Add random Criptocurrencies between 5 and 10 to Watchlist
    And I Launch CoinMarketCap in new browser
    And Open Watchlist in new browser
    And Verify that all the selected Criptocurrencies  between 5 and 10 are added to the Watchlist


