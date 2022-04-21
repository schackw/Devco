Feature:I as a user require to make a reservation from the Stays tab.

  @manual
  @manual-result:passed
  Scenario: Validate that you can select a room if the accommodation is available.
    Given that the user selects the date of accommodation
    When The user select hotel and select the number of rooms
    Then The user can see the number selected one

  @manual
  @manual-result:passed
  Scenario: validate that the user can not continue, if he does not fill in the fields
    Given that the user be in the section your data
    When The user select the bottom siguiente ultimos pasos with the empty fields
    Then The user should be see a message error about the empty fields

  @manual
  @manual-result:passed
  Scenario: validate that the user can not continue, if he just fill the name field
    Given that the user be in the section your data
    When The user fill the name field and select the bottom siguiente ultimos pasos
    Then The user should be see a message error about the anothers fields

  @manual
  @manual-result:passed
  Scenario: validate that the user can not continue, if he just fill the lastname field
    Given that the user be in the section your data
    When The user fill the lastname field and select the bottom siguiente ultimos pasos
    Then The user should be see a message error about the anothers fields
  @manual

  @manual-result:passed
  Scenario: validate that the user can not continue, if he not fill the email field
    Given that the user be in the section your data
    When The user fill the fields except the email field and select the bottom siguiente ultimos pasos
    Then The user should be see a message error about the email field

  @manual
  @manual-result:passed
  Scenario: validate that the user can not continue, if he fill the email field with a incorrect domain
    Given that the user be in the section your data
    When The user fill the email fields with a incorrect domain and select the bottom siguiente ultimos pasos
    Then The user should be see a message error about the email

  @manual
  @manual-result:passed
  Scenario: validate that the user can  continue, if he fill the fields correctly
    Given that the user be in the section your data
    When The user fill the fields and select the bottom and select the bottom siguiente ultimos pasos
    Then The user should be in the other section

  @manual
  @manual-result:passed
  Scenario: validate that the user can not   continue, if he dont fill the mobile number field
    Given that the user be in the section last step
    When The user dont fill the mobile number field
    Then The user should be see a message error about the mobile number

  @manual
  @manual-result:passed
  Scenario: validate that the user can not enter alphanumeric values into mobile number field
    Given that the user be in the section last step
    When The user Enter letters into mobile number field
    Then The user should be see the mobile number field empty

  @manual
  @manual-result:passed
  Scenario: validate that the user can  enter the number into mobile number field
    Given that the user be in the section last step
    When The user Enter the number into mobile number field
    Then The user should be see the number into mobile number field


  @manual
  @manual-result:passed
  Scenario: validate that the user can not enter alphanumeric values into number card field
    Given that the user be in the section last step
    When The user Enter letters into number card field
    Then The user should be see the mobile number field empty


  @manual
  @manual-result:failed
  Scenario: validate that the user can select the card SCOTIBANK
    Given that the user be in the payment section
    When The user select the the card SCOTIBAN
    Then The user should be see the error about the card selected

  @manual
  @manual-result:passed
  Scenario: validate that the user can not continue, if he select the bottom completa la reserva with empty fields in the payment section
    Given that the user be in the payment section
    When The user select the bottom completa la reserva with empty fields in the payment section
    Then The user should be see the error about the payment section

  @manual
  @manual-result:passed
  Scenario: validate that the user can not  type more than 3 characters into CVC code
    Given that the user be in the payment section
    When The user type more than 3 characters into CVC code
    Then The user should be see the error about the CVC Code