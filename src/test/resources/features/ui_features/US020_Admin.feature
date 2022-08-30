Feature: US_020 Admin; "User management" menüsünden,
  kullanıcı Active eder ve gerekli rolleri oluşturur.


  Scenario: TC01 Kullanici Kullanici basarili bir sekilde kayit olur
    Given AdminN medunna ana sayfasina gider
    When  Yeni kayit yapilir
    And Kullanici sayfayi kapatir

  Scenario: TC02 AdminN kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.
    Given AdminN medunna ana sayfasina gider
    When AdminN hesap butonunu tiklar
    Then AdminN sign in butonunu tiklar
    And AdminN gecerli username ve sifresini girer
    And AdminN sing in butonuna tiklar
    And AdminN Administration butonunu tiklar
    And AdminN User management butonunu tiklar
    And AdminN viev butonunu tiklar
    And AdminN, kayıtlı kişilerin firstname lastname email gibi bilgileri gorur
    And AdminN Admin Create or edit a user sayfasina gider Activated secer
    And AdminN rollerini ADMIN, USER PATIENT, STAFF ve PHYSICIAN olarak atar
    And AdminN kullaniciyi siler
    And Kullanici sayfayi kapatir