
@ProductOffer
Feature: Product Offer
  As a user, I can product offer in SecondHand

  @TC.PO.001
  Scenario: Click Product without Logging In
  Given User open application
  When User click homepage icon
  And User input searchbar
  And User click result searchbar
  Then User should be navigated to the product cart page
  And User close application
  
  
  @TC.PO.002
  Scenario: Click Product as a Logged-in user
  Given User open application
  When User has successfully logged in
  And User click homepage icon
  And User input searchbar
  And User click result searchbar
  Then User should be navigated to the product cart page
  And User close application
  
  
  @TC.PO.003
  Scenario: Clicking the Saya tertarik dan ingin nego button without Logging In
  Given User open application
  When User click homepage icon
  And User input searchbar
  And User click result searchbar
  And User click nego
  Then User should be navigated to the login page
  And User close application
  
  
  @TC.PO.004
  Scenario: Clicking the Saya tertarik dan ingin nego button as a Logged-in User
  Given User open application
  When User has successfully logged in
  And User click homepage icon
  And User input searchbar
  And User click result searchbar
  And User click nego
  Then User should be navigated to cart popup page
  And User close application
  
  
  @TC.PO.005
  Scenario: Sending a Negotiation Request via the Saya tertarik dan ingin nego button as a Logged in user
  Given User open application
  When User has successfully logged in
  And User click homepage icon
  And User input searchbar
  And User click result searchbar
  And User click nego
  Then User should be navigated to cart popup page
  When User input negotiation price
  And User click send button
  Then User should be navigated to the product cart page
  And User close application
  
  
  @TC.PO.006
  Scenario: Submitting a Negotiation Request with a Price of zero
  Given User open application
  When User has successfully logged in
  And User click homepage icon
  And User input searchbar
  And User click result searchbar
  And User click nego
  Then User should be navigated to cart popup page
  When User input negotiation zero price
  And User click send button
  Then User should be navigated to the product cart page
  And User close application
  
 