Feature: PHP travels menubar checker

  Background:
    Given the home page is opened

  Scenario Outline: Change menubar element
    When the '<menuElement>' button is clicked
    Then the '<titleText>' title text is shown
    Examples:
      | menuElement | titleText                     |
      | Hotels      | Search Hotels - PHPTRAVELS    |
      | Flights     | Search flights - PHPTRAVELS   |
      | Tours       | Search Tours - PHPTRAVELS     |
      | Transfers   | Search Transfers - PHPTRAVELS |
