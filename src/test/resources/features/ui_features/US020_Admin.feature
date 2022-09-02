Feature: US_020 Admin; "User management" menüsünden,
  kullanıcı Active eder ve gerekli rolleri oluşturur.


  Scenario: TC01 Kullanici Kullanici basarili bir sekilde kayit olur
    Given Admin medunna ana sayfasina gider
    When  Yeni kayit yapilir
    And Kullanici sayfayi kapatir

  Scenario: TC02 AdminN kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.
    Given Admin medunna ana sayfasina gider
    When Admin hesap butonunu tiklar
    Then Admin sign in butonunu tiklar
    And Admin gecerli username ve sifresini girer
    And Admin sing in butonuna tiklar
    And Admin Administration butonunu tiklar
    And Admin User management butonunu tiklar
    And Admin viev butonunu tiklar
    And Admin, kayıtlı kişilerin firstname lastname email gibi bilgileri gorur
    And Admin Admin Create or edit a user sayfasina gider Activated secer
    And Admin rollerini ADMIN, USER PATIENT, STAFF ve PHYSICIAN olarak atar
    And Admin kullaniciyi siler
    And Kullanici sayfayi kapatir