@Notifikasi
Feature: Notifikasi
As a User, I want to check my notification

  @TC.NotifMobi.001
  Scenario: As A seller user want to verify red mark appears when there is a new notification
  Given User is on landing page
  When User tap notification navbar
  And User seller success login
  Then User can see the redmark there is new nootification
  
  @TC.NotifMobi.002
  Scenario: As A seller user want to verify notification about product success published
  Given User is on landing page
  When User tap notification navbar
  And User seller success login
  Then User can see the product success published
  
  @TC.NotifMobi.003
  Scenario: As A seller user want to verify notification about buyer make offer of the product
  Given User is on landing page
  When User tap notification navbar
  And User seller success login
  Then User can see notification the buyer make offer of the product
  
  @TC.NotifMobi.004
  Scenario: As A buyer user want to verify notification about seller accepted the product offered
  Given User is on landing page
  When User tap notification navbar
  And User buyer success login
  Then User can see notification about seller accepted the product offered
  
  @TC.NotifMobi.005
  Scenario: As A buyer user want to verify notification about seller rejected the product offered
  Given User is on landing page
  When User tap notification navbar
  And User buyer success login
  Then User can see notification about seller rejected the product offered
  
   @TC.NotifMobi.006
  Scenario: User want to move to account page from notification page
  Given User is on landing page
  When User tap notification navbar
  And User success login
  Then User tap akun button in the navbar
  And User can see akun page
  
  @TC.NotifMobi.007
  Scenario: User want to move to transaksi page from notification page
  Given User is on landing page
  When User tap notification navbar
  And User success login
  Then User tap transaksi button in the navbar
  And User can see transaksi page
  
   @TC.NotifMobi.008
  Scenario: User want to move to beranda page from notification page
  Given User is on landing page
  When User tap notification navbar
  And User success login
  Then User tap beranda button in the navbar
  And User can see beranda page