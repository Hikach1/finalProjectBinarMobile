
@Profile
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
  
  @TC.PRF.004
  Scenario: As a user, I can edit profile on Nomor HP field
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User input nohp
  And User click simpan button
  Then User gets a notification that it was successful
  And User close application
  
  @TC.PRF.005
  Scenario: As a user, I can edit profile on Kota field
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User input city
  And User click simpan button
  Then User gets a notification that it was successful
  And User close application
  
  @TC.PRF.006
  Scenario: As a user, I can edit profile on Alamat field
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User input address
  And User click simpan button
  Then User gets a notification that it was successful
  And User close application
  
  @TC.PRF.007
  Scenario: As a user, I cant edit profile when the Nama field empty
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User delete name
  And User click simpan button
  Then User failed to save
  And User close application
  
  @TC.PRF.008
  Scenario: As a user, I cant edit profile when the Nomor HP field empty
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User delete nohp
  And User click simpan button
  Then User failed to save
  And User close application
  
  @TC.PRF.009
  Scenario: As a user, I cant edit profile when the Kota field is empty
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User delete city
  And User click simpan button
  Then User failed to save
  And User close application
  
  @TC.PRF.010
  Scenario: As a user, I cant edit profile when the Alamat field is empty
  Given User open application
  When User has successfully logged in
  And User click pen profile button
  Then User should be navigated to the Account Information page
  When User delete address
  And User click simpan button
  Then User failed to save
  And User close application
  
  