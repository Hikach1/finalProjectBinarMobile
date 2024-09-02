@Login
Feature: Login
As A User, I want to login to homepage of secondhand mobile

  @TC.LoginMob.001
  Scenario: User want to login using correct credential direct navigate to akun page.
  Given User succesfully launch in landing page
  When User click button akun on navbar
  And User click masuk button on login validation page
  And User input valid email "SansTestKa11@gmail.com"
  And User input valid password "123456"
  And User click masuk button
  Then User succesfully login and can see the akun page
  
  @TC.LoginMob.002
  Scenario: User want to login using correct credential direct navigate to transaksi page.
   Given User succesfully launch in landing page
  When User click button transaksi on navbar
  And User click masuk button on login validation page
  And User input valid email "SansTestKa11@gmail.com"
  And User input valid password "123456"
  And User click masuk button
  Then User succesfully login and can see the transaksi page
  
  @TC.LoginMob.003
  Scenario: User want to login using correct credential direct navigate to notifikasi page.
   Given User succesfully launch in landing page
  When User click button notifikasi on navbar
  And User click masuk button on login validation page
  And User input valid email "SansTestKa11@gmail.com"
  And User input valid password "123456"
  And User click masuk button
  Then User succesfully login and can see the notifikasi page
  
  @TC.LoginMob.004
  Scenario: User want to login using correct credential direct navigate to tambah produk baru page.
   Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User input valid email "SansTestKa11@gmail.com"
  And User input valid password "123456"
  And User click masuk button
  Then User succesfully login and can see the form tambah produk page
  
  @TC.LoginMob.005
  Scenario: User want to login using incorrect credential direct navigate to tambah produk baru page.
   Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User input invalid email "tes"
  And User input invalid password "1"
  And User click masuk button
  Then User cannot login and warning message email tidak valid appear
  
  @TC.LoginMob.006
  Scenario: User want to login using invalid email and valid password direct navigate to tambah produk baru page.
   Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User input invalid email "tes"
  And User input valid password "123456"
  And User click masuk button
  Then User cannot login and warning message email tidak valid appear
  
  @TC.LoginMob.007
  Scenario: User want to login using valid email and invalid password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User input valid email "SansTestKa11@gmail.com"
  And User input invalid password "1234"
  And User click masuk button
  Then User cannot login and warning message password harus lebih dari 6 karakter appear
  
  @TC.LoginMob.008
  Scenario: User want to login with empty email and password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User doesn't fill in the email field ""
  And User doesn't fill in the password field ""
  And User click masuk button
  Then User cannot login and warning message email tidak boleh kosong appear
  
  @TC.LoginMob.009
  Scenario: User want to login with empty email and input valid password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User doesn't fill in the email field ""
  And User input valid password "123456"
  And User click masuk button
  Then User cannot login and warning message email tidak boleh kosong appear
  
  @TC.LoginMob.010
  Scenario: User want to login with empty email and input invalid password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User doesn't fill in the email field ""
  And User input invalid password "123"
  And User click masuk button
  Then User cannot login and warning message email tidak boleh kosong appear

  @TC.LoginMob.011
  Scenario: User want to login with input valid email and empty password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User doesn't fill in the email field "SansTestKa11@gmail.com"
  And User doesn't fill in the password field ""
  And User click masuk button
  Then User cannot login and warning message password tidak boleh kosong appear

  @TC.LoginMob.012
  Scenario: User want to login with input invalid email and empty password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User doesn't fill in the email field "SansTestKa11"
  And User doesn't fill in the password field ""
  And User click masuk button
  Then User cannot login and warning message email tidak valid appear
  
  @TC.LoginMob.013
  Scenario: User want to login with input incorrect email and valid password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User doesn't fill in the email field "SansTestKa@gmail.com"
  And User input valid password "123456"
  And User click masuk button
  Then User cannot login and warning pop up appear
  
  @TC.LoginMob.014
  Scenario: User want to login with input incorrect email and incorrect password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User input incorrect email "SansTestKa@gmail.com"
  And User input incorrect password "123456789000"
  And User click masuk button
  Then User cannot login and warning pop up appear
  
  @TC.LoginMob.015
  Scenario: User want to login with input incorrect email and empty password direct navigate to tambah produk baru page.
  Given User succesfully launch in landing page
  When User click button tambah produk on navbar
  And User click masuk button on login validation page
  And User input incorrect email "SansTestKa@gmail.com"
  And User doesn't fill in the password field ""
  And User click masuk button
  Then User cannot login and warning message email tidak boleh kosong appear
  
  