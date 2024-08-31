
@Application @ProductOffer @Smoke
Feature: Product Offer
  As a user, I can product offer in SecondHand

  @TC.PO.001
  Scenario: Clicking the Saya tertarik dan ingin nego button as a Logged-in User
  Given User open application
  When User has successfully logged in
  And User click homepage icon
  And User input searchbar
  And User click result searchbar
  And User click nego
  Then User should be navigated to cart popup page
  And User close application