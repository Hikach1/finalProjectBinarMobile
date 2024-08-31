
@Application @Profile @Smoke
Feature: Profile
  As a user, I can view and edit my Account Information in SecondHand

  @TC.PRF.001
  Scenario: As a user, I can view Akun Saya page
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  And User close application
  
  @TC.PRF.002
  Scenario: As a user, I can edit Profile Photo
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User input photo profile
  Then User gets a notification that it was successful
  And User close application
  
  @TC.PRF.003
  Scenario: As a user, I can edit profile on Nama field
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User input name
  And User click simpan button
  Then User gets a notification that it was successful
  And User close application
  