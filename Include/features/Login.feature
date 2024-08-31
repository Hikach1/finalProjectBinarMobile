
@Application @Login @Smoke
Feature: Login
  As a user, I can login in SecondHand

  @UserLoginSuccess
  Scenario: As a user, I can login
  Given User is on the homepage
  When User click icon profile button
  And User click masuk login button
  Then User should be navigated to the login page
  When User input email
  And User input password
  And User click masuk button
  Then User has successfully logged in direct