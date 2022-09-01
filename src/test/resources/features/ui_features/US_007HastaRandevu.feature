Feature: US_007 Hastalar  Tarihli randevu olusturabilmelidir.


  @deneme @us_007tc_001 @gokhan
  Scenario: US_007 TC_001  Hastalar Guncel Tarihli randevu olusturabilmelidir.

    Given Kullanici "anaSayfa"ya gider
    When Kullanici profil simgesine tiklar
    And Kullanici Sign in sekmesine tiklar
    And Kullanici "ValidHastaUserName" ve "ValidHastaUserPassword" girisi yapar
    And Kullanici Sign in buttonuna tiklar
    And Kullanici MY PAGES(PATIENT)e tiklar
    And Kullanici Make an Appointment buttonuna tiklar
    And Kullanici telefon numarasi girer
    And Appointment DateTime kismina guncel tarih girer
    And Send an Appointment Request buttonuna tiklar
    Then Appointment registration saved yazisi gorulmeli
    And Kullanici sayfayi kapatir


  @deneme @us_007tc_002 @gokhan
  Scenario: US_007 TC_002 Hastalar 15 gun sonrasi icin randevu olusturabilmelidir.

    Given Kullanici "anaSayfa"ya gider
    When Kullanici profil simgesine tiklar
    And Kullanici Sign in sekmesine tiklar
    And Kullanici "ValidHastaUserName" ve "ValidHastaUserPassword" girisi yapar
    And Kullanici Sign in buttonuna tiklar
    And Kullanici MY PAGES(PATIENT)e tiklar
    And Kullanici Make an Appointment buttonuna tiklar
    And Kullanici telefon numarasi girer
    And Appointment DateTime kismina onbes gun sonraki tarih girer
    And Send an Appointment Request buttonuna tiklar
    Then Appointment registration saved yazisi gorulmeli
    And Kullanici sayfayi kapatir


  @deneme @us_007tc_003 @gokhan
  Scenario: US_007 TC_003 Hastalar 120 gun sonrasi icin randevu olusturabilmelidir.

    Given Kullanici "anaSayfa"ya gider
    When Kullanici profil simgesine tiklar
    And Kullanici Sign in sekmesine tiklar
    And Kullanici "ValidHastaUserName" ve "ValidHastaUserPassword" girisi yapar
    And Kullanici Sign in buttonuna tiklar
    And Kullanici MY PAGES(PATIENT)e tiklar
    And Kullanici Make an Appointment buttonuna tiklar
    And Kullanici telefon numarasi girer
    And Appointment DateTime kismina yuz yirmi gun sonraki tarih girer
    And Send an Appointment Request buttonuna tiklar
    Then Appointment registration saved yazisi gorulmeli
    And Kullanici sayfayi kapatir


  @deneme @us_007tc_004 @gokhan
  Scenario: US_007 TC_004 Hastalar 10 gün oncesi icin randevu olusturabilmelidir.


    Given Kullanici "anaSayfa"ya gider
    When Kullanici profil simgesine tiklar
    And Kullanici Sign in sekmesine tiklar
    And Kullanici "ValidHastaUserName" ve "ValidHastaUserPassword" girisi yapar
    And Kullanici Sign in buttonuna tiklar
    And Kullanici MY PAGES(PATIENT)e tiklar
    And Kullanici Make an Appointment buttonuna tiklar
    And Kullanici telefon numarasi girer
    And Appointment DateTime kismina on gun oncesi icin tarih girer
    And Send an Appointment Request buttonuna tiklar
    Then Appointment registration saved yazisi gorulmemeli

