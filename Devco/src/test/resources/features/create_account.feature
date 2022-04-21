Feature: Create Account
  As a user i need to create the account correctly in Booking page

  Scenario: Select the bottom Hazte una cuenta
    Given The user must be on the Booking home page.
    When I select the bottom Hazte una cuenta
    Then I should see the Inicia sesión o crea una cuenta text


  Scenario: Select the bottom Continuar con e-mail with the email field empty
    Given The user must be on the Create account page
    When  I select the bottom Continuar con e-mail
    Then I will see a error message

  Scenario: Select the bottom Continuar con e-mail with the email field and  select the bottom Create an account the password fields empty
    Given The user must be in a password section page
    When  I select the bottom Create an account
    Then  I will see a error message password


  Scenario: Incorrectly fill in the passwords fields
    Given The user must be in a password section page
    When the user must fill and fields
      | password | secondPassword |
      | contra   | contra         |

    Then The user must see the different error message

    @TEST4
  Scenario: Incorrectly fill in the passwords fields
    Given The user must be in a password section page
    When the user must fill and fields with the data
      | password              | secondPassword         |
      |    Contrasena123/     | Cuntrasena123/         |

    Then The user must see a error message password

