
@Register
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
 
