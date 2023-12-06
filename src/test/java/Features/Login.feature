@TrendyolLogin
Feature: Trendyol Register Test Cases

  @LoginMail
  Scenario Outline: Login with email and password
    Given User at login page
    When Enter a valid "<email>" email field
    When Enter a valid "<password>" password field
    Then Click on the sign up
    Examples:
      |email                    |password    |
      |examplemail@gmail.com    |password123456      |




