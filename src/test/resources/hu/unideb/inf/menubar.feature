Feature: PHP travels menubar checker

  Background:
    Given the home page is opened

  Scenario Outline: Change menubar element
    When the '<menuElement>' button is clicked
    Then the '<menuText>' menu text is shown
    Examples:
      | menuElement | menuText                     |
      | Hotels      | SEARCH FOR BEST HOTELS       |
      | Flights     | SEARCH FOR BEST FLIGHTS      |
      | Tours       | FIND THE BEST TOURS PACKAGES |
      | Transfers   | BOOK YOUR TRANSFER TODAY     |
