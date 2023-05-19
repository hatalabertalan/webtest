Feature: Phptravels account type check

  Background:
    Given the home page is opened

    Scenario Outline: Account types are pre selected in signup forms
      When the 'Account' button is clicked
      And the '<accountType>' signup button is clicked
      Then the '<accountType>' account type is selected in form
      Examples:
        | accountType |
        | Customer    |
        | Agent       |
        | Supplier    |