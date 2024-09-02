
@AddNewProduct
Feature: Add New Product
  As a user, I can edit and add new product in SecondHand

  @TC.ADD.001
  Scenario: Clicking the Add button with Complete and Valid Data
  Given User open application
  When User has successfully login
  And User click plus button
  Then User should be navigated to the Account Information page
  When User input product name
  And User input product price
  And User select product category
  And User input product address
  And User input product description
  And User input product photo
  And User click terbitkan button
  Then User add new product was successful
  And User close application
  #
  #
  #@TC.ADD.002
  #Scenario: Clicking the Add button with Alphanumeric Characters in the Description
  #Given User open application
  #When User has successfully login
  #And User click plus button
  #Then User should be navigated to the Account Information page
  #When User input product name
  #And User input product price
  #And User select product category
  #And User input product address
  #And User input product alphanumeric description
  #And User input product photo
  #And User click terbitkan button
  #Then User add new product was successful
  #And User close application
  #
  #
  #@TC.ADD.003
  #Scenario: Clicking the Add button without Logging In
  #Given User open application
  #When User click plus button
  #Then User should be navigated to the login page and should login
  #And User close application
  #
  #
  #@TC.ADD.004
  #Scenario: Clicking the Add button without Filling in the Product Name
  #Given User open application
  #When User has successfully login
  #And User click plus button
  #Then User should be navigated to the Account Information page
  #When User empty product name
  #And User input product price
  #And User select product category
  #And User input product address
  #And User input product description
  #And User input product photo
  #And User click terbitkan button
  #Then User add new product was unsuccessful
  #And User close application
  #
  #
  #@TC.ADD.005
  #Scenario: Clicking the Add button without Filling in the Product Price
  #Given User open application
  #When User has successfully login
  #And User click plus button
  #Then User should be navigated to the Account Information page
  #When User input product name
  #And User empty product price
  #And User select product category
  #And User input product address
  #And User input product description
  #And User input product photo
  #And User click terbitkan button
  #Then User add new product was unsuccessful
  #And User close application
  #
  #
  #@TC.ADD.006
  #Scenario: Clicking the Add button without Filling in the Product Description
  #Given User open application
  #When User has successfully login
  #And User click plus button
  #Then User should be navigated to the Account Information page
  #When User input product name
  #And User input product price
  #And User select product category
  #And User input product address
  #And User empty product description
  #And User input product photo
  #And User click terbitkan button
  #Then User add new product was unsuccessful
  #And User close application
  #
  #
  #@TC.ADD.007
  #Scenario: Clicking the Add button without Filling in the Product Category
  #Given User open application
  #When User has successfully login
  #And User click plus button
  #Then User should be navigated to the Account Information page
  #When User input product name
  #And User input product price
  #And User input product address
  #And User input product description
  #And User input product photo
  #And User click terbitkan button
  #Then User add new product was unsuccessful
  #And User close application
  #
  #
  #@TC.ADD.008
  #Scenario: Clicking the Add button without Uploading a Product Image
  #Given User open application
  #When User has successfully login
  #And User click plus button
  #Then User should be navigated to the Account Information page
  #When User input product name
  #And User input product price
  #And User select product category
  #And User input product address
  #And User input product description
  #And User click terbitkan button
  #Then User add new product was unsuccessful
  #And User close application
  #
  