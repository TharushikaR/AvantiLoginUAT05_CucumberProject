Feature: Login with Valid Credentials
  # ctrl+shift+f - alignment/pretty format

@sanity @regression
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://demo.opencart.com/index.php"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "t.rathnayaka1995@gmail.com" and Password as "Rathnayaka@1995"
    And Click on Login button
    Then User navigates to MyAccount Page