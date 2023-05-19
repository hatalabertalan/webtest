Feature: PHP travels subscribe form checker

  Background:
    Given the home page is opened
    And the page bottom is focused
    And the cookie policy is accepted

  Scenario Outline: Subscriber form validation errors
    Given the 'Subscription' field is filled with '<email>'
    When the 'Subscribe' button is clicked
    Then the '<errorMessage>' subscription validation error is shown
    Examples:
      | email  | errorMessage              |
      |        | Please add email!         |
      | @      | Please add correct email! |
      | a@.com | Please add correct email! |
      | @b.com | Please add correct email! |