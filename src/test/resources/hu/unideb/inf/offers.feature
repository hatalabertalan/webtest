Feature: PHP travels offer checker

  Background:
    Given the home page is opened

  Scenario Outline: Select offer
    When the 'Offers' button is clicked
    And the '<offerName>' offer is selected
    Then the '<offerText>' offer text is shown
    Examples:
      | offerName | offerText              |
      | Lunch Discount   | Register with us to get a voucher for 1/3 off your food bill Sunday to Friday until Sun 7 Jun. |
