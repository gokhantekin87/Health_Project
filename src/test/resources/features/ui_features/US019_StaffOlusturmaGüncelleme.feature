Feature: US019 Staff Olusturma Güncelleme

  @TC001
  Scenario: Admin SSN kullanarak kayıtlı staff arayabilir
    Given kullanici medunna anasayfasinda
    And kullanici "adminUsername" ve "adminPassword" girerek giris yapar
    And Admin item&titles butonumu tıklar
    And admin staff buttonuna tıklar
    And admin create a new staff buttonuna tıklar
    And admin ssn "195-92-0816" deger girer
    Then admin Search User Buttonuna tıklar
    And kullanici 2 saniye bekler
    And admin kullanici bulundu yazisini kontrol eder
    And sayfayi kapatir



    @TC002
    Scenario: Tüm bilgiler doldurulmali
      Given kullanici medunna anasayfasinda
      And kullanici "adminUsername" ve "adminPassword" girerek giris yapar
      And Admin item&titles butonumu tıklar
      And admin staff buttonuna tıklar
      And admin create a new staff buttonuna tıklar
      And admin firstName "erko" girer
      And admin lastName "klock" girer
      And admin dogumGunu "24.02.1999 01:20" girer
      And admin phone bilgisi "0213123456" girer
      And admin cinsiyet "Female" secer
      And admin kan grubu "AB-" secer
      And kullanıcı adress bilgisi "615sk no27 " girer
      And admin personeli "hasta" tanimlar
      And user secim
      And ulke secimi
      And sehir secimi
      And admin Save buttona tiklar
      And sayfayi kapatir




      @TC003
      Scenario: Admin kullanici kisilerden bir kullanici secebilir
        Given kullanici medunna anasayfasinda
        And kullanici "adminUsername" ve "adminPassword" girerek giris yapar
        And admin girişinden userManagmente tıklar
        And Admin View buttonuna tıklar
        And User yazisini kontrol eder


        @TC004
        Scenario: Admin kullanici bilgilerinde güncelleme yapabilir
          Given kullanici medunna anasayfasinda
          And kullanici "adminUsername" ve "adminPassword" girerek giris yapar
          And admin girişinden userManagmente tıklar
          And admin edit buttonuna tıklar
          And kullanıcı lastName kutusuna "hastalık" bilgi girer
          And save button click
          And kullanici 2 saniye bekler
          And bilgilerin güncellendigini kontrol eder
          And sayfayi kapatir




          @TC005
          Scenario: Admin istedigi kullaniciyi silebilmeli
            Given kullanici medunna anasayfasinda
            And kullanici "adminUsername" ve "adminPassword" girerek giris yapar
            And admin girişinden userManagmente tıklar
            And admin kullaniciyi siler
            And kullanici 2 saniye bekler
            And kullanicinin silindigini kontrol eder
            And sayfayi kapatir



