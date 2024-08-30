#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@SecondhandMobile
Feature: User want to registration account secondhand mobile app 

  @TC.RegMob.001
  Scenario: User register an account correctly
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input valid Email field
  And Input valid Password field more than or equals to 6 digit
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User account is register and success log in the application
 
