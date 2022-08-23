Feature: US_015 Admin tarafından hasta oluşturma ve düzenleme

    Scenario: 1
      Given Admin medunna url e gider
      And Admin accountButton u tiklar
      And Admin sign in secenegini tiklar
      When Admin username ve password ile giris yapar
      And Admin item&titles butonumu tıklar
      And Admin patient secenegini tıklar
      And Admin yeni hasta olustur kutusunu tıklar
      And Admin  hasta bilgilerini girer
      And Admin kayıt butonuna tıklar
      Then Admin islem basarili uyarisini görür
      And Admin sayfayi kapatir
      Scenario:
        Given Admin medunna url e gider
        When Admin accountButton u tiklar
        And Admin sign in secenegini tiklar
        And Admin username ve password ile giris yapar
        And Admin item&titles butonumu tıklar
        And Admin patient secenegini tıklar
        And Admin yeni hasta olustur kutusunu tıklar
        And Admin  hasta bilgilerini girer
        And Admin kayıt butonuna tıklar
        And Admin listenin son sayfayasına Kullanici_register_sayfasina_gider
        Then Admin hastanın SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City bilgilerini görür"

      Scenario:
        Given Admin medunna url e gider
        Then Admin accountButton u tiklar
        And Admin sign in secenegini tiklar
        And Admin username ve password ile giris yapar
        And Admin item&titles butonumu tıklar
        And Admin patient secenegini tıklar
        And Admin  hasta bilgilerini girer
        And Admin kayıt butonuna tıklar
        And Admin listenin son sayfayasına gider
        And Admin hastanın oldugu satırda edit butonunu tıklar
        And Admin hastanın yeni bilgilerini girer
        And Admin kayıt butonuna tıklar
        Then Admin islem basarili uyarisini görür

  Scenario: Hasta için gerekli doktoru seçebilmeli ve randevuyu oluşturmalı.
    * Kullanici  "https://medunna.com/" adresine gider
    * Kullanici sag ustteki adam ikonuna tiklar
    * Kullanici Sign in e tiklar
    * Kullanici username ve password girer
    * Kullanici 'Sign in' butonuna tiklar
    * Kullanici My PAGES yazisina tiklar
    * kullanici Search Patient a tiklar
    * Kullanici sayfadaki Show Appointments kismina tiklar
    * Kullanici sayfadaki Edit kismina tiklar
    * Kullanici doktor secebilmeli
    * Kullanici save tusuna basar

    Scenario:
    Given Admin medunna url e gider
    When Admin accountButton u tiklar
    And Admin sign in secenegini tiklar
    And Admin username ve password ile giris yapar
    And Admin item&titles butonumu tıklar
    And Admin patient secenegini tıklar
    And Admin yeni hasta olustur kutusunu tıklar
    And Admin state dısındaki hasta bilgilerini girer
    And Admin kayıt butonuna tıklar
    And Admin islem basarili uyarisini görür
