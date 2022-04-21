Feature: I as a user require to make a reservation from the Stays tab.

  Scenario: I as user can not follow if the field place filter is empty
    Given I as user must be in a BOOKING Stay page
    When I select the botton Search with the field place empty
    Then I will see the same page

Scenario: I as user want to select a place in a field place
  Given I as user must be in a BOOKING Stay page
  When I enter the value of the place to stay
    | place                                  |
    | Cartagena de Indias, Bolívar, Colombia |
@test3
  Scenario: I as user want to select search bottom
    Given I as user must be in a BOOKING Stay page
    When I enter the value of the place to stay
      | place                                  |
      | Cartagena de Indias, Bolívar, Colombia |
    Then I can to select the bottom Search