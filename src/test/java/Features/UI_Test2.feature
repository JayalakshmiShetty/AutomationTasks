Feature: Add few random crypto currencies to watchlist and verify
  As an end user of the coinmarketcap website
  User should select few currencies to add to watchlist
  Verify that the crypto currencies are added to watchlist

  @Test2 @Tests
  Scenario: Verify that randomly selected Criptocurrencies added to Watchlist
    Given I Launch CoinMarketCap
    And I login with email "jayatestuser@gmail.com" and password "Password@123"
    When Add random Criptocurrencies between 5 and 10 to Watchlist
    And I Launch CoinMarketCap in new browser
    And Open Watchlist in new browser
    And Verify that all the selected Criptocurrencies  between 5 and 10 are added to the Watchlist


