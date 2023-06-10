Feature: Register Functionality

  Scenario: To validate the login behaviour of the amazon website

    Given When I enter the url on the browser
    When  I click on arrow button
    Then I should be on amazon homepage with sign in button at the top right corner

    Given When I hover sign in on the menu bar
    When I click on the Sign in button
    Then I should be able to see the page asking for email and password

    Given When I am on the login page
    When I enter the email and password
    Then I should see the loggin page with user name on top right corner of the page
