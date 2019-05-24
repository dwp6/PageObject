@allTests
  Feature: run a simple test

    Scenario: Search on google
      Given that I am on the google home page
      When I enter BPDTS in the search engine
      Then results should show