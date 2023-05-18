Feature: PHP travels currency switcher

  Background:
    Given the home page is opened

  Scenario Outline: Change currencies
    When the 'Currency Switch' button is clicked
    And the '<currency>' currency is selected
    Then the '<priceText>' price is shown
    Examples:
      | currency | priceText     |
      | GBP      | GBP 597.5697  |
      | SAR      | SAR 2925.312  |
      | EUR      | EUR 717.015   |
      | PKR      | PKR 147719.52 |
