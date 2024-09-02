
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
  
  @TC.RegMob.002
  Scenario: User register an account with invalid email format
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input invalid Email format 
  And Input valid Password field more than or equals to 6 digit
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Email tidak valid appear
  
  @TC.RegMob.003
  Scenario: "User register using email that has been registered on the application"							
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input Email has been registered 
  And Input valid Password field more than or equals to 6 digit
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message pop up appear
  
  @TC.RegMob.004
  Scenario: User want to register using invalid password (Fill password field less then 6 digit)					
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input valid Email field
  And User input password field less then 6 digit 
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Password harus lebih dari 6 karakter appear
  
  @TC.RegMob.005
  Scenario: User want to register with empty name field
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And User leave the name field
  And Input valid Email field
  And Input valid Password field more than or equals to 6 digit 
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Nama tidak boleh kosong
  
   @TC.RegMob.006
  Scenario: User want to register with empty email field
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And User leave Email field
  And Input valid Password field more than or equals to 6 digit 
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Email tidak boleh kosong
 
 @TC.RegMob.007
  Scenario: User want to register with empty password field
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input valid Email field
  And User leave Password field 
  And Input valid Nomor HP field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Password tidak boleh kosong
  
  @TC.RegMob.008
  Scenario: User want to register with empty phone number field
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input valid Email field
  And Input valid Password field more than or equals to 6 digit
  And User leave Nomor Hp field
  And Input valid Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Nomor telepon tidak boleh kosong
  
  @TC.RegMob.009
  Scenario: User want to register with empty city field
  Given User successfully uses the application on the device 
  When Open the app
  And Tap Account button
  And Tap the Masuk button
  And Tap Daftar button
  And Input valid Nama field
  And Input valid Email field
  And Input valid Password field more than or equals to 6 digit
  And Input valid Nomor HP field
  And User leave Kota field
  And Input valid Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Kota tidak boleh kosong
  
  @TC.RegMob.010
  Scenario: User want to register with empty address field
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
  And User leave Alamat field
  And Tap Daftar Regis button 
  Then User cannot register and warning message Alamat tidak boleh kosong