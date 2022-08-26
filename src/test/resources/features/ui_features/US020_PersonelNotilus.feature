@US_020
Feature: PersonelNotilus

  Scenario:  TC_01_yeni kullanici bilgisi gorme
    Given admin giris sayfasina gider
    Then admin signs in tiklar
    And admin User Management a klik yaptıktan sonra Administrations a klik yapar
    And admin View butonuna klik yapar
    And admin sayfada kullaniciların bilgilerini dogrular
    Then admin uygulamayi kapatir

  Scenario: TC_02_kullanicilara yeni bir rol verme
    Given admin giris sayfasina gider
    Then admin signs in tiklar
    And admin User Management a klik yaptıktan sonra Administrations a klik yapar
    And admin Edit butonuna klik yapar
    And admin kullanicilara rol atar
    And admin save butonuna klik yapar
    Then admin uygulamayi kapatir

  Scenario: TC_03_kullanici aktive etme
    Given admin giris sayfasina gider
    Then admin signs in tiklar
    And admin User Management a klik yaptıktan sonra Administrations a klik yapar
    And admin Edit butonuna klik yapar
    And admin kullanicinin durumunu aktif eder
    Then admin uygulamayi kapatir


  @delete_user
  Scenario: TC_04_kullanici silme
    Given kullanici registration page sayfasina gider
    Given kullanici gecerli bir SSN number "ssn" numarasi girer
    And kullanici "firstname" olarak gecerli bir ad girer
    And kullanici gecerli bir"lastname" olarak soyad girer
    And kullanici gecerli bir "username" olarak kullanici ismi girer
    And kullanici gecerli bir "email" olarak email adresi girer
    And kullanici "password" olarak yeni bir sifre girer ve "password" olarak onaylar
    And kullanici register butonuna tıklar
    Then kullanici kayit başarılı mesajini görmelidir
    Then killanici browseri kapatir
    Given admin medunna login page sayfasina gider
    Then admin signs in tiklar
    And admin User Management a klik yaptıktan sonra Administrations a klik yapar
    And admin kullaniciyi siler
    Then admin uygulamayi kapatir

