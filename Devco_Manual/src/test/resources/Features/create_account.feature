Feature: Create Account
  As a user i need to create the account correctly in Booking page

  @manual
  @manual-result:passed
  Scenario: Create an Account in booking page website
    Given The user must be on the Booking home page.
    When I fill the fields correctly and select the bottom create an account
    Then I should see the account ready

