Feature: PHP travels offer checker

  Background:
    Given the home page is opened

  Scenario Outline: Select offer
    When the 'Offers' button is clicked
    And the '<offerName>' offer is selected
    Then the '<offerImage>' offer image is shown
    Examples:
      | offerName              | offerImage                                                         |
      | Lunch Discount         | https://phptravels.net/api/uploads/images/offers/349121_lunch.jpg  |
      | Rent Car               | https://phptravels.net/api/uploads/images/offers/301361_cars.jpg   |
      | Cheap Flights Tickets  | https://phptravels.net/api/uploads/images/offers/94849_fly.jpg     |
      | 3 Nights Aegean Cruise | https://phptravels.net/api/uploads/images/offers/839019_cruise.jpg |
