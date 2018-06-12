@LoginFeature

Feature: LoginTest

	@smoke @regression
  Scenario: As user i should login with valid login
    Given Launch the application
    When Enter the username and password
    And Click on Sign In button
    Then Shows the home screen
  
  @smoke @regression
  Scenario: As user i should get error for invalid login
    Given Launch the application
    When Enter the username and incorrect password
    And Click on Sign In button
    Then Does not show the home screen