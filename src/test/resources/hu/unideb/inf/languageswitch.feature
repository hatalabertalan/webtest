Feature: PHP travels language switcher

  Background:
    Given the home page is opened

    Scenario Outline: Change languages
      When the 'Language Switch' button is clicked
      And the '<language>' language is selected
      Then the '<welcomeText>' welcome text is shown
      Examples:
        | language   | welcomeText                                       |
        | Turkish    | Bir sonraki seyahatiniz için rezervasyon yapalım! |
        | Russian    | Давайте забронируем вашу следующую поездку!       |
        | Philippine | I-book natin ang iyong susunod na biyahe!         |
        | Korean     | 다음 여행을 예약합시다!                                     |

