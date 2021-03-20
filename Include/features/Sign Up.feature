Feature: Sign Up
  I want to register myself on the web using my email address

  Scenario Outline: REGISTER ON WEB USING GIVEN NAME
    Given I want to open website URL
    Then I fill my email address with my <name>
    And I click create an account button
    And I fill first <name> and last name
    And I want to verify my email is correct
    And I want to set my password
    And I want to set my birthdate
    And I want to receive special offer from partner
    Then I want to set <name> as name in Address section
    And I want to fill address info
    And I want to set my mobile
    Then I click on register
    And I want to verify my registration or login success

    Examples: 
      | name  |
      | Peter |
