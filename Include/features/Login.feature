Feature: LOG IN
  I want to log in on the web using my registered email address

	Scenario: LOG IN with registered email address after registration success
    Given I want to open website URL
  	Then I fill my email address
    And I fill my password
    Then I want to click sign in
    Then I want to verify my registration or login success