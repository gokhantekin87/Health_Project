Feature: US_015 Admin tarafından hasta oluşturma ve düzenleme

    Scenario: 1- Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
      Given Admin medunna url e gider
      And Admin accountButton u tiklar
      And Admin sign in secenegini tiklar
      When Admin username ve password ile giris yapar
      And Admin item&titles butonumu tıklar
      And Admin patient secenegini tıklar
      And Admin yeni hasta olustur kutusunu tıklar
      And Admin  hasta bilgilerini girer
      And Admin kayıt butonuna tıklar
      Then Admin save butonunun gorulemez oldugunu test eder
      And Admin sayfayi kapatir

      Scenario: 2- Yönetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,
      Description, Created Date, User, Country and state / City" gibi hasta bilgilerini görebilir.

        Given Admin medunna url e gider
        When Admin accountButton u tiklar
        And Admin sign in secenegini tiklar
        And Admin username ve password ile giris yapar
        And Admin item&titles butonumu tıklar
        And Admin patient secenegini tıklar
        And Admin yeni hasta olustur kutusunu tıklar
        And Admin  hasta bilgilerini girer
        And Admin kayıt butonuna tıklar
        Then Admin hastanın SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and stateCity bilgilerini görür
        And Admin sayfayi kapatir

      Scenario:3- Hasta oluşturulduğunda veya güncellendiğinde yukarıdaki öğelere data girişi yapılabilmeli.
        Given Admin medunna url e gider
        Then Admin accountButton u tiklar
        And Admin sign in secenegini tiklar
        And Admin username ve password ile giris yapar
        And Admin item&titles butonumu tıklar
        And Admin patient secenegini tıklar
        And Admin ıd basligina tıklar
        And Admin edit butonunu tiklar
        When Admin ogelerin secilebilir oldugunu gorur

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

    Scenario:5- "State", "US state" olmalı ve boş bırakılmamali
    Given Admin medunna url e gider
    When Admin accountButton u tiklar
    And Admin sign in secenegini tiklar
    And Admin username ve password ile giris yapar
    And Admin item&titles butonumu tıklar
    And Admin patient secenegini tıklar
    And Admin yeni hasta olustur kutusunu tıklar
    And Admin state dısındaki hasta bilgilerini girer
    And Admin kayıt butonuna tıklar
    And Admin save butonunu gorur

      Scenario: 6- Yönetici herhangi bir hastayı silebilir
      Given Admin medunna url e gider
      Then Admin username ve password ile giris yapar
      And Admin item&titles butonumu tıklar
      And Admin patient secenegini tıklar
      And Admin ıd basligina tıklar
      And Admin delete butonuna tıklar
      And Admin tekrar delete butonuna tıklar
      When Admin delete alertinin kayboldugunu gorur